#Gherkin Code
Feature: ExcelReadWriteReport program

  Scenario: Writing program to Read and Write data from Excel and also create Report of it
    Given Open practise website
    When Enter credentials into the practise website
    And Generate the report
    Then Close the driver
