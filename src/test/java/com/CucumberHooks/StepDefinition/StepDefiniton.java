package com.CucumberHooks.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefiniton {
	
	@Before(order=1)
	public void setUp() {
		System.out.println("User Launches Chrome Browser First");
		System.out.println("User Enters the URL -First");
	}
	@After(order=1)
	public void tearDown() {
		System.out.println("User Close the Browser- First");
		}
	@Before(order=2)
	public void setUp1() {
		System.out.println("User Launches Chrome Browser- Second");
		System.out.println("User Enters the URL- Second");
	}
	@After(order=2)
	public void tearDown1() {
		System.out.println("User Close the Browser- Second");
		}
	@Before("@First")
	public void setUpFirst() {
		System.out.println("Only Before first scenario");
	}
	@After("@First")
	public void tearDownFirst() {
		System.out.println("Only After first scenario");
	}
	@Given("User Clicks on Contacts Page")
	public void user_Clicks_on_Contacts_Page() {
	    System.out.println("User Clicks on contacts Page");
	}

	@When("User Enters Contacts Details")
	public void user_Enters_Contacts_Details() {
	    System.out.println("User Enters the Contacts Details");
	}

	@Then("Contact is Created")
	public void contact_is_Created() {
	 System.out.println("Contact is Created");  
	}

	@Given("User Clicks on Deals Page")
	public void user_Clicks_on_Deals_Page() {
	    System.out.println("User Clicks on Deals Page");
	}

	@When("User Enters Deals Deatils")
	public void user_Enters_Deals_Deatils() {
	  System.out.println("User Enters Deals Details");
	}

	@Then("Deal is Created")
	public void deal_is_Created() {
	   System.out.println("Deal is Created");
	}

	@Given("User Clicks on Tasks Page")
	public void user_Clicks_on_Tasks_Page() {
	   System.out.println("User Clicks on Tasks Page");
	}

	@When("User enters Title NewTask{int} and Completion Percentage {int}")
	public void user_enters_Title_NewTask_and_Completion_Percentage(Integer int1, Integer int2) {
	  System.out.println("User enters Title and Completion Percentage");
	}

	@Then("User Clicks on Save button")
	public void user_Clicks_on_Save_button() {
	    System.out.println("Users Clicks on Save button");
	}


}
