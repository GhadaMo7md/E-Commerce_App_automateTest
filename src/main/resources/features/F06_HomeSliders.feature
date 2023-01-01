@Regression
Feature: F06_Home Sliders | user clicks on home sliders


# Scenario: first slider is clickable on home page
#   When user clicks on the Nokia Lumia 1020 slider
#   Then user should be directed to Nokia Lumia 1020 page
#
#
#
# Scenario: second slider is clickable on home page
#   When user clicks on the iPhone slider
#   Then user should be directed to iPhone page

  Scenario: Click on First Slider
    When User Click on Nokia Slider
    Then Nokia URL shall be appeared

  Scenario: Click on Second Slider
    When User click on iphone slider
    Then Iphone URL shall be appeared