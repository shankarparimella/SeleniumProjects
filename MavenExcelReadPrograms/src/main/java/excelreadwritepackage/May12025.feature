#Gherkin Code
Feature: Automating tutorialspoint login page using Excel credentials
Scenario: Enter excel credentials and validate them

    Given Open tutorialspoint website on 1st May
    When Enter tutorialspoint Excel credentials
    And Validate tutorialspoint Excel credentials
    Then Update the result in Excel file
