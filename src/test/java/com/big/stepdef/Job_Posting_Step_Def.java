package com.big.stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.big.pageObjects.HRLoginPO;
import com.big.pageObjects.Job_Posting_PO;
import com.big.utils.TestReusables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Job_Posting_Step_Def extends TestReusables{
	HRLoginPO log= new HRLoginPO(driver);
	Job_Posting_PO jpo = new Job_Posting_PO();
	
	
	@Given("I logged in HRApp") 
	public void i_logged_in_hr_app() throws InterruptedException {
	    System.out.println("Logged in APP");
	    log.AdminLoginToHrApp();
	}

	@When("I click on Job posting")
	public void i_click_on_job_posting() throws InterruptedException {
		System.out.println("Clicked job icon");
		jpo.icons_Click();
	}

	@When("I fill all the details and submit")
	public void i_fill_all_the_details_and_submit() throws InterruptedException {
		System.out.println("filled all details");
		jpo.Enter_Details();
	}

	@Then("Job should be created successfully")
	public void job_should_be_created_successfully() throws InterruptedException {
		jpo.verify_JobAdded();
		System.out.println("Job created"); 
	}
}
