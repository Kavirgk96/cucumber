package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Log_In_Page extends Baseclass {
	
	
public Log_In_Page()
	
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[text()='SHOP MEN']")
	private WebElement shopmen;
	
	public WebElement getShopmen()
	{
		return shopmen;
	}
	
	@FindBy(xpath="//a[@href='/men-clothing?src_id=navdeskMen__1']")
	private WebElement men;
	
	public WebElement getmen()
	{
		return men;
	}
	
	@FindBy(xpath="(//a[contains(text(),'ethnic wear')]) [2]")
	private WebElement ethnic;
	
	public WebElement getethnic()
	{
		return ethnic;
	}
	
	@FindBy(xpath="//img[@id='20451112']")
	private WebElement dress;
	
	public WebElement getdress()
	{
		return dress;
	}
	
	@FindBy(xpath="(//span[contains(text(),'S')])[7]")
	private WebElement size;
	
	public WebElement getsize()
	{
		return size;
	}

	
	
	
	@FindBy(xpath="//div[contains(text(),'ADD TO CART')]")
	private WebElement addtocart;
	
	public WebElement getaddcart()
	{
		return addtocart;
	}

}
