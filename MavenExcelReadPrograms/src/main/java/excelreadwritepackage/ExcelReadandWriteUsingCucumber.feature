#Gherkin Code
Feature: Excel Read and Write Practise
Scenario: Read credentials from Excel validate the login page and update the login status in same excel file

Given Setup login page
When Enter excel credentials
And Validate the excel credentials
Then Update the excel file