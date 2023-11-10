package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/appfeatures/AmazonBackground.feature",
		glue = {"stepdefinitions"},
		tags= "",
		plugin = {"pretty"}
		
		
		
		)


public class UberTest {

}
