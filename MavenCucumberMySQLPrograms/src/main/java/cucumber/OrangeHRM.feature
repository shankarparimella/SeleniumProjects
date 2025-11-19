#Gherkin Code
Feature: Testing of OrangeHRM website

  Background: Testing Loginform
    Given Open OrangeHRM1 website
    When Enter OrangeHRM1 credentials
    And Submit OrangeHRM1 credentials
    Then User navigated to OrangeHRM1 website

  Scenario: Testing PIM module
    When Open PIM module
    And Click on Add PIM button
    When Enter Employee details
    And Select Profile picture
    Then Submit Employee details

  Scenario: Testing Leave module
    When Open Leave module
    And Click on Assigne Leave button
    When Enter Leave details
    And Select from and to dates
    Then Submit Leave details
