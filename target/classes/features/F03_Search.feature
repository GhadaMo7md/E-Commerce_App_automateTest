
@Regression
Feature: F03_Search | Logged users could Search products

#  Background: user enters "ghada@gmail.com" and "ghada222"

  Scenario Outline: Logged user could search using product name
    Given user clicked on Login & enter valid Email and Password
    When user click on search box and write "<productName>"
    And user press on the search button
    Then "<productName>" should appear successfully
    Examples:
      |productName|
      |    book   |
      |   laptop  |
      |    nike   |


  Scenario Outline: Logged user could search for product using sku
    When user click on search box and write "<serialNumber>"
    And user press on the search button
    And user click on the product in search result
    Then "<serialNumber>" should appear successfully in product page
    Examples:
      |  serialNumber  |
      |    SCI_FAITH   |
      |    APPLE_CAM   |
      |    SF_PRO_11   |