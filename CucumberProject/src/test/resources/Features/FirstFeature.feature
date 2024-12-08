#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: Test the login functionality of Facebook application
#Scenario: Test the valid login
#Given User is on login page
#When User enters "@yahoo.com" and ""
#And Click on login button
#Then User should land on login page

  Feature: Test the login functionality of Facebook application
  Scenario Outline: Test the valid login2
   Given User is on login page
  When User enters <userName> and <password>
  And Click on login button
  Then User should land on login page
  Examples:
   | userName                 | password   |
   | *** | *** |
   |*** | *** |
  

    
    
    
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
