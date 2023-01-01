@Regression
Feature: User should be able to filter with color
  Scenario: User filter with color
    Given Click on Appreal category
    When User click on Shoes category
    Then Shoes page category page opens successfully
    And User select color filter
    Then Color filter selected