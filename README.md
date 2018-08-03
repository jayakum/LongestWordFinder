## Project Overview
LongestWordFinder program finds the longest word and it's length in the given sentence.
If there are multiple words with same longest length, then all the words are returned separated by comma (,)

If user doesn't provide any input or provides invalid input like special characters, then appropriate message is returned.

## Assumptions
Only the letters (a-zA-Z) are considered to be forming valid words.

## Technical Dependencies
Languages and Frameworks : Java 8 (jdk1.8.0_144), TestNG 6.3.1, Log4j 2.11.1, git 2.11

Tools : IntelliJ IDEA 2017.2.4 

Operating System : macOS Sierra

## Prerequisites
jdk 1.8

command prompt or any IDE like Intellij, to run tests

git (if user wants to clone the project. git is not needed if user downloads the project zip file from github)

All other necessary libraries are provided in $PROJECT_BASE_DIRECTORY/lib folder

## Project Structure
Project is written in java 8 using TestNG as test runner and log4j for logging message

Main Program LongestWordFinder.java is located in $PROJECT_BASE_DIRECTORY/src/com/longestWordFinder folder

Test Program LongestWordFinderTest.java is located in $PROJECT_BASE_DIRECTORY/test/com/longestWordFinder folder 

Project is compiled and executable jar is located in $PROJECT_BASE_DIRECTORY/out/artifacts/LongestWordFinder_jar folder

Test Data is located in $PROJECT_BASE_DIRECTORY/resources/data 

TestNG DataProviders provide the test data to 
``````````
public void testGetLongestWordAndLength(String testInput, String expectedResult)
``````````
which will test driver function and validate the result
``````````
String getLongestWordAndLength(String input) 
``````````

## Test Data Overview
Test is getting test data dynamically from allTestCases.txt file located in $PROJECT_BASE_DIRECTORY/resources/data 
There are 10 test cases in this file. 

User can add more test cases in the same file in correct format and run the tests.
User can also provide any other test data text file during runtime using VM option in command-line or in IDE

Test Data file follows following format:

Test Input Sentence|Longest Word - Expected Longest Word : Length - Expected Longest Word Length|Comment about the test case (Optional)

Please note there is space before Expected Longest Word Length

For eg. 
````````
Have a nice evening|Longest Word - evening : Length - 7
````````
will provide "Have a nice evening" as input to driver program LongestWordFinder.java, which will return result in the format
Longest Word - Expected Longest Word : Length - Expected Longest Word Length

This result will be compared against expected result in test data file,i.e., Longest Word - evening : Length - 7

## Running the tests
In order to get project in local machine, open github url:
https://github.com/jayakum/LongestWordFinder/

User can either download the project directly or clone the repository.

To download project:
click 'Clone or Download' button and click 'Download ZIP'.
Unzip to preferred project home location

To clone project:
Run below command in directory where project will be saved
``````````
git clone https://github.com/jayakum/LongestWordFinder.git
``````````

## Run tests from terminal/command prompt
Go to project base directory and run below command:
````````````
$ java -cp "out/artifacts/LongestWordFinder_jar/LongestWordFinder.jar" org.testng.TestNG testng.xml (For Mac)

$ java -cp "out//artifacts//LongestWordFinder_jar//LongestWordFinder.jar" org.testng.TestNG testng.xml (For Windows)
````````````
It will run all the test cases
``````````````
[TestNG] Running:
  /LongestWordFinder/testng.xml


===============================================
LongestWordFinderTestSuite
Total tests run: 9, Failures: 0, Skips: 0
===============================================
``````````````
By default, test data is coming from $PROJECT_BASE_DIRECTORY/resources/data/allTestCases.txt. If you want to provide your own test data file in runtime, use VM option as below
````````````
$ java -DtestDataFilePath=path/to/test/data/file -cp "out//artifacts//LongestWordFinder_jar//LongestWordFinder.jar" org.testng.TestNG testng.xml (For Mac)

$ java -DtestDataFilePath=path//to//test//data//file -cp "out//artifacts//LongestWordFinder_jar//LongestWordFinder.jar" org.testng.TestNG testng.xml (For Windows)
````````````
User can also run the main program directly and provide input for each run, by using below command in project base directory:
````````````
$ java -cp "out/artifacts/LongestWordFinder_jar/LongestWordFinder.jar" com.longestWordFinder.LongestWordFinder (For Mac)

$ java -cp "out//artifacts//LongestWordFinder_jar//LongestWordFinder.jar" com.longestWordFinder.LongestWordFinder (For Windows)
````````````
It will prompt user to enter input sentence as below 
``````````````
[INFO ] 2018-07-31 20:38:35.745 [main] LongestWordFinder - Please enter input sentence:

``````````````

## Run tests from IDE (Intellij)
Open Intellij

Click File -> New Project from Existing Sources

Browse downloaded project in local machine and select it

Follow the IDE 'Next' prompts

Give project name

Select all sources, libraries and modules in next screens

Select project SDK 1.8

Click Finish.

Open Project Explorer and run 'LongestWordFinderTest.java' under test directory or Run testng.xml in project base directory.
It will run all the test cases.

To run main program directly, run 'LongestWordFinder.java' under src directory and give user input in the console  

## Reporting
Once tests are run, test results are documented in $PROJECT_BASE_DIRECTORY/test-output folder.
Results can be viewed in xml or html format

To view html report from command prompt, use below command
``````````
$ open $PROJECT_BASE_DIRECTORY/test-output/index.html (For Mac)

$ start $PROJECT_BASE_DIRECTORY//test-output//index.html (For Windows)
``````````

It will open index.html in system default browser

From IDE, run index.html file directly from Project Explorer.





