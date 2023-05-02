Feature: To verify candidate sourcing functionality

	@RegressionCS
  Scenario: To verify candidate sourcing case creation
    Given I am logged in as an Admin 
    When I enter Candidate personal details
    And I enter candidate contact details
    And I enter candidate other details
    And click Finish button
    Then Candidate information is captured and Unique ID is generated
    And Candidate id is listed in list of candidates