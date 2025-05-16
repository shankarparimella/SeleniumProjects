#Gherkin Code

Feature: Validation of BugBug website
Scenario: Validate the BugBug website login functionality using below list of credentials in examples

Given Open BugBug website 
When Enter BugBug website login credentials <Email> and <Password>
And Validate the BugBug website login 
Then Update the validation status

Examples: 
|Email|Password|
|shankar@gmail.com|shankar123|
|Jyohti@gmail.com|jyothi123|
|Girish@gmail.com|girish123|
|Mihir@gmail.com|Mihir123|