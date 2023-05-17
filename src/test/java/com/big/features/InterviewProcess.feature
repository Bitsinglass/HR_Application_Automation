@RegressionInterview
Feature: To verify interview stages functionality

	Background:
	Given I am logged in as an Admin
  And Candidate is captured

		#---------SCENARIO 1------------------------------------
	  @ScreeningApproval 
	  @RegressionInterview
	  Scenario: To verify candidate screening round approval  
	    When I Select the approval checkbox and submit the case
	    Then Candidate screening is approved
    
    
	  #---------SCENARIO 2------------------------------------
	  @ScreeningRejection
	  @RegressionInterview
	  Scenario: To verify candidate screening round rejection
	    When I Select the rejection checkbox and submit the case
	    Then Candidate screening is rejected
    
   
   #---------SCENARIO 3------------------------------------
   @L1Approval
   #@RegressionInterview
   Scenario: To verify Scheduling L1 Round and Approve candidate
    Given Candidate screening is approved
    When I enter L1 interviewer details
    And I Select the L1 approval checkbox and submit the case
    Then Candidate is approved for L1 Round
    
    
    #---------SCENARIO 4------------------------------------
    @L1Rejection
    @RegressionInterview
   Scenario: To verify Scheduling L1 Round and Reject candidate
    Given Candidate screening is approved
    When I enter L1 interviewer details
    And I Select the L1 rejection checkbox and submit the case
    Then Candidate is rejected for L1 Round
  
  
   #---------SCENARIO 5------------------------------------
   @L2Approval
   @RegressionInterview
   Scenario: To verify Scheduling L2 Round and Approve candidate
    Given Candidate L1 Round is approved
    When I enter L2 interviewer details
    And I Select the L2 approval checkbox and submit the case
    Then Candidate is approved for L2 Round
    
    
	#---------SCENARIO 6------------------------------------
    @L2Rejection
    @RegressionInterview
   Scenario: To verify Scheduling L2 Round and Reject candidate
    Given Candidate L1 Round is approved
    When I enter L2 interviewer details
    And I Select the L2 rejection checkbox and submit the case
    Then Candidate is rejected for L2 Round
    
    
    #---------SCENARIO 7------------------------------------
    @SkipL2Round
    @RegressionInterview
   Scenario: To verify SkipL2Round functionality
    Given Candidate L1 is scheduled
    When I Select the L1 approval checkbox and SkipL2 Round checkbox displayed
    And I Select the SkipL2Round checkbox and submit the case
    Then Candidate is approved for L1 Round
    And L2 Round stage gets skipped and Case moves to Operation round
    
    
    #---------SCENARIO 8------------------------------------
    @RequireL3Round
    @RegressionInterview
   Scenario: To verify RequireL3Round checkbox and l2 schedule functionality
    Given Candidate L2 round is scheduled
    When I Select the L2 approval checkbox and RequireAnotherRound? checkbox displayed
    And I Select the RequireAnotherRound? checkbox and submit the case
    Then Candidate is approved for L2 Round and case moves to L3 Stage
   
   
    
    #---------SCENARIO 9------------------------------------
   @L3Approval
   @RegressionInterview
   Scenario: To verify Scheduling L3 Round and Approve candidate
    Given Candidate L2 Round is approved
    When I enter L3 interviewer details
    And I Select the L3 approval checkbox and submit the case
    Then Candidate is approved for L3 Round and case moves to operational round
    
    
    
	#---------SCENARIO 10------------------------------------
    @L3Rejection
    @RegressionInterview
   Scenario: To verify Scheduling L3 Round and Reject candidate
    Given Candidate L2 Round is approved
    When I enter L3 interviewer details
    And I Select the L3 rejection checkbox and submit the case
    Then Candidate is rejected for L3 Round
    
    
   #---------SCENARIO 11-----------------------------------------
   @OperationRoundRejection-Rejected
   @RegressionInterview
   Scenario: To verify Operation round rejection candidate
    Given Candidate L2 Approved
    When I Select the OfferLetter DDL Value as Rejected and submit the case
    Then Candidate case is closed
    
    
    #---------SCENARIO 12-----------------------------------------
   @OperationRoundRejection-DroppedOut
   @RegressionInterview
   Scenario: To verify Operation round rejection - dropped out functionality
    Given Candidate L2 Approved
    When I Select the OfferLetter DDL Value as Dropped Out and submit the case
    Then Candidate case is closed
    
    
    #---------SCENARIO 13-----------------------------------------
   @OperationRoundApproval
   @RegressionInterview
   Scenario: To verify Operation round Approval and Final approval functionality
    Given Candidate L2 Approved
    When I Select the OfferLetter DDL Value as Approved enter approval details
    And  I Approve the finalApproval stage
    Then Candidate case is approved and closed
    
    
    #---------SCENARIO 14-----------------------------------------
   #@OperationRoundOnHold
   #@RegressionInterview
   #Scenario: To verify Operation round OnHold and Final approval functionality
    #Given Candidate L2 Approved
    #When I Select the OfferLetter DDL Value as OnHold enter approval details
    #And  I Select the OfferLetter DDL Value as Approved and approve the final-approval stage
    #Then Candidate case is approved and closed