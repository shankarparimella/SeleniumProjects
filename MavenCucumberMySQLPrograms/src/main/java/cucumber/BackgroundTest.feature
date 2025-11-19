#Glerkin Code
Feature: Testing OrangeHRM website

  Background: Testing loginform
    Given Open OrangeHRM login page
    When Enter OrangeHRM credentials
    And Click on OrangeHRM login button
    Then Navigated to Home page

  Scenario: Check logout functionality
    When Click on Welcome link
    Then Click on logout button

  Scenario: Verify quicklaunch toolbar
    When Click on Dashboard link
    Then Verify quicklaunch toolbar
