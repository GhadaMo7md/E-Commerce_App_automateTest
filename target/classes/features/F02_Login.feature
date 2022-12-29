@Regression
Feature: F02_Login | user login to e-commerce website

  #Scenario 1
  Scenario: User could Log in with valid email and password and could Logout
    Given user open the login page
    When user enter valid Email and Password
    And user click on login button
    Then user should be login successfully
    And User click on logout button
    Then User could logout successfully

  #Scenario 2
  Scenario: User should not log in with invalid email and password
    Given user2 open the login page
    When user2 enter valid Email and Password
    And user2 click on login button
    Then user2 should not login successfully


