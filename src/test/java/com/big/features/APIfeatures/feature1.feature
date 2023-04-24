@Regression
Feature: Verify the google Search Functionality

  #As a end user
  #I want to search something in google
  #So that I get the information required
  @Regression
  Scenario: Validate Login screen
    Given I am on Login Screen
    When User enters Credentials to LogIn
      | username                     | password |
      | abc                          |   123456 |
      | def                          |     5678 |
      | jatin.bakshi@bitsinglass.com | 12345678 |
    Then I Should reached to Home Page

   @Regression
   Scenario: Validates Home Page
   Given user is on home page
   When user clicks on Users link
   Then User redirects to users page