#!/usr/bin/bash
max=5
bold=$(tput bold)
normal=$(tput sgr0)

printf "Running Exercise01 [python, c, java, csharp, php]\n" &&
read input
if [[ $input == "python" ]]; then

    printf "\n" &&
    echo ------------------------ &&
    printf "${bold}Python\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb python python/exercise01.py
    done
elif [[ $input == "c" ]]; then

    echo ------------------------ &&
    printf "${bold}C/C++\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb ./cpp/exercise01
    done
elif [[ $input == "java" ]]; then

    echo ------------------------ &&
    printf "${bold}Java\n${normal}" && cd java &&

    for i in `seq 1 $max`
    do
        ../bench.rb java exercise01
    done
elif [[ $input == "csharp" ]]; then
# cd ../ &&

    echo ------------------------ &&
    printf "${bold}C#\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb dotnet ./csharp/exercise01/bin/Debug/netcoreapp2.1/publish/exercise01.dll
    done
elif [[ $input == "php" ]]; then

    echo ------------------------ &&
    printf "${bold}php\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb php php/exercise01.php
    done
else
    echo "Finished"
fi