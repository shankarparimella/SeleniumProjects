#Gherkin Code
Feature: Testing Login form with multiple inputs

  Scenario: Check Login formt with multiple inputs
    Given Will open Orange HRM login page
    When Will enter <Username> and <Password>
    And Will submit credentials
    Then Will display home page
    
    Examples:
      | Username | Password   |
      | shankar  | shankar123 |
      | jyothi   | jyothi123  |
      | Admin    | admin123   |
