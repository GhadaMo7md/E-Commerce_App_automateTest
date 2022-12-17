@Login
Feature: User should be able to Login to the system

      #Test Scenario 1
  Scenario: User Login with valid data
    Given user open browser
    And navigate to Login page
    When User enter valid username and password
    And User click on login button
    Then User could login successfully
    And User click on logout button
    Then User could logout successfully

  


     #Test Scenario 2
  Scenario: User Login with in-valid username and password
    Given