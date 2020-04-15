package com.ScenarioOutline;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		
		features= {"src/test/resources/ScenarioOutlineFF/"},
		glue= {"com/ScenarioOutline/"},
		
		plugin={"pretty",
				"html:target/cucumber-html report",
				"json:target/cucumber-report6.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"
		
		       }
		
		
		)


public class RunScenarioOutlineTest {
	
	
	
	
	
	

}
