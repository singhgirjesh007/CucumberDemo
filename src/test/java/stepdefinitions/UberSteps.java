package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {
	
	@Given("User want to select a car type {string} from uber application")
	public void user_want_to_select_a_car_type_from_uber_application(String string) {
		
		System.out.println("Car Selected");
	    
	}

	@When("User selects car {string} and pick up a point {string} to {string}")
	public void user_selects_car_and_pick_up_a_point_to(String sedan, String start, String end) {
		System.out.println("Car Selected" + sedan + " "+ start + " "+ end);
	}

	@Then("Driver starts journey")
	public void driver_starts_journey() {
		System.out.println("driver starts the journet to destination");
	}

	@Then("Drive ends the journet")
	public void drive_ends_the_journet() {
		System.out.println("driver end the journet to destination");
	}

	@Then("CUstomer pay {int} USD")
	public void c_ustomer_pay_usd(Integer int1) {
		System.out.println("Custome rpay the amount");
	    
	}

}
