package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/appfeatures/Registration.feature",
		glue = {"stepdefinitions" , "myhooks"},
		plugin = {"pretty"},
		tags= "",
		monochrome = false,
		dryRun = false
		
		
		)




public class UserReg {

}
