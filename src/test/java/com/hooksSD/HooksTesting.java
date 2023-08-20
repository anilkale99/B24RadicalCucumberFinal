package com.hooksSD;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksTesting {
	
	@Before("@third") //tagged hooks in cucumber
	public void connectDB() {
		System.out.println("connecting to DB");
		System.out.println("opening the browser");
		System.out.println("cleaning some folder and its content.");
	}
	
	@Given("my first step")
	public void my_first_step() {
	    System.out.println("my first step");
	}
	@And("my second step")
	public void my_second_step() {
		System.out.println("my second step");
	}
	@Then("my third step")
	public void my_third_step() {
		System.out.println("my third step");
	}
	
	
	@After("@third") //tagged hooks in cucumber
	public void disconnectDB() {
		System.out.println("disconnecting to DB");
		System.out.println("close the browser");
		System.out.println("cleaning some folder and its content.");
	}

}
