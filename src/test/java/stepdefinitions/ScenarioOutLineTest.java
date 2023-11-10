package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutLineTest {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	   
	}

	@When("I complete action")
	public void i_complete_action() {
	   
	}

	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
	   System.out.println(string);
	}
 
	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String string) { 
	   System.out.println(string);
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    
	}

	

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
	    System.out.println(string);
	}


}
