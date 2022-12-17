@Regression
Feature: User should be able to change currency
  Scenario: User change currency
    Given Click on currency dropdown
    Then Currency changes successfully
    And Change currency again