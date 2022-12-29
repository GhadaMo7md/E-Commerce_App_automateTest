@Regression
Feature: User should be able to change currency between US and Euro currencies

##  Scenario 01
#  Scenario: Logged User could choose US currency
#    When user click on the currency drop-down list and choose the US currency
#    Then US dollar symbol is chosen and displayed on all products
#
##  Scenario 02
#  Scenario: Logged User could choose Euro currency
#    When user click on the currency drop-down list and choose the Euro currency
#    Then Euro symbol is chosen and displayed on all products


  Scenario: user need to change the currency to ERU
#    Given User enter to login page
#    And User Enter valid username and valid password
#    And User able to login successfully
    When User click on Currency drop-down-list and select Euro
    Then Euro Symbol is shown on the 4 products displayed in Home page


