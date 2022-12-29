@Regression
Feature: F05_Forget Password  | user could reset the password


  Scenario: User could reset the password successfully
    Given user goes to login page
    And user click on forgot password
    When user enters his registered email
    And press on Recover button
    Then user should reset his password successfully


