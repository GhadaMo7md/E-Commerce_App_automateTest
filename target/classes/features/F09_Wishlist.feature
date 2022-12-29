@Regression
Feature: F09_Wishlist | user add products to wishlist

  Scenario:  user could add different products to Wishlist
    When user clicks on the wishlist button
    Then the product is added to wishlist and success message appears


  Scenario:  user could click on "Wishlist" Tab
    When user clicks on the wishlist button
    And user waits until success message disappears and clicks on wishlist Tab
    Then product is existed in the wishlist