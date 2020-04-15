package com.ShareData;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		
		features= {"src/test/resources/ShareDataFF/"},
		glue= {"com/ShareData/"},
		
		plugin={"pretty",
				"html:target/cucumber-html report",
				"json:target/cucumber-report7.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"
		
		       }
		
		
		)


public class RunShareDataTest {
	
	
	
	
	
		

}
