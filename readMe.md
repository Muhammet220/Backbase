# HOW TO RUN Backbase (QA Automation Assignment)

# Project Settings
    - I used Selenium to automate browser for this task
    - Language - Java 1.8
    - Build Management Tool - Maven
    - Framework - BDD Cucumber Java
    - Model - Page Object Pattern

1. Install Java version 1.8
    - Open cmd / powershell
    - $ brew cask install adoptopenjdk8
    - NOT: If you can't install it from brew, download and install java1.8

2. Java Home
    1. Java Home for mac >>> https://www.youtube.com/watch?v=zu5Zd9_o_hY&ab_channel=CoolITHelp
        - To check the version >>> echo $SHELL
        - If your path shows ‘/bash’ type these command >>>
          echo "export JAVA_HOME=$(/usr/libexec/java_home -v1.8.0)"
        - If your path shows ’/zsh’ type these command >>>
          echo "export JAVA_HOME=$(/usr/libexec/java_home -v1.8.0)"  ~/.zshrc source ~/.zshrc
    2. Java Home for windows >>>  https://www.youtube.com/watch?v=EtR0tgNH3sY

3. Install Maven
    - brew install maven
    - NOT: If you can't install it from brew, please go to this website >> https://maven.apache.org/install.html

4. HOW TO RUN UI TEST CASES
    1. Run with Maven
        - mvn clean  >>  Delete Target folder
        - mvn verify >>  Test cases of the tag you specified in CukesRunner will work.
        - mvn clean test -Cucumber.filter.tags="@test" >> Running all @test tag test cases

   2.Run with CukesRunner class
        - Go to CukesRunner class
        - If you want all scenarios to work use @test annotation
        - Click Run button

    ![](C:\Users\mami\Desktop\HTML report\CukesRunner.png)

        - If you want a specific scenario to work, use that task's annotation
        - Click Run button
      
5.How To Get Report
    Cucumber Report : Click the Run button in CukesRunner and after the test is over:
       ![](C:\Users\mami\Desktop\Html_report.png)
       
6.How to fix a failing test when UI has changed
    1. All locaters are in the page folder.Also UI codes are in the step_definitions folder.
       If you get any error, please check error message where in the result area.
     

7.Explain why you decided to automate what you’ve automated, why you decided to test what you’ve tested, what test strategies you decided to use and why?
    I selected the CRUD operations.
    The user should be able to:
        -Create a new article
        -Read the created article
        -Update the created article
        -Delete the created article
    These are the main functionalities of the website.
    We have lots of test strategies just like:
        -Equivalent class partitioning
        -Boundary value analysis
        -State transition
        -Pairwise testing
        -Data cycle test
        -Error guessing
        ...
    According to chosen automated tests I chose Data Cycle Test for Overall functionality, connectivity , suitability. 

