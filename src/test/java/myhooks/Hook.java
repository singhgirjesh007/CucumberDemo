package myhooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;


public class Hook {
	
	@Before(order=0)
	public void launchBrwoser(Scenario sc) {
		System.out.println("launch browser");
		System.out.println(sc.getName());
	}
	
	@Before(order=1)
	public void launchUrl(Scenario sc) {
		System.out.println("url");
		System.out.println(sc.getName());
	}
	
	@After(order=1)
	public void teardown_browser(Scenario sc) {
		System.out.println("close browser");
		
	}
	
	@After(order=0)
	public void teardown_logout(Scenario sc) {
		System.out.println("logout");
		
	}
	
	@BeforeStep
	public void takeSS() {
		System.out.println("take screen shots");
	}
	
	@AfterStep
	public void refershPage() {
		System.out.println("refersh page");
	}
	
	

}
