@Regression
Feature: F02_Login | user login to e-commerce website

  Scenario: User could log in with valid email and password
    Given user goes to login page
    When user enters "aessam@gmail.com" and "123456"
    And user click on login button
    Then user should be login successfully
    And user go to the home page


  Scenario: User should not log in with invalid email and password
    When user enters "ali@gmail.com" and "wrongPassword"
    And user click on login button
    Then user should not login successfully


