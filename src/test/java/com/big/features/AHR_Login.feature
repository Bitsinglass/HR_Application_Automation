#
Feature: Login to HR Application
  
@tag1  
  Scenario: Admin login with valid credentials
    Given I am on HRApp Login Screen
    When I enter Username and Password
    Then I Should be navigated to Home Page
    And Page title verification