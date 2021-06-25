package com.telecom.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features//",
                 glue = "com.telecom.stepdefinition",
                 plugin = "html:target",
                 monochrome = true, 
                 dryRun = false, 
                 tags = {"@run"}) 
   
public class TestRunner {

}
