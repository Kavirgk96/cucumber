package com.baseclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	
	public static WebDriver driver;
	public static Actions act;
	public static JavascriptExecutor jse;
	public static WebDriver launchBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome")
				) {
			
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox"))
		{

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("edge"))
		{

			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;
	}
	
	

	public static void mouseHoverElement(WebElement element) {	
	
			act = new Actions(driver);
		
		act.moveToElement(element).build().perform();		
	}
	
	
	public static void scrollDown(WebElement element) {
		jse = (JavascriptExecutor)driver;	
		jse.executeScript("arguments[0].scrollIntoView(true)",element );
		
	}
	
	
	
	
	
	

	

}
