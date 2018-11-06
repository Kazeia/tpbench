#!/usr/bin/bash
max=1
bold=$(tput bold)
normal=$(tput sgr0)

printf "Running Exercise06 [python, c, java, csharp, php]\n" &&
read input
if [[ $input == "python" ]]; then

    printf "\n" &&
    echo ------------------------ &&
    printf "${bold}Python\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb python python/exercise06.py
    done
elif [[ $input == "c" ]]; then

    echo ------------------------ &&
    printf "${bold}C/C++\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb ./cpp/exercise06
    done
elif [[ $input == "java" ]]; then

    echo ------------------------ &&
    printf "${bold}Java\n${normal}" && cd java &&

    for i in `seq 1 $max`
    do
        ../bench.rb java exercise06
    done
elif [[ $input == "csharp" ]]; then
# cd ../ &&

    echo ------------------------ &&
    printf "${bold}C#\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb dotnet ./csharp/exercise06/bin/Debug/netcoreapp2.1/publish/exercise06.dll
    done
elif [[ $input == "php" ]]; then

    echo ------------------------ &&
    printf "${bold}php\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb php php/exercise06.php
    done
else
    echo "Finished"
fi
