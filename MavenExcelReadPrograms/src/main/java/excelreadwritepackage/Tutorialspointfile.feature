#Gherkin Code
Feature: Automating TutorialsPoint Website

  Scenario: Automate all forms inside the Automation Practice Form
    Given Connect to the TutorialsPoint Website
    And Validate the sections in the forms
    When Update the result in the report
    Then Close the driver and browser
