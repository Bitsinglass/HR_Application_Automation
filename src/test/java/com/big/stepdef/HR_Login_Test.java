package com.big.stepdef;

import com.big.pageObjects.HR_Login_PO;
import io.cucumber.java.en.*;

public class HR_Login_Test {
	
	HR_Login_PO obj = new HR_Login_PO();
	
	@Given("I am on HRApp Login Screen")
	public void i_am_on_hr_app_login_screen() {
	    System.out.println("User is on login screen");
	}

	@When("I enter Username and Password")
	public void i_enter_username_and_password() throws InterruptedException {
	    obj.Enter_username("Admin@bitsinglass.com");
	    obj.Enter_password("@Rules04");
	    obj.submit();
	}

	@Then("I am logged in")
	public void i_am_logged_in() {
	    obj.Login_verification();
	}

}
