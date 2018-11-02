#!/usr/bin/bash
max=5
bold=$(tput bold)
normal=$(tput sgr0)

printf "Running Exercise02 [python, c, java, csharp, php]\n" &&
read input
if [[ $input == "python" ]]; then

    printf "\n" &&
    echo ------------------------ &&
    printf "${bold}Python\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb python python/exercise02.py
    done
elif [[ $input == "c" ]]; then

    echo ------------------------ &&
    printf "${bold}C/C++\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb ./cpp/exercise02
    done
elif [[ $input == "java" ]]; then

    echo ------------------------ &&
    printf "${bold}Java\n${normal}" && cd java &&

    for i in `seq 1 $max`
    do
        ../bench.rb java exercise02
    done
elif [[ $input == "csharp" ]]; then
# cd ../ &&

    echo ------------------------ &&
    printf "${bold}C#\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb dotnet ./csharp/exercise02/bin/Debug/netcoreapp2.1/publish/exercise02.dll
    done
elif [[ $input == "php" ]]; then

    echo ------------------------ &&
    printf "${bold}php\n${normal}" &&

    for i in `seq 1 $max`
    do
        ./bench.rb php php/exercise02.php
    done
else
    echo "Finished"
fi