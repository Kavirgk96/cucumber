package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mensstepdef extends Baseclass {
	@Given("the user is on the LimeRoad homepage")
	public void the_user_is_on_the_lime_road_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		 launchUrl("https://www.limeroad.com/feed?feed_kyc=true&top_level=Men");
	}
	@When("the user clicks on the Men")
	public void the_user_clicks_on_the_men() {
	    // Write code here that turns the phrase above into concrete actions
		Actions actions = new Actions(driver);
	WebElement menspage= driver.findElement(By.xpath("//a[@href='/men-clothing?src_id=navdeskMen__1']"));
	   actions.moveToElement(menspage).perform();
	}
	@Then("the user should be redirected to the Mens page")
	public void the_user_should_be_redirected_to_the_mens_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user able to see menspage");
	    
	}
	
	@When("the user clicks on the Ethnic Wear submodule")
	public void the_user_clicks_on_the_ethnic_wear_submodule() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 
		 WebElement ethnic=driver.findElement(By.xpath("(//a[contains(text(),\"ethnic wear\")])[2]"));
		 ethnic.click();
		 Thread.sleep(3000);
		 
	}
	@Then("the user should be redirected to the Men's Ethnic Wear page")
	public void the_user_should_be_redirected_to_the_men_s_ethnic_wear_page() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement dress=driver.findElement(By.xpath("//a[@data-prod-id='19382623']"));
		
		
		js.executeScript("arguments[0].scrollIntoView(true);",dress);
		dress.click();
		Thread.sleep(3000);
		 WebElement addtocart=driver.findElement(By.xpath("//div[@data-pgn='Add to Cart']"));
		 addtocart.click();
	

		//js.executeScript("window.scrollBy(0,3000)");
	    // Write code here that turns the phrase above into concrete actions

	}






}
