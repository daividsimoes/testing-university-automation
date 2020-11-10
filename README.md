# Testing University Automated Tests Project

The propose of this project is be like a getting started to who is 
starting with automation testing and doesn't know how it works.

This project was developed using some technologies and frameworks like: 
**Java 1.8, Spring Boot, Cucumber and Selenium**.


# Requirements
1. JDK 1.8
2. Apache Tomcat 8.5
3. IntelliJ IDE
4. Chrome and/or Firefox

# Install Cucumber for Java
1. Open IntelliJ IDE
2. Go to File -> Settings
3. Go to Plugins
4. Search for "Cucumber for Java"
5. Install

![](/src/main/resources/images/cucumber_for_java.png)

# How to start Web Application
The web application is in the directory: src/main/resources/apache-tomcat-8.5.57-with-deployed-application

1. Unzip the application in some folder in your computer.
2. Go to apache-tomcat-8.5.57/bin
3. Execute startup script 
(startup.sh for Mac and Linux or startup.bat for Windows)

# How to execute tests
You can execute a specific feature or all features

To execute specific feature, open the Runner of this feature and than click
"run <class_name>"

![](/src/main/resources/images/run_test.png)

To execute all features, right click on package in the directory:
/src/test/java/<package> and than click
"Run Tests in <package_name>"

![](/src/main/resources/images/run_all_tests.png)