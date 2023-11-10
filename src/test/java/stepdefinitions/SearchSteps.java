package stepdefinitions;

import amazonimplementation.Product;
import amazonimplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	
	Product product;
	Search search ;
	
	@Given("I have a search field")
	public void i_have_a_search_field() {
	    System.out.println("Step 1 : I am on search field");
	}

	@When("I search for a product with {string} and price {int}")
	public void i_search_for_a_product_with_and_price(String productName, Integer price) {
		System.out.println("Step 2 : I search for a product with " + productName + "price " + price);
		
		product = new Product(productName , price);
		
	}

	@SuppressWarnings("deprecation")
	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		
		System.out.println("Product with name {string} should be displayed " + productName);
		search = new Search();
		
		String name =search.disaplayProduct(product);
		
		Assert.assertEquals(name, productName);
		
		
	    
	}


}
