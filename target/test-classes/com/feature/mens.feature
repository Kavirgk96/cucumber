@menspage
Feature: Navigate to Ethnic Wear

  Scenario: Click Men's Module
    Given the user is on the LimeRoad homepage
    When the user clicks on the Men
    Then the user should be redirected to the Mens page

  Scenario: Click Submodule - Ethnic Wear
    When the user clicks on the Ethnic Wear submodule
    Then the user should be redirected to the Men's Ethnic Wear page