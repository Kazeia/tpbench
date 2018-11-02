#!/usr/bin/env ruby
def mem(pid); `ps p #{pid} -o rss`.split.last.to_i; end
def cpu(pid); `ps p #{pid} -o %cpu`.split.last.to_i; end
t = Time.now
pid = Process.spawn(*ARGV.to_a)
mm = 0

Thread.new do
  mm = mem(pid)
  while true
    sleep 0.1
    m = mem(pid)
    mm = m if m > mm
  end
end

Process.waitall
STDERR.puts "%.3fs, %.3fMb, %.3f" % [Time.now - t, mm / 1024.0, cpu(pid)]
