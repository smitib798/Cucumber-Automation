package com.FirstFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		
		features= {"src/test/java/com/FirstFeatureFile/"},
		glue= {"com/FirstFeatureFile/"},
		
		plugin={"pretty",
				"html:target/cucumber-html report",
				"json:target/cucumber-report2.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"
		
		       }
		
		
		)


public class RunMyFirstFeatureTest {
	
	
	
	
	
	

}
