package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features/",
		glue={"com.stepdefinition","com.hooks"},
		plugin={"json:target/cucumber.json"}, //plugin = {"json:target/cucumber.json"}//will report in the target folder
		monochrome=true,
		dryRun=false,//dryRun will run without opening the browser
		//strict=true,//
		tags="@smoke"//@regression/@functional so with the "tags" will runs only specific section 
		)             //but if tags put before the feature that will runs all scenarios of the Feature 

public class MyRunner extends AbstractTestNGCucumberTests{

}
