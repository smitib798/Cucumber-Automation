package com.Hooks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		
		features= {"src/test/resources/HooksFF/"},
		glue= {"com/Hooks/"},
		
		plugin={"pretty",
				"html:target/cucumber-html report",
				"json:target/cucumber-report3.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
		
		       }
		
		
		)


public class RunHooksTest {
	
	
	
	
	
	

}
