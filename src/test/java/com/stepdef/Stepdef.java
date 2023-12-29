package com.stepdef;

import com.baseclass.Baseclass;
import com.pom.Log_In_Page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdef extends Baseclass {
	
	
	Log_In_Page ip=new Log_In_Page();
	
	
       @When("User lanuch the Ur:{string}")
			public void user_lanuch_the_ur(String string) {
			    // Write code here that turns the phrase above into concrete actions
			   launchUrl(string);
			}

	  @And("User clicks on shop men")
	  public void user_clicks_on_shop_men() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(3000);
	    ip.getShopmen().click();
	    
	}

	  
	  @Given("a user is on the Men's section of the website")
	  public void a_user_is_on_the_men_s_section_of_the_website() throws InterruptedException {
	      // Write code here that turns the phrase above into concrete actions
		  
		 
		  mouseHoverElement(ip.getmen());
		  Thread.sleep(3000);
	  }

	  @When("the user navigates to the Ethnic Wear submodule")
	  public void the_user_navigates_to_the_ethnic_wear_submodule() throws InterruptedException {
	      // Write code here that turns the phrase above into concrete actions
	    
		  ip.getethnic().click();
		  Thread.sleep(3000);
	  }

	  @When("selects a specific ethnic wear item")
	  public void selects_a_specific_ethnic_wear_item() throws InterruptedException {
	      // Write code here that turns the phrase above into concrete actions
		//scrollDown(ip.getdress());
		// Thread.sleep(3000);
		 ip.getdress().click();
		 Thread.sleep(3000);
	  }

	  @When("adds the item to the cart")
	  public void adds_the_item_to_the_cart() throws InterruptedException {
	      // Write code here that turns the phrase above into concrete actions
		  ip.getsize().click();
		  Thread.sleep(3000);
		  ip.getaddcart().click();
		  
		  
	     
	  }

}
