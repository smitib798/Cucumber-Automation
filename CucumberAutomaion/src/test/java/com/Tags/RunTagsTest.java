package com.Tags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		tags= {"@Important"},//Tagged with Feature
		//tags= {"@Database"},//Tagged with Only Database
		//tags= {"@Smoke","@Regression"},//AND Condition-Contains both Smoke and Regression
		//tags= {"@Smoke,@Regression"},//OR Condition-Contains either Smoke or Regression
		features= {"src/test/resources/TagsFF/"},
		glue= {"com/Tags/"},
		
		plugin={"pretty",
				"html:target/cucumber-html report",
				"json:target/cucumber-report8.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"
		
		       }
		
		
		)


public class RunTagsTest {
	
	
	
	
	
	

}
