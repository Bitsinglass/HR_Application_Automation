package com.big.pageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.big.utils.TestReusables;

//import testBase.TestBase;

public class Homepage extends TestReusables{

//	public Homepage(WebDriver driver) {
//		TestBase.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
	
  
  @FindBy(xpath="//span[text()='Dashboard']")
  public WebElement Dashboard_link;

  @FindBy(xpath="//li[@data-test-id='dynamic-nav-menu_4']")
  public WebElement Users_Management_link;
  
  @FindBy(xpath="//div[@tabindex='0'][3]")
  public WebElement Skills_link;
  
  @FindBy(xpath="//div[@tabindex='0'][4]")
  public WebElement Service_provider_link;

  @FindBy(xpath="//div[@tabindex='0'][5]")
  public WebElement Consumers_link;

  @FindBy(xpath="//div[@tabindex='0'][6]")
  public WebElement Clients_link;

  @FindBy(xpath="//div[@tabindex='0'][7]")
  public WebElement Jobs_link;
  
  @FindBy(xpath="//div[@tabindex='0'][8]")
  public WebElement Requests_link;

  @FindBy(xpath="//div[@tabindex='0'][9]")
  public WebElement Scheduler_link;

  @FindBy(xpath="//div[@tabindex='0'][10]")
  public WebElement Invitations_link;
  
  public void click_links(WebElement wb , String name) {
	  click(wb,name);	  
  }
}
