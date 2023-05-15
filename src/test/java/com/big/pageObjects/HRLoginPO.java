package com.big.pageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.big.utils.TestReusables;
import com.big.utils.Utilities;

public class HRLoginPO extends TestReusables {
	//Initialization
	
    public HRLoginPO(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
    @FindBy(xpath = "//input[@id='txtUserID']")
    public WebElement Username;
    
    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement password;
    
    @FindBy(xpath = "//button[@id='sub']")
    public WebElement submit_button;
    
    @FindBy(xpath = "//title")
    public WebElement page_title;
    
     public void Enter_username(String Uname) throws InterruptedException 
      {
         WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
         wait.until(ExpectedConditions.elementToBeClickable(Username));
         Username.clear();
         Username.sendKeys(Uname);
      }
     
     public void Enter_password(String u_password) 
      {
         WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
         wait.until(ExpectedConditions.elementToBeClickable(password));
         password.clear();
         password.sendKeys(u_password);
      }
     
     public void submit() 
      {
         WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
         wait.until(ExpectedConditions.elementToBeClickable(submit_button));
         submit_button.click();
      }
     
     public void Login_verification() 
      {
         
         String Expected_page_title= "Admin Portal";
         String actual_title= driver.getTitle();
         if(Expected_page_title.equalsIgnoreCase(actual_title))
         {
             System.out.println("The user is redirected to Dashboard successfully");
         }
      }
    
     public void AdminLoginToHrApp() 
      {
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         Username.clear();
         Username.sendKeys("hradmintest@bitsinglass.com");
         password.clear();
         password.sendKeys("rules");
         submit_button.click();
         String Expected_page_title= "Admin Portal";
         String actual_title= driver.getTitle();
         if(Expected_page_title.equalsIgnoreCase(actual_title))
         {
             System.out.println("The user is redirected to Dashboard successfully");
         }
      }
    
}