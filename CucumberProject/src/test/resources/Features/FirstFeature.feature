#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Test the login functionality of Facebook application
Scenario: Test the valid login
Given User is on login page
When User enters UserName and Password
And Click on login button
Then User should land on login page


Scenario: Test the valid login2
Given User is on login page
When User enters UserName and Password
And Click on login button
Then User should land on login page
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

