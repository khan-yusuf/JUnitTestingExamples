# software_testing_pset1
Yusuf Khan 
(yk7862)

## To unzip file
Double click on compressed zip file to unzip into folder with source code files

Note that this project was set up through maven for simplicity with running tests in non-IDE environements

## Install maven if not installed
Can install maven at the official website: https://maven.apache.org/install.html

For macOS with brew: ***brew install mvn***

## To run tests in command line
cd into project directory: ***cd software_testing_pset1***

run command: ***mvn clean test*** which will build project dependencies and run tests

Note: may need to follow this command with ***mvn test*** if tests do not run with previous command

## VSCode run tests
Make sure gradle and maven have indexed properly, may have to wait for everything to sync up...

Go into Testing tab in side bar and click PLAY triangle to run all tests