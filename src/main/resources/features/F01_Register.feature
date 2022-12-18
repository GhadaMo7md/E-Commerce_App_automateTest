@Regression
Feature: User should be able to register to the system
  Scenario: User Register with valid data
    Given user navigate to Register Page
    When User enter valid data
    Then user should register successfully

