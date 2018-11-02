#!/usr/bin/bash
cd cpp/ &&
printf "\nBuild C/C++ Projects\n" &&
echo "-----------------------------" &&
printf "\n" &&
g++ -o exercise01 exercise01.cpp &&
g++ -o exercise02 exercise02.cpp &&
g++ -o exercise03 exercise03.cpp &&
g++ -o exercise04 exercise04.cpp &&
cd ../java &&
printf "\nBuild Java Projects\n" &&
echo "-----------------------------" &&
printf "\n" &&
javac exercise01.java &&
javac exercise02.java &&
javac exercise03.java &&
javac exercise04.java &&
cd ../csharp &&
printf "\nBuild CSharp Projects\n" &&
echo "-----------------------------" &&
printf "\n" &&
cd exercise01/ && dotnet publish &&
cd ../exercise02/ && dotnet publish &&
cd ../exercise03/ && dotnet publish &&
cd ../exercise04/ && dotnet publish &&
printf "\nBuild Success.\n".