package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.Baseclass;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\learn\\eclipse-workspace\\cucumberframework\\src\\test\\java\\com\\feature\\lime.feature", 
glue = "com.stepdef",
dryRun=false,
monochrome=true,
tags=("@smoketest,@menspage"),



plugin={"pretty",
		
		"json:jsonfolder/reports.json",
		"html:htmlfolder/reportsh.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	
}
		
		)


public class Runner extends Baseclass {
	
@BeforeClass
public static void browserLaunch() {
	launchBrowser("edge");
}


}
