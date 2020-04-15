package com.MultipleScenarioSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		
		features= {"src/test/resources/MultipleScenariosFF/"},
		glue= {"com/MultipleScenarioSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-html report",
				"json:target/cucumber-report4.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
		
		       }
		
		
		)


public class RunMultipleFeatureTest {
	
	
	
	
	
	

}
