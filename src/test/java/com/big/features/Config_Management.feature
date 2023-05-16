Feature: Configuration Management

  #------1--------
  Scenario: Verify configuration management icon working
    Given I logged in App
    When  I clicked on configuration management
    Then  I should be navigated to configuration management screen
    
  #------2--------
  Scenario: Verify Admin Email addition process
    When I Selected Admin Email from Reference Type DDL
    And I clicked on Add button for Admin Email
    And I entered a new Email and clicked save button
    Then Added Admin Email should be displayed in grid
    
  #------3--------
  Scenario: Verify Candidate Status addition process
    When I Selected Candidate Status from Reference Type DDL
    And I clicked on Add button for Candidate Status
    And I entered a new Candidate Status and clicked save button
    Then Added Candidate Status should be displayed in grid
    
	#------4-------- 
  Scenario: Verify Department addition process
    When I Selected Department from Reference Type DDL
    And I clicked on Add button for Department
    And I entered a new Department and clicked save button
    Then Added Department should be displayed in grid
    
  #------5--------
  Scenario: Verify Employment Type addition process
    When I Selected Employment Type from Reference Type DDL
    And I clicked on Add button for Employment Type
    And I entered a new Employment Type and clicked save button
    Then Added Employment Type should be displayed in grid
    
  #------6--------
  Scenario: Verify HRMMailCC addition process
    When I Selected HRMMailCC from Reference Type DDL
    And I clicked on Add button for HRMMailCC
    And I entered a new HRMMailCC and clicked save button
    Then Added HRMMailCC should be displayed in grid
    
  #------7--------
  Scenario: Verify HRMMailTO addition process
    When I Selected HRMMailTO from Reference Type DDL
    And I clicked on Add button for HRMMailTO
    And I entered a new HRMMailTO and clicked save button
    Then Added HRMMailTO should be displayed in grid
    
  #------8--------
  Scenario: Verify Highest Qualification addition process
    When I Selected Highest Qualification from Reference Type DDL
    And I clicked on Add button for Highest Qualification
    And I entered a new Highest Qualification and clicked save button
    Then Added Highest Qualification should be displayed in grid
    
  #------9--------
  Scenario: Verify Job Status addition process
    When I Selected Job Status from Reference Type DDL
    And I clicked on Add button for Job Status
    And I entered a new Job Status and clicked save button
    Then Added Job Status should be displayed in grid
    
  #------10--------
  Scenario: Verify Location addition process
    When I Selected Location from Reference Type DDL
    And I clicked on Add button for Location
    And I entered a new Location and clicked save button
    Then Added Location should be displayed in grid
    
  #------11--------
  Scenario: Verify OfferStatus addition process
    When I Selected OfferStatus from Reference Type DDL
    And I clicked on Add button for OfferStatus
    And I entered a new OfferStatus and clicked save button
    Then Added OfferStatus should be displayed in grid
    
  #------12--------
  Scenario: Verify Role addition process
    When I Selected Role from Reference Type DDL
    And I clicked on Add button for Role
    And I entered a new Role and clicked save button
    Then Added Role should be displayed in grid
    
  #------13--------
  Scenario: Verify Source addition process
    When I Selected Source from Reference Type DDL
    And I clicked on Add button for Source
    And I entered a new Source and clicked save button
    Then Added Source should be displayed in grid
