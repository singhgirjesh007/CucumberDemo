
  package testrunners;
  
  import org.junit.runner.RunWith;
  
  import io.cucumber.junit.Cucumber; 
  import io.cucumber.junit.CucumberOptions;
  
  @RunWith(Cucumber.class)
  
  @CucumberOptions( 
		  features = {"src/test/resources/appfeatures/Search.feature"},
		  glue = {"stepdefinitions","myhooks"},
		  plugin = {"pretty", "junit:target/MyReports/report.xml" ,"json:target/MyReports/report.json" },
		  dryRun = false,
		  monochrome = false
  
  
  
  )
  
  
  
  public class AmazonTest {
  
  
  
  }
 