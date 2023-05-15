package com.big.stepdef;

import com.big.pageObjects.HRLoginPO;
import com.big.utils.TestReusables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HR_Login_stepdef extends TestReusables{
    HRLoginPO log= new HRLoginPO(driver);

    @Given("I am on HRApp Login Screen")
    public void i_am_on_HRApp_Login_Screen() {
        System.out.println(driver);
    	System.out.println("I am on login page");
    }
    
    @When("I enter Username and Password")
    public void i_enter_username_and_password() throws InterruptedException {
        log.Enter_username("hradmintest@bitsinglass.com");
        log.Enter_password("rules");
    }

    @Then("I Should be navigated to Home Page")
    public void i_should_be_navigated_to_home_page() {
        log.submit();
    }

    @Then("Page title verification")
    public void page_title_verification() {
        try {
            log.Login_verification();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}