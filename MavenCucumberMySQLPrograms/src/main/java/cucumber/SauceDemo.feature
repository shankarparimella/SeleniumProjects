#Glerkin Code
Feature: Testing SauceDemo website

  Scenario: Add products to Cart and proceed till payment
    Given Open SauceDemo website
    When Enter SauceDemo credentials
    And Submit SauceDemo credentials
    When Add all products into Cart
    And Check products added in the Cart
    When Click on Checout
    And Enter user details
    When Click on Continue
    And Click on Finish
    Then Click on Back Home
