#Gherkin
Feature: Automating Swaglabs login page

  Scenario: Enter predefined credentials and validate them
    Given Open swaglab website
    When Enter swaglab credentials<Username>and<Password>
    And Validate swaglab credentials
    Then Show the result

    Examples:
    |Username|Password|
    |standard_user|secret_sauce|
    |locked_out_user|secret_sauce|