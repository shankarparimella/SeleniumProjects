#Gherkin Code
Feature: Testing https://www.saucedemo.com website

Scenario: Test Login form with multiple inline inputs 
Given Open Saucedemo1 website
When Enter Saucedemo1 credentials <Username> <Password>
And Submit Saucedemo1 credentials
Then Check is login successful

Examples: 
|Username|Password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|
|error_user|secret_sauce|
|visual_user|secret_sauce|