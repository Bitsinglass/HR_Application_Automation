Feature: Import Export functionality

  Scenario: Verify configuration management icon working
    Given I log in the App
    When  I clicked on List Of Candidates
    Then  I should be navigated to Candidates List screen

  Scenario: To verify Export Working
    Given I am on Dashboard
    When I clicked on List of candidates icon
    And I clicked on Export button
    Then Downloaded file should be in system downloads

  Scenario: To verify Exported File Data in Candidates Grid
    Given I read the data from downloaded sheet
    When I search the sheet data in candidates grid
    Then Sheet data should be present in candidates grid
