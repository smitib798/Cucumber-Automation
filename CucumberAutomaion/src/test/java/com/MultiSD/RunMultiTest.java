package com.MultiSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		
		features= {"src/test/resources/MultiFF/"},
		glue= {"com/MultiSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-html report",
				"json:target/cucumber-report5.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
		
		       }
		
		
		)


public class RunMultiTest {
	
	
	
	
	
	

}
