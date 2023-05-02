@Regression
Feature: HR Application Login
  
	@Regression
  Scenario: Admin login with valid credentials
    Given I am on HRApp Login Screen
    When I enter Username and Password
    Then I am logged in