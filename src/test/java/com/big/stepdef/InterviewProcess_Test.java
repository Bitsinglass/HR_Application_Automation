package com.big.stepdef;

import java.awt.AWTException;
import java.io.IOException;
import com.big.pageObjects.CanSourcing_PO;
import com.big.pageObjects.HR_Login_PO;
import com.big.pageObjects.Interview_PO;
import io.cucumber.java.en.*;

public class InterviewProcess_Test {
	
	HR_Login_PO login = new HR_Login_PO();
	CanSourcing_PO cs = new CanSourcing_PO();
	Interview_PO interStages = new Interview_PO();
	
	//----------------background - given & and----------------------------------
	@Given("Candidate is captured")
	public void candidate_is_captured() throws InterruptedException, IOException, AWTException {	
		cs.Click_Create_Button();
		cs.Click_Can_Sourcing();
		cs.Get_CaseID();
		cs.Enter_First_Name();
		cs.Enter_Middle_Name();
		cs.Enter_Last_Name();
		cs.Enter_Gender();
		cs.Enter_Highest_Qualification("Diploma");
		cs.Enter_Course("Test Course");
		cs.Enter_Country("India");
		cs.Enter_State("Punjab");
	    cs.Enter_City("Kharar");
	    cs.Enter_ZipCode("123456");
	    cs.Enter_JobID();
	    cs.Enter_Notes("Test notes");
	    cs.Enter_Attachment();
	    cs.Click_ContinueTab1();
	    cs.Enter_Primary_Mobile_No();
	    cs.Enter_Primary_Email();
	    cs.Enter_Secondary_Mobile_No("9856541360");
	    cs.Enter_Secondary_Email("test1265@gmail.com");
	    cs.Click_ContinueTab2();
		cs.Enter_Current_Company("abc company");
		cs.Enter_Job_Title("current job");
		cs.Enter_Current_Location("current location");
		cs.Enter_Preferred_Location("test preferred location");
		cs.Enter_Relevant_Work_Exp_Y();
		cs.Enter_Relevant_Work_Exp_M();
		cs.Enter_Total_Work_Exp_Y();
		cs.Enter_Total_Work_Exp_M();
		cs.Enter_Current_CTC("10000");
		cs.Enter_Expected_CTC("20000");
		cs.Enter_Certifications("test certifications");
		cs.Enter_Source();
		cs.Enter_Job_Change_Reason("better opportunity");
		cs.Enter_Remarks("test remarks");
		cs.Enter_Linkedin_URL("test linkedin URL");
		cs.Click_Finish_Button();		
	}

	//---------SCENARIO 1- screening approval------------------------------------ 
	@When("I Select the approval checkbox and submit the case")
	public void i_select_the_approval_checkbox_and_submit_the_case() throws InterruptedException {
		interStages.Click_Go_Screening();
		interStages.Approve_Screening();
		interStages.Click_FeedbackSubmit();
		interStages.Click_ConfirmationSubmit();
	}

	@Then("Candidate screening is approved")
	public void candidate_screening_is_approved() {
		System.out.println("Candidate screening is approved");
//		interStages.Get_ScreeningCompletion();
	}

	//---------SCENARIO 2 : screening rejection--------------------------------------
	@When("I Select the rejection checkbox and submit the case")
	public void i_select_the_rejection_checkbox_and_submit_the_case() throws InterruptedException {
		interStages.Click_Go_Screening();
		interStages.Reject_Screening();
		interStages.Click_FeedbackSubmit();
		interStages.Click_ConfirmationSubmit();
	}

	@Then("Candidate screening is rejected")
	public void candidate_screening_is_rejected() {
		System.out.println("Candidate screening is rejected");
//		interStages.Get_ScreeningCompletion();
	}

	
	//-----------------SCENARIO 3: L1 interview approval---------------------------------
	@When("^I enter L1 interviewer details$")
	public void i_enter_l1_interviewer_details() throws Throwable {	
		i_select_the_approval_checkbox_and_submit_the_case();	
		interStages.Click_Go_ToEnterL1();
		interStages.Enter_InterviewerEmail();
		interStages.Enter_InterviewerName();
		interStages.Select_InterviewerType();	
		interStages.Enter_DateTime();
		interStages.Enter_Interview_Venue();
		interStages.L1_Details_Submit ();
	}

	@Then("^Candidate is approved for L1 Round$")
	public void candidate_is_approved_for_l1_round() throws Throwable {	
		System.out.println("Candidate is approved for L1 Round");
	}
	
	@And("^I Select the L1 approval checkbox and submit the case$")
	public void i_select_the_l1_approval_checkbox_and_submit_the_case() throws Throwable {
		interStages.Click_Go_L1Feedback();
		interStages.Approve_L1();
		interStages.Click_L1FeedbackSubmit();
		System.out.println("L1 approval checkbox selected and submitted the case");	
	}
	
	//---------SCENARIO 4 : L1 REJECTION------------------------------------
	@Then("^Candidate is rejected for L1 Round$")
	public void candidate_is_rejected_for_l1_round() throws Throwable {
		System.out.println("SD:--------Candidate is rejected for L1 Round");
	}

	@And("^I Select the L1 rejection checkbox and submit the case$")
	public void i_select_the_l1_rejection_checkbox_and_submit_the_case() throws Throwable {
		interStages.Click_Go_L1Feedback();
		interStages.Reject_L1();
		interStages.Click_L1FeedbackSubmit();
		System.out.println("L1 rejection checkbox selected and submitted the case");
	}
	
	
	//---------SCENARIO 5 : L2 APPROVAL------------------------------------
	@Given("^Candidate L1 Round is approved$")
    public void candidate_l1_round_is_approved() throws Throwable {
		i_enter_l1_interviewer_details();
		i_select_the_l1_approval_checkbox_and_submit_the_case();		
    }

    @When("^I enter L2 interviewer details$")
    public void i_enter_l2_interviewer_details() throws Throwable {
    	interStages.Click_ViewAll();
		interStages.Click_Go_ToEnterL2();
		interStages.Enter_L2_Deatils();	
    }

    @Then("^Candidate is approved for L2 Round$")
    public void candidate_is_approved_for_l2_round() throws Throwable {
    	System.out.println("Candidate is approved for L1 Round");
    }

    @And("^I Select the L2 approval checkbox and submit the case$")
    public void i_select_the_l2_approval_checkbox_and_submit_the_case() throws Throwable {
    	interStages.Click_ViewAll();
    	interStages.Click_Go_L2Feedback();
    	interStages.Approve_L2();
		interStages.Click_L2FeedbackSubmit();
    }
    
  //---------SCENARIO 6 : L2 REJECTION------------------------------------
    @Then("^Candidate is rejected for L2 Round$")
    public void candidate_is_rejected_for_l2_round() throws Throwable {
    	System.out.println("Candidate is rejected for L2 Round");
    }

    @And("^I Select the L2 rejection checkbox and submit the case$")
    public void i_select_the_l2_rejection_checkbox_and_submit_the_case() throws Throwable {
    	interStages.Click_ViewAll();
    	interStages.Click_Go_L2Feedback();
		interStages.Reject_L2();
		interStages.Click_L2FeedbackSubmit();
		System.out.println("L1 rejection checkbox selected and submitted the case");
    }  
    
    
  //---------SCENARIO 7 : SKIP L2 ROUND------------------------------------
    @Given("^Candidate L1 is scheduled$")
    public void candidate_l1_is_scheduled() throws Throwable {
    	i_enter_l1_interviewer_details();
    }

    @When("^I Select the L1 approval checkbox and SkipL2 Round checkbox displayed$")
    public void i_select_the_l1_approval_checkbox_and_skipl2_round_checkbox_displayed() throws Throwable {
    	interStages.Click_Go_L1Feedback();
		interStages.Approve_L1();
    }

    @And("^I Select the SkipL2Round checkbox and submit the case$")
    public void i_select_the_skipl2round_checkbox_and_submit_the_case() throws Throwable {
    	interStages.Click_SkipL2 ();
    	interStages.Click_L1FeedbackSubmit();
		System.out.println("L1 approval checkbox and skip l2 selected and submitted the case");	
    }

    @And("^L2 Round stage gets skipped and Case moves to Operation round$")
    public void l2_round_stage_gets_skipped_and_case_moves_to_operation_round() throws Throwable {
    	interStages.Get_SkipL2_Completion();
    }
    
    //---------SCENARIO 8 : RequireAnotherRound? L3------------------------------------
    @Given("^Candidate L2 round is scheduled$")
    public void candidate_l2_round_is_scheduled() throws Throwable {
    	i_enter_l1_interviewer_details();
    	i_select_the_l1_approval_checkbox_and_submit_the_case();
    	i_enter_l2_interviewer_details();  	
    }

    @When("^I Select the L2 approval checkbox and RequireAnotherRound? checkbox displayed$")
    public void i_select_the_l2_approval_checkbox_and_requireanotherround_checkbox_displayed() throws Throwable {
    	interStages.Click_Go_L2Feedback();
    	interStages.Approve_L2();
    }

    @Then("^Candidate is approved for L2 Round and case moves to L3 Stage $")
    public void candidate_is_approved_for_l2_round_and_case_moves_to_l3_stage() throws Throwable {
    	interStages.Get_l2Completion();
    	}

    @And("^I Select the RequireAnotherRound? checkbox and submit the case$")
    public void i_select_the_requireanotherround_checkbox_and_submit_the_case() throws Throwable {
    	interStages.Click_ReqL3 ();
    	interStages.Click_L1FeedbackSubmit();
    }
    
    //---------SCENARIO 9: L3 APPROVAL------------------------------------
    @Given("^Candidate L2 Round is approved$")
    public void candidate_l2_round_is_approved() throws Throwable {
    	
		interStages.Click_Go_Screening();
		interStages.Approve_Screening();
		interStages.Click_FeedbackSubmit();
		interStages.Click_ConfirmationSubmit();
		
		interStages.Click_Go_ToEnterL1();
		interStages.Enter_InterviewerEmail();
		interStages.Select_InterviewerType();	
		interStages.Enter_DateTime();
		interStages.Enter_Interview_Venue();
		interStages.L1_Details_Submit ();
		
		interStages.Click_Go_L1Feedback();
		interStages.Approve_L1();
		interStages.Click_L1FeedbackSubmit();
		interStages.Click_ViewAll();
		
		interStages.Click_Go_ToEnterL2();
		interStages.Enter_L2_Deatils();
		interStages.Click_ViewAll();
		interStages.Click_Go_L2Feedback();
		interStages.Approve_L2();
		interStages.Click_ReqL3();
		interStages.Click_L2FeedbackSubmit();
    }

    
    @When("^I enter L3 interviewer details$")
    public void i_enter_l3_interviewer_details() throws Throwable {
    	interStages.Click_L3Round_GoView();
    	interStages.Click_Go_ToEnterL3();
    	interStages.Enter_L3_Deatils();
    }

    @Then("^Candidate is approved for L3 Round and case moves to operational round$")
    public void candidate_is_approved_for_l3_round_and_case_moves_to_operational_round() throws Throwable {
    	System.out.println("Candidate approved and L3 Round completed sucessfully.");
//    	interStages.Get_L3Success();
    }

    @And("^I Select the L3 approval checkbox and submit the case$")
    public void i_select_the_l3_approval_checkbox_and_submit_the_case() throws Throwable {
    	interStages.Click_ViewAll();
    	interStages.Click_Go_L3Feedback();
    	interStages.Approve_L3();
    	interStages.Click_L3FeedbackSubmit();
    }
    
    //---------SCENARIO 10: L3 REJECTION------------------------------------
    @Then("^Candidate is rejected for L3 Round$")
    public void candidate_is_rejected_for_l3_round() throws Throwable {
    	System.out.println("Candidate rejected and L3 Round completed sucessfully.");
//    	interStages.Get_L3Success();
    }

    @And("^I Select the L3 rejection checkbox and submit the case$")
    public void i_select_the_l3_rejection_checkbox_and_submit_the_case() throws Throwable {
    	interStages.Click_ViewAll();
    	interStages.Click_Go_L3Feedback();
    	interStages.Reject_L3();
    	interStages.Click_L3FeedbackSubmit();
    }
 
    
    //---------SCENARIO 11 - OPERATION REJECTION-----------------------------------------
    @Given("^Candidate L2 Approved$")
    public void candidate_l2_approved() throws Throwable {
    	interStages.Click_Go_Screening();
		interStages.Approve_Screening();
		interStages.Click_FeedbackSubmit();
		interStages.Click_ConfirmationSubmit();
		
    	interStages.Click_Go_ToEnterL1();
		interStages.Enter_InterviewerEmail();
		interStages.Select_InterviewerType();	
		interStages.Enter_DateTime();
		interStages.Enter_Interview_Venue();
		interStages.L1_Details_Submit ();
		
		interStages.Click_Go_L1Feedback();
		interStages.Approve_L1();
		interStages.Click_L1FeedbackSubmit();
		interStages.Click_ViewAll();
		
		interStages.Click_Go_ToEnterL2();
		interStages.Enter_L2_Deatils();
		interStages.Click_ViewAll();
		interStages.Click_Go_L2Feedback();
		interStages.Approve_L2();
		interStages.Click_L2FeedbackSubmit();
    }

    @When("^I Select the OfferLetter DDL Value as Rejected and submit the case$")
    public void i_select_the_offerletter_ddl_value_as_rejected_and_submit_the_case() throws Throwable {
    	interStages.Click_Opr_Go();
    	interStages.Select_OfferLetter();
    	interStages.Get_OfferLetterType();
    	interStages.Click_OprSubmit();
    }

    @Then("^Candidate case is closed$")
    public void candidate_case_is_closed() throws Throwable {
        System.out.println("Candidate Case - resolved");
        interStages.Get_RejectionStatus();
    }
    
  //---------SCENARIO 12 - OPERATION DROPPED OUT-----------------------------------------  
    @When("^I Select the OfferLetter DDL Value as Dropped Out and submit the case$")
    public void i_select_the_offerletter_ddl_value_as_dropped_out_and_submit_the_case() throws Throwable {
    	interStages.Click_Opr_Go();
    	interStages.Select_OfferLetter();
    	interStages.Get_OfferLetterType();
    	interStages.Click_OprSubmit();
    	
    }
    
   //---------SCENARIO 13 - OPERATION APPROVED-----------------------------------------
    @When("^I Select the OfferLetter DDL Value as Approved enter approval details$")
    public void i_select_the_offerletter_ddl_value_as_approved_enter_approval_details() throws Throwable {
    	interStages.Click_Opr_Go();
    	interStages.Select_OfferLetter();
    	interStages.Get_OfferLetterType();
    	
    	
    	interStages.Enter_JoiningDate();
    	interStages.Click_OprSubmit();
    }

    @Then("^Candidate case is approved and closed$")
    public void candidate_case_is_approved_and_closed() throws Throwable {
    	interStages.Get_ApprovalStatus();
    	}

    @And("^ I Approve the final-approval stage$")
    public void i_approve_the_finalapproval_stage() throws Throwable {
    	interStages.Click_FinalAproval_Go();
    	interStages.Submit_FinalAproval();
    }
    
    
    //---------SCENARIO 14-----------------------------------------
    @When("^I Select the OfferLetter DDL Value as OnHold enter approval details$")
    public void i_select_the_offerletter_ddl_value_as_onhold_enter_approval_details() throws Throwable {
    	interStages.Click_Opr_Go();
    	interStages.Select_OfferLetter();
    	interStages.Get_OfferLetterType();
    	
    	
//    	interStages.Enter_JoiningDate();
    	interStages.Click_OprSubmit();
    }

    @And("^ I Select the OfferLetter DDL Value as Approved and approve the final-approval stage$")
    public void i_select_the_offerletter_ddl_value_as_approved_and_approve_the_finalapproval_stage() throws Throwable {
    }
    
}
