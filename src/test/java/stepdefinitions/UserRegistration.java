package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration {
	
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	   System.out.println("user on registration");
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<List<String>> userList = dataTable.asLists(String.class);
		for(List<String> ls : userList) {
			System.out.println(ls);
		}
	}
	
	@When("User enters following user details with hashmap")
	public void user_enters_following_user_details_with_hashmap(io.cucumber.datatable.DataTable dataTable) {
	        List<Map<String, String>> userList =  dataTable.asMaps(String.class,String.class);
	        System.out.println(userList);
	        System.out.println(userList.get(0).get("fName"));
	        System.out.println();
	        for (Map<String,String> m : userList) {
	        		   m.forEach((k,v)-> {
	        			   System.out.println("Key " +k + " value " + v);
	        		   }); 
	        	
	        }
	   
	}

	@Then("user regeustration successful")
	public void user_regeustration_successful() {
	    
	}


}
