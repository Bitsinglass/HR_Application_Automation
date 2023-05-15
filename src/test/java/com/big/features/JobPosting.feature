Feature: Job Posting 

#@tag2
Scenario: Verify job posting process
Given I logged in HRApp
When I click on Job posting
And I fill all the details and submit
Then Job should be created successfully