  Feature: Test the login functionality of Facebook application
  Scenario: Test the valid login3 using Data Table
    Given User is on login page
    When User enters credentials using Data Table
      | vrushketh_akre@yahoo.com | Nagpur123# |
    And Click on login button
    Then User should land on login page