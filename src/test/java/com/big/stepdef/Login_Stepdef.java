package com.big.stepdef;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;

import com.big.pageObjects.LoginPage;
import com.big.utils.TestReusables;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Login_Stepdef extends TestReusables{
	
	LoginPage lp = new LoginPage();
	 @Given("^I am on Login Screen$")
	    public void i_am_on_login_screen() throws Throwable {
	        System.out.println("I am on Login screen");
	    }
	 
	 
	 @When("^User enters Credentials to LogIn$")
		public void user_enters_testuser__and_Test(DataTable table) throws Throwable {
		     //handling data table my logic 
		     //table returning or converting to list of map of objects
	 		 List<Map<String, String>> data = table.asMaps(String.class, String.class);
		     for (Map<String, String> data2 : table.asMaps(String.class, String.class))
		     	{
			    	 //System.out.println("user "+data2.get("username").toString());
			    	 lp.Login(data2.get("username").toString(), data2.get("password").toString()); 
		     	}
		     }
	 
	  
	    @Then("^I Should reached to Home Page$")
	    public void i_should_reached_to_home_page() throws Throwable {
	    	System.out.println("I Should reached to Home Page");
	    }

}
