package com.big.pageObjects;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.big.utils.ScenarioContext;
import com.big.utils.TestReusables;
import com.big.utils.Utilities;
import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

public class Job_Posting_PO extends TestReusables{
	
	
		ScenarioContext sc = new ScenarioContext();
		
	 	@FindBy(xpath = "//li[@data-test-id='201812201359010458611']/a")
	    public WebElement icon_Create;
	    
	    @FindBy(xpath = "//li[@data-test-id=\"201812201359010458611\"]//li[4]/a")
	    public WebElement icon_JobPost;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[1]//input")
	    public WebElement inp_JobTitle;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[2]//input")
	    public WebElement inp_NumOfPost;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[3]//select")
	    public WebElement ddl_Department;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[4]//select")
	    public WebElement ddl_EmpType;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[5]//select")
	    public WebElement ddl_WorkLoc;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[6]//div[@data-test-id='202301130808150907236']/div[1]//input")
	    public WebElement inp_MinExp;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[6]//div[@data-test-id='202301130808150907236']/div[2]//input")
	    public WebElement inp_MaxExp;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='202301111551080687690']//textarea")
	    public WebElement inp_Jobdesc;
	    
	    @FindBy(xpath = "//button[@data-test-id='20141218012517063217150']")
	    public WebElement btn_Cancel;
	    
	    @FindBy(xpath = "//button[@data-test-id='20150511143907071213967']")
	    public WebElement btn_Save;
	    
	    @FindBy(xpath = "//button[@data-test-id='20161017110917023176385']")
	    public WebElement btn_Continue;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[3]//select")
	    public List<WebElement> ddl_Depart;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[4]//select/option")
	    public List<WebElement> ddl_Emp;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[5]//select/option")
	    public List<WebElement> ddl_Loc;
	    
	    @FindBy(xpath = "//div[@class='loader']")
	    public WebElement loader;
	    
	    @FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
	    public WebElement frame;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[3]//span[@class='iconError dynamic-icon-error']")
	    public WebElement val_DepartDDL;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[4]//span[@class='iconError dynamic-icon-error']")
	    public WebElement val_EmpDDL;
	    
	    @FindBy(xpath = "//div[@data-test-id='20200506135148097754']//div[@data-test-id='201808120943310957798']/div[5]//span[@class='iconError dynamic-icon-error']")
	    public WebElement val_WorkLocDDL;
	    
	    @FindBy(xpath = "//select[@data-test-id='202212202314490292358']")
	    public WebElement ddl_Country;
	    
	    @FindBy(xpath = "//select[@data-test-id='202212202314490292409']")
	    public WebElement ddl_State;
	    
	    @FindBy(xpath = "//select[@data-test-id='202212202314490292409']/option")
	    public List<WebElement> ddl_StateList;
	    
	    @FindBy(xpath = "//select[@data-test-id='202212202314490292694']")
	    public WebElement ddl_City;
	    
	    @FindBy(xpath = "//select[@data-test-id='202212202314490292694']/option")
	    public List<WebElement> ddl_CityList;
	    
	    @FindBy(xpath = "//input[@data-test-id='20221220231449029354']")
	    public WebElement inp_Compen;
	    
	    @FindBy(xpath = "//label[text()='Reporting manager']//parent::div/div/input[1]")
	    public WebElement inp_ReportManag;
	    
	    @FindBy(xpath = "//label[text()='Hiring Manager']//parent::div/div/input[1]")
	    public WebElement inp_HiringManag;
	    
	    @FindBy(xpath = "//table[@id='bodyTbl_right']/tbody/tr//div[@class='cellIn']")
	    public List<WebElement> auto_CompleteDDL;
	    
	    @FindBy(xpath = "//button[@data-test-id='20161017110917023277518']")
	    public WebElement btn_Finish;
	    
	    @FindBy(xpath = "//label[text()='Country']")
	    public WebElement lbl_Country;
	    
	    @FindBy(xpath = "//div[@data-test-id='201712290453170848504']//div[@data-test-id='201808120943310957798']/div[1]//span")
	    public WebElement val_Country;
	    
	    @FindBy(xpath = "//div[@data-test-id='201712290453170848504']//div[@data-test-id='201808120943310957798']/div[2]//span")
	    public WebElement val_State;
	    
	    @FindBy(xpath = "//div[@data-test-id='201712290453170848504']//div[@data-test-id='201808120943310957798']/div[3]//span")
	    public WebElement val_City;
	    
	    @FindBy(xpath = "//div[@data-test-id='202011042325080521889']/div")
	    public WebElement msg_Success;
	    
	    @FindBy(xpath = "//span[@data-test-id='2016083016191602341167946']")
	    public WebElement msg_Status;
	    
	    @FindBy(xpath = "//span[@data-test-id='20190510022618055338234']")
	    public WebElement Job_ID;
	    
	    @FindBy(xpath = "//th[@data-test-id='20160721093355058239712']//a")
	    public WebElement btn_Filter;
	    
	    @FindBy(xpath = "//input[@data-test-id='201411181100280377101613']")
	    public WebElement inp_Filter;
	    
	    @FindBy(xpath = "//button[text()='Apply']")
	    public WebElement btn_Apply;
	    
	    @FindBy(xpath = "//a[@data-test-id='2016072109335505834280']")
	    public WebElement act_Job_ID;
	    
	    @FindBy(xpath = "//div[@data-test-id='201808081157350664772']/div[2]//ul/li[4]//a")
	    public WebElement icon_ListOfCand;
	    
	    @FindBy(xpath = "//button[@data-test-id='201511051022210843267245']")
	    public WebElement btn_Create;
	  
	    public void icons_Click() throws InterruptedException 
	      {
	    	click(icon_Create, "Create Icon");
	    	Thread.sleep(3000);
	         
	         try {
	        	 click(icon_JobPost, "Job Posting Icon");
	        	 Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
	      }
	    
	     public void Enter_Details() throws InterruptedException 
	      {
	    	    pageLoader(loader);
	    	    Thread.sleep(2000);
	    	    String exp_job_ID = Job_ID.getText();
				System.out.println(exp_job_ID);
				sc.setContext("Job ID",exp_job_ID);
				System.out.println("Status "+msg_Status.getText());
				System.out.println("Job added expected "+sc.getContext("Job ID"));
	    	    
	    	    //------Entering Job Title---------
				enterText(inp_JobTitle, "JobTitle","Job Title "+rand_String(5));
				keyboardActions(inp_JobTitle, Keys.TAB);
				Thread.sleep(2000);
				
				//--------Entering Number of Posts-------
				clickUnsingJS(inp_NumOfPost, "Number of posts");
				enterTextUnsingJS(inp_NumOfPost, "Number of posts", ""+rand_Number()+"");
				keyboardActions(inp_NumOfPost, Keys.TAB);
				Thread.sleep(2000);
				
				//-------Department DDL selection--------------
				selectByIndex(ddl_Department, "Department dropdown", rand_ddl(ddl_Depart.size()));
				keyboardActions(ddl_Department, Keys.TAB);
				Thread.sleep(2000);
				
				
				//---------Employee DDL selection-------------
				selectByIndex(ddl_EmpType, "Employee Type dropdown", rand_ddl(ddl_Emp.size()));
				keyboardActions(ddl_EmpType, Keys.TAB);
				
				
				//----------Work Location selection-----------
				selectByIndex(ddl_WorkLoc, "Work Location", rand_ddl(ddl_Loc.size()));
				keyboardActions(ddl_WorkLoc, Keys.TAB);
				
				//-------Department DDL selection again-------------
				for(int d=0;d<=2;d++) {
					try {
						if(val_DepartDDL.isDisplayed()==true) {
							selectByIndex(ddl_Department, "Department dropdown", rand_ddl(ddl_Depart.size()));
						}
				} catch (Exception err) {
					break;
				}
			}
				//-------Employee DDL selection again-------------
				for(int e=0;e<=2;e++) {
					try {
						if(val_EmpDDL.isDisplayed()==true) {
							selectByIndex(ddl_EmpType, "Employee Type dropdown", rand_ddl(ddl_Emp.size()));
						}
				} catch (Exception err) {
					break;
				}
			}
				//-------Work Location DDL selection again-------------	
				for(int i=0;i<=2;i++) {
					try {
						if(val_WorkLocDDL.isDisplayed()==true) {
							selectByIndex(ddl_WorkLoc, "Work Location", rand_ddl(ddl_Loc.size()));
						}
				} catch (Exception err) {
					break;
				}
			}
				//--------Minimum Experience----------------
				enterText(inp_MinExp, "Minimum Experience", "1");
				keyboardActions(inp_MinExp, Keys.TAB);
				Thread.sleep(1000);
				
				//--------Maximum Experience----------------
				clickUnsingJS(inp_MaxExp, "Number of posts");
				enterTextUnsingJS(inp_MaxExp, "Number of posts", ""+(rand_Number()+1)+"");
				Thread.sleep(1000);
				
				//-------Job Description Text area-----------
				textEditor(frame, "Job Description "+rand_String(10)+"");
				switchToDefaultContent();
				Thread.sleep(1000);
				
				//-----Scrolling to continue button----------
				scrolltoElement(btn_Continue);
				click(btn_Continue, "Continue  Button");
				pageLoader(loader);
				
				//----------Scrolling to country label--------
				scrolltoElement(lbl_Country);
				
				//---------Selecting Country DDL--------------
				WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
			    wait.until(ExpectedConditions.elementToBeClickable(ddl_Country));
				selectByText(ddl_Country, "Country Dropdown", "India");
				pageLoader(loader);
				
				//---------Selecting State DDL--------------
			    wait.until(ExpectedConditions.elementToBeClickable(ddl_State));
				selectByIndex(ddl_State, "State dropdown", rand_ddl(ddl_StateList.size()));
				pageLoader(loader);
				
				//---------Selecting City DDL-----------
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(ddl_City));
				selectByIndex(ddl_City, "City dropdown", rand_ddl(ddl_CityList.size()));
				pageLoader(loader);
				
				//--------Selecting Country DDL again-----
				for(int i=0;i<=2;i++) {
					try {
						if(val_Country.isDisplayed()==true) {
							selectByText(ddl_Country, "Country Dropdown", "India");
						}
					} catch (Exception err) {
					break;
					}
				}
				//--------Selecting State DDL again-----
				for(int i=0;i<=2;i++) {
					try {
						if(val_State.isDisplayed()==true) {
							selectByIndex(ddl_State, "State dropdown", rand_ddl(ddl_StateList.size()));
						}
					} catch (Exception err) {
					break;
					}
				}
				//--------Selecting City DDL again-----
				for(int i=0;i<=2;i++) {
					try {
						if(val_City.isDisplayed()==true) {
							selectByIndex(ddl_City, "City dropdown", rand_ddl(ddl_CityList.size()));
						}
					} catch (Exception err) {
						break;
					}
				}
				//------Entering Compensation Amount--------
				enterText(inp_Compen, "Compensation", "10000");
				pageLoader(loader);
				
				//--------Selecting value from Reporting Manager Auto complete DDL----------
				click(inp_ReportManag, "Reporting Manager");
				keyboardActions(inp_ReportManag, Keys.ARROW_DOWN);
				Thread.sleep(3000);
				auto_CompleteDDL.get(rand_ddl(auto_CompleteDDL.size()-1)).click();
				
				//--------Selecting value from Hiring Manager Auto complete DDL----------
				click(inp_HiringManag, "Hiring Manager");
				keyboardActions(inp_HiringManag, Keys.ARROW_DOWN);
				Thread.sleep(3000);
				auto_CompleteDDL.get(rand_ddl(auto_CompleteDDL.size()-1)).click();
				
				//------Clicking on Finish button-------------
				click(btn_Finish, "Finish Button");
				pageLoader(loader);
				Thread.sleep(3000);
	      }
	     public void verify_JobAdded() throws InterruptedException {
	    	 pageLoader(loader);
	    	 movetoElement(icon_ListOfCand);
	    	 click(icon_ListOfCand, "List of Candidates");
	    	 pageLoader(loader);
	    	 movetoElement(btn_Create);
	    	 Thread.sleep(1000);
	    	 
	    	 click(btn_Filter, "Filter icon");
	    	 pageLoader(loader);
	    	 Thread.sleep(1000);
	    	 
	    	 enterText(inp_Filter, "Filter input field", sc.getContext("Job ID"));
	    	 Thread.sleep(4000);
	    	 click(btn_Apply, testType);
	    	 pageLoader(loader);
	    	 Thread.sleep(4000);
	    	 
	    	 String actual_JobID = act_Job_ID.getText();
	    	 System.out.println("Job added successfully actual "+actual_JobID);
	    	 assertTwoTexts(actual_JobID, sc.getContext("Job ID")); 
	    	 Thread.sleep(10000);
	     }
}
