package com.big.stepdef;

import java.util.List;

import org.junit.runner.RunWith;

import com.big.pageObjects.GooglePO;
import com.big.utils.TestReusables;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

@RunWith(Cucumber.class)
public class GoogleStepdef {
//	GooglePO gpo = new GooglePO(TestReusables.driver);
	

    @Given("^User is on Login screen$")
    public void user_is_on_login_screen() throws Throwable {
        System.out.println("User is on Login");
    }

    @When("^User enters valid Username and password$")
    public void user_enters_valid_username_and_password() throws Throwable {
        //Lpo.login("jatin.bakshi@bitsinglass.com", "12346578");
    }

    @Then("^User Logins successfully$")
    public void user_logins_successfully() throws Throwable {
        
    }
}