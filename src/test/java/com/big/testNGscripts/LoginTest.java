package com.big.testNGscripts;

import org.testng.annotations.Test;

import com.big.pageObjects.GooglePO;
//import com.big.pageObjects.LoginPO;

public class LoginTest extends TestNGInitiation{
	@Test (groups = { "Sanity" }, priority=1, description="Login as Admin")
	public void searchForTestingTrends() {
//		LoginPO Lp = new LoginPO();
//		Lp.login("jatin.bakshi@bitsinglass.com", "12345678");
	}
	
	@Test (groups = { "Regression" }, priority=0, description="Search for API Automation in google")
	public void searchForAPITest() {
		GooglePO gp = new GooglePO();
		gp.verifyElement();
		gp.searchtext("API Automation");
		gp.getsearchtext();
	}
}
