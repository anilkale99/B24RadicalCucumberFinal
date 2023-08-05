package com.basic;

import java.sql.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMS_StepDef {
	
	@Given("Login with admin user")
	public void login_with_admin_user() {
		System.out.println("step: Login with admin user");
	}
	@Given("Login with admin user1")
	public void login_with_admin_user1() {
		System.out.println("step: Login with admin user");
	}
	
	@Then("validate user gettting searched")
	public void validate_user_gettting_searched() {
		System.out.println("step: validate user gettting searched");
	}

	@When("Go to PIM Tab")
	public void go_to_pim_tab() {
		System.out.println("step: Go to PIM Tab");
	}

	@Given("validate user Not gettting searched.")
	public void validate_user_not_gettting_searched() {
	    System.out.println("step: validate user Not gettting searched.");
	    //Assert
	}




}
