package com.big.stepdef;

import java.awt.AWTException;
import java.io.IOException;

import com.big.pageObjects.CanSourcing_PO;
import com.big.pageObjects.HR_Login_PO;
import com.big.utils.TestReusables;

import io.cucumber.java.en.*;

public class CanSourcing_Test {
	
	//CREATING OBJECTS
	CanSourcing_PO cpo = new CanSourcing_PO();
	HR_Login_PO obj = new HR_Login_PO();
	TestReusables tr = new TestReusables();
	
	@Given("I am logged in as an Admin")
	public void i_am_logged_in_as_an_admin() throws InterruptedException {
		obj.Enter_username("Admin@bitsinglass.com");
	    obj.Enter_password("@Rules04");
	    obj.submit();
	}

	@When("I enter Candidate personal details")
	public void i_enter_candidate_personal_details() throws InterruptedException, IOException {
		cpo.Click_Create_Button();
		cpo.Click_Can_Sourcing();
	    cpo.Get_CaseID();
	    cpo.Enter_First_Name();
	    cpo.Enter_Middle_Name();
	    cpo.Enter_Last_Name();
	    cpo.Enter_Gender();
	    cpo.Enter_Highest_Qualification("Diploma");
	    cpo.Enter_Course("Test Course");
	    cpo.Enter_Country("India");
	    cpo.Enter_State("Punjab");
	    cpo.Enter_City("Kharar");
	    cpo.Enter_ZipCode("123456");
	    cpo.Enter_JobID();
	    cpo.Enter_Notes("Test notes");
	    cpo.Enter_Attachment();
//	    cpo.Enter_Attachment("C:/Users/manpreet.kaur_bitsin/Desktop/RESUME-HR.docx");
//	    cpo.Enter_Attachment(""+ System.getProperty("user.dir")+ "\\RESUME-HR.docx");
	    cpo.Click_ContinueTab1();
	    
	}

	@When("I enter candidate contact details")
	public void i_enter_candidate_contact_details() throws InterruptedException, AWTException {
		cpo.Enter_Primary_Mobile_No();
		cpo.Enter_Primary_Email();
		cpo.Enter_Secondary_Mobile_No("9856541360");
		cpo.Enter_Secondary_Email("test1265@gmail.com");
		cpo.Click_ContinueTab2();
	}

	@When("I enter candidate other details")
	public void i_enter_candidate_other_details() throws InterruptedException {
		cpo.Enter_Current_Company("abc company");
		cpo.Enter_Job_Title("current job");
		cpo.Enter_Current_Location("current location");
		cpo.Enter_Preferred_Location("test preferred location");
		cpo.Enter_Relevant_Work_Exp_Y();
		cpo.Enter_Relevant_Work_Exp_M();
		cpo.Enter_Total_Work_Exp_Y();
		cpo.Enter_Total_Work_Exp_M();
		cpo.Enter_Current_CTC("10000");
		cpo.Enter_Expected_CTC("20000");
		cpo.Enter_Certifications("test certifications");
		cpo.Enter_Source();
		cpo.Enter_Job_Change_Reason("better opportunity");
		cpo.Enter_Remarks("test remarks");
		cpo.Enter_Linkedin_URL("test linkedin URL");
	}

	@When("click Finish button")
	public void click_finish_button() throws InterruptedException {
		cpo.Click_Finish_Button();
	}

	@Then("Candidate information is captured and Unique ID is generated")
	public void candidate_information_is_captured_and_unique_id_is_generated() {
		System.out.println("Candidate created");
	}
	
	@Then("Candidate id is listed in list of candidates")
	public void candidate_id_is_listed_in_list_of_candidates() throws InterruptedException {
		
		// WITHOUTS  FILTERS 
//		String CaseID1 = cpo.Get_CaseID();
//		cpo.Click_List_of_Candidates();
//		String CaseID2 = cpo.Get_First_CaseID();
//		tr.assertTwoTexts(CaseID1, CaseID2);
		
		// WITH FILTERS
		String CaseID1 = cpo.Get_CaseID();
		cpo.Click_List_of_Candidates();
		cpo.Click_Can_ID_Filter();
		cpo.Enter_Filter_Search(CaseID1);
		cpo.Click_Apply_Btn();
		String CaseID2 = cpo.Get_First_CaseID();
		tr.assertTwoTexts(CaseID1, CaseID2);	
	}
}
