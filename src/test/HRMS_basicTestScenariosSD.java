package com.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HRMS_basicTestScenariosSD {
	
	@Given("^Login with admin user$")
	public void Login_with_admin_user() throws InterruptedException {
		System.out.println("step: Login with admin user ");
		Thread.sleep(20000);
	}
	
//	@Given("Login with admin user")
//	public void login_with_admin_user() throws InterruptedException {
//		System.out.println("step11: Login with admin user ");
//		Thread.sleep(20000);
//	    
//	}

	
	@When("^Go to PIM TAB$")
	public void Go_to_PIM_TAB() {
		System.out.println("step: Go to PIM TAB ");
	}

}
