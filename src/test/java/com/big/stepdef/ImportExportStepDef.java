package com.big.stepdef;

import com.big.pageObjects.HRLoginPO;
import com.big.pageObjects.Config_Manage_PO;
import com.big.pageObjects.ImportExportPO;
import com.big.utils.TestReusables;

import io.cucumber.java.en.*;

public class ImportExportStepDef extends TestReusables {
	HRLoginPO log= new HRLoginPO(driver);
	ImportExportPO imp_Exp = new ImportExportPO(driver);
	
	@Given("I log in the App")
	public void i_log_in_the_App() {
//		log.AdminLoginToHrApp();
		System.out.println("Login step def");
	}
	
	@When("I clicked on List Of Candidates")
	public void i_clicked_on_list_of_candidates() {
	}

	@Then("I should be navigated to Candidates List screen")
	public void i_should_be_navigated_to_candidates_list_screen() {
	}
	
	@Given("I am on Dashboard")
	public void i_am_on_dashboard() {
		imp_Exp.click_Export();
	}

	@When("I clicked on List of candidates icon")
	public void i_clicked_on_list_of_candidates_icon() {
		
	}

	@When("I clicked on Export button")
	public void i_clicked_on_export_button() {
	}

	@Then("Downloaded file should be in system downloads")
	public void downloaded_file_should_be_in_system_downloads() {
	}

	@Given("I read the data from downloaded sheet")
	public void i_read_the_data_from_downloaded_sheet() {
	}

	@When("I search the sheet data in candidates grid")
	public void i_search_the_sheet_data_in_candidates_grid() {
	}

	@Then("Sheet data should be present in candidates grid")
	public void sheet_data_should_be_present_in_candidates_grid() {
	}
}
