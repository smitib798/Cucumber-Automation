package com.DatatableFormat;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		
		features= {"src/test/resources/DatatableFormatFeature/"},
		glue= {"com/DatatableFormat/"},
		
		plugin={"pretty",
				"html:target/cucumber-html report",
				"json:target/cucumber-report1.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		
		       }
		
		
		)


public class RunDatatableFormatTest {
	
	
	
	
	
	

}
