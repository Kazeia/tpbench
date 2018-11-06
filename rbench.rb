#!/usr/bin/env ruby
def mem(process); `ps p #{process} -o rss` end
def cpu(process); `ps p #{process} -o %cpu` end

# Initial Time
t = Time.now

# Process to Test
currentProcess = Process.spawn(*ARGV.to_a)

# Declare Initial Memory Variable
mm = 0

# Run process
Thread.new do
  mm = mem(currentProcess)
  while true
    sleep 0.1
    m = mem(currentProcess)
    mm = m if m > mm
  end
end

# Wait and print results
Process.waitall
STDERR.puts "%.3fs, %.3fMb, %.3f" % [Time.now - t, mm / 1024.0, cpu(currentProcess)]
