@smoketest
Feature: Limeroad  Order 
  Scenario: to click shop men

    When User lanuch the Ur:"https://www.limeroad.com/"
    And User clicks on shop men
    


  Scenario: Add Men's Ethnic Wear to Cart
    Given a user is on the Men's section of the website
    When the user navigates to the Ethnic Wear submodule
    And selects a specific ethnic wear item
    And adds the item to the cart
   
