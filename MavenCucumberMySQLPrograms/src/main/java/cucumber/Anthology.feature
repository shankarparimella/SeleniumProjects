#Glerkin Code
Feature: Testing Anthology website

Scenario: Testing Sales Enquiry form

Given Open Anthology website
When Click on Contact Us
And Open Sales Enquiry form
When Enter first name and last name
And Enter email address
When Enter business phone
And Enter title and role
When Enter industry
And Enter country
When Enter industry description
And Enter interest
When Enter help
And Select radio button
Then Click on Contact Us button