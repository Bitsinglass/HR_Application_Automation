package com.big.stepdef;

import com.big.pageObjects.Config_Manage_PO;
import com.big.pageObjects.HRLoginPO;
import com.big.utils.TestReusables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfigManag_Step_Def extends TestReusables {
	HRLoginPO log= new HRLoginPO(driver);
	Config_Manage_PO cm = new Config_Manage_PO(driver);

	@Given("I logged in App")
	public void i_logged_in_App() {
//		log.AdminLoginToHrApp();
		System.out.println("Login step def");
	}
	
	@When("I clicked on configuration management")
	public void i_clicked_on_configuration_management() throws InterruptedException {
		cm.click_ConfingManage();
	}

	@Then("I should be navigated to configuration management screen")
	public void i_should_be_navigated_to_configuration_management_screen() {
		cm.verify_Title();
	}

	@When("I Selected Admin Email from Reference Type DDL")
	public void i_selected_admin_email_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_AdminEmail();
	}

	@When("I clicked on Add button for Admin Email")
	public void i_clicked_on_add_button_for_Admin_Email() throws InterruptedException {
		cm.addBtn_Admin();
	}

	@When("I entered a new Email and clicked save button")
	public void i_entered_a_new_email_and_clicked_save_button() throws InterruptedException {
		cm.input_Admin();
		cm.saveBtn_Admin();
	}

	@Then("Added Admin Email should be displayed in grid")
	public void added_admin_email_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("Admin Email added");
	}
	
	@When("I Selected Candidate Status from Reference Type DDL")
	public void i_selected_candidate_status_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_CandidateStatus();
	}
	
	@When("I clicked on Add button for Candidate Status")
	public void i_clicked_on_add_button_for_Candidate_Status() throws InterruptedException {
		cm.addBtn_CandidateStatus();
	}

	@When("I entered a new Candidate Status and clicked save button")
	public void i_entered_a_new_candidate_status_and_clicked_save_button() throws InterruptedException {
		cm.input_CandidateStatus();
		cm.saveBtn_CandidateStatus();
	}

	@Then("Added Candidate Status should be displayed in grid")
	public void added_candidate_status_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("Candidate Status added");
	}

	@When("I Selected Department from Reference Type DDL")
	public void i_selected_department_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_Department();
	}
	
	@When("I clicked on Add button for Department")
	public void i_clicked_on_add_button_for_Department() throws InterruptedException {
		cm.addBtn_Department();
	}

	@When("I entered a new Department and clicked save button")
	public void i_entered_a_new_department_and_clicked_save_button() throws InterruptedException {
		cm.input_Department();
		cm.saveBtn_Department();
	}

	@Then("Added Department should be displayed in grid")
	public void added_department_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("Department added");
	}

	@When("I Selected Employment Type from Reference Type DDL")
	public void i_selected_employment_type_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_EmployeeType();
	}
	
	@When("I clicked on Add button for Employment Type")
	public void i_clicked_on_add_button_for_Employment_Type() throws InterruptedException {
		cm.addBtn_EmployeeType();
	}

	@When("I entered a new Employment Type and clicked save button")
	public void i_entered_a_new_employment_type_and_clicked_save_button() throws InterruptedException {
		cm.input_EmployeeType();
		cm.saveBtn_EmployeeType();
	}

	@Then("Added Employment Type should be displayed in grid")
	public void added_employment_type_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("Employee type added");
	}
	
	@When("I Selected HRMMailCC from Reference Type DDL")
	public void i_selected_hrm_mail_cc_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_HRMMailCC();
	}

	@When("I clicked on Add button for HRMMailCC")
	public void i_clicked_on_add_button_for_hrm_mail_cc() throws InterruptedException {
		cm.addBtn_HRMMailCC();
	}

	@When("I entered a new HRMMailCC and clicked save button")
	public void i_entered_a_new_hrm_mail_cc_and_clicked_save_button() throws InterruptedException {
		cm.input_HRMMailCC();
		cm.saveBtn_HRMMailCC();
	}

	@Then("Added HRMMailCC should be displayed in grid")
	public void added_hrm_mail_cc_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("HRMMailCC added");
	}

	@When("I Selected HRMMailTO from Reference Type DDL")
	public void i_selected_hrm_mail_to_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_HRMMailTO();
	}

	@When("I clicked on Add button for HRMMailTO")
	public void i_clicked_on_add_button_for_hrm_mail_to() throws InterruptedException {
		cm.addBtn_HRMMailTO();
	}

	@When("I entered a new HRMMailTO and clicked save button")
	public void i_entered_a_new_hrm_mail_to_and_clicked_save_button() throws InterruptedException {
		cm.input_HRMMailTO();
		cm.saveBtn_HRMMailTO();
	}
	
	@Then("Added HRMMailTO should be displayed in grid")
	public void added_hrm_mail_to_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("HRMMailTO added");
	}
	
	@When("I Selected Highest Qualification from Reference Type DDL")
	public void i_selected_highest_qualification_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_HighestQualification();
	}
	
	@When("I clicked on Add button for Highest Qualification")
	public void i_clicked_on_add_button_for_highest_qualification() throws InterruptedException {
		cm.addBtn_HighestQualification();
	}

	@When("I entered a new Highest Qualification and clicked save button")
	public void i_entered_a_new_highest_qualification_and_clicked_save_button() throws InterruptedException {
		cm.input_HighestQualification();
	}

	@Then("Added Highest Qualification should be displayed in grid")
	public void added_highest_qualification_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("Higher Qualification added");
	}

	@When("I Selected Job Status from Reference Type DDL")
	public void i_selected_job_status_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_JobStatus();
	}

	@When("I clicked on Add button for Job Status")
	public void i_clicked_on_add_button_for_job_status() throws InterruptedException {
		cm.addBtn_JobStatus();
	}

	@When("I entered a new Job Status and clicked save button")
	public void i_entered_a_new_job_status_and_clicked_save_button() throws InterruptedException {
		cm.input_JobStatus();
		cm.saveBtn_JobStatus();
	}

	@Then("Added Job Status should be displayed in grid")
	public void added_job_status_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("Job Status added");
	}

	@When("I Selected Location from Reference Type DDL")
	public void i_selected_location_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_Location();
	}

	@When("I clicked on Add button for Location")
	public void i_clicked_on_add_button_for_location() throws InterruptedException {
		cm.addBtn_Location();
	}

	@When("I entered a new Location and clicked save button")
	public void i_entered_a_new_location_and_clicked_save_button() throws InterruptedException {
		cm.input_Location();
		cm.saveBtn_Location();
	}

	@Then("Added Location should be displayed in grid")
	public void added_location_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("Location added");
	}

	@When("I Selected OfferStatus from Reference Type DDL")
	public void i_selected_offer_status_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_OfferStatus();
	}

	@When("I clicked on Add button for OfferStatus")
	public void i_clicked_on_add_button_for_offer_status() throws InterruptedException {
		cm.addBtn_OfferStatus();
	}

	@When("I entered a new OfferStatus and clicked save button")
	public void i_entered_a_new_offer_status_and_clicked_save_button() throws InterruptedException {
		cm.input_OfferStatus();
		cm.saveBtn_OfferStatus();
	}

	@Then("Added OfferStatus should be displayed in grid")
	public void added_offer_status_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("Offer Status added");
	}

	@When("I Selected Role from Reference Type DDL")
	public void i_selected_role_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_Role();
	}

	@When("I clicked on Add button for Role")
	public void i_clicked_on_add_button_for_role() throws InterruptedException {
		cm.addBtn_Role();
	}

	@When("I entered a new Role and clicked save button")
	public void i_entered_a_new_role_and_clicked_save_button() throws InterruptedException {
		cm.input_Role();
		cm.saveBtn_Role();
	}

	@Then("Added Role should be displayed in grid")
	public void added_role_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("Role added");
	}

	@When("I Selected Source from Reference Type DDL")
	public void i_selected_source_from_reference_type_ddl() throws InterruptedException {
		cm.ddl_Source();
	}

	@When("I clicked on Add button for Source")
	public void i_clicked_on_add_button_for_source() throws InterruptedException {
		cm.addBtn_Source();
	}

	@When("I entered a new Source and clicked save button")
	public void i_entered_a_new_source_and_clicked_save_button() throws InterruptedException {
		cm.input_Source();
		cm.saveBtn_Source();
	}

	@Then("Added Source should be displayed in grid")
	public void added_source_should_be_displayed_in_grid() throws InterruptedException {
		cm.record_VerifyNdelete();
		System.out.println("Source added");
	}

}
