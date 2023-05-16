package com.big.pageObjects;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.big.utils.TestReusables;

public class CanSourcing_PO extends TestReusables {
	
	//GLOBAL VARIABLES
	String randomFname = "";
	String randomMname = "";
	String randomLname = "";
	static String CaseID = "";	
	
	// WEB ELEMENTS
	@FindBy(xpath ="//div[@class='loader']")
	WebElement Loader;
	
	@FindBy(xpath ="//li[@data-test-id='201812201359010458611']/a")
	WebElement Create_Button;
	
	@FindBy(xpath ="//li[@title='Candidate Sourcing']/a")
	WebElement Candidate_Sourcing;
	
	@FindBy(xpath ="//span[@class='case_title']")
	WebElement Case_Title;
	
	@FindBy(xpath ="//input[@id='ad7ed1ea']")
	WebElement First_Name;
	
	@FindBy(xpath ="//input[@id='2fe33c11']")
	WebElement Middle_Name;
	
	@FindBy(xpath ="//input[@id='c3895f15']")
	WebElement Last_Name;
	
	@FindBy(xpath ="//select[@id='02bbe4d6']")
	WebElement Gender;
	
	@FindBy(xpath ="//div[@node_name='CandidatePersonalDetails']//select[@id='55e62e6e']")
	WebElement Highest_Qualification;
	
	@FindBy(xpath ="//div[@node_name='CandidatePersonalDetails']//input[@id='d362812d']")
	WebElement Course;
	
	@FindBy(xpath ="//div[@node_name='CandidatePersonalDetails']//select[@id='a80a805b']")
	WebElement Country;
	
	@FindBy(xpath ="//div[@node_name='CandidatePersonalDetails']//select[@id='e546f843']")
	WebElement State;
	
	@FindBy(xpath ="//div[@node_name='CandidatePersonalDetails']//select[@id='205fb768']")
	WebElement City;
	
	@FindBy(xpath ="//div[@node_name='CandidatePersonalDetails']//input[@id='1eb5249d']")
	WebElement ZipCode;
	
	@FindBy(xpath ="//div[@node_name='CandidatePersonalDetails']//input[@id='2b693b97']")
	WebElement JobID;
	
	@FindBy(xpath ="//div[@node_name='CandidatePersonalDetails']//textarea[@id='d8f94de3']")
	WebElement Notes;
	
	@FindBy(xpath ="//div[@id='uniqueIDforMultiFilePath']//input[@type='file']")
	WebElement Attachment;
	
	@FindBy(xpath ="//div[@id='uniqueIDforMultiFilePath']//input[@type='file']")
	WebElement Inp_Resume;
	
	@FindBy(xpath ="//button[text()='Continue']")
	WebElement Continue_Button;
	
	@FindBy(xpath ="//div[@node_name='CaptureContactDetails']//input[@id='6655f94d']")
	WebElement Primary_Mobile_No;
	
	@FindBy(xpath ="//div[@node_name='CaptureContactDetails']//input[@id='9822acfc']")
	WebElement Primary_Email;
	
	@FindBy(xpath ="//div[@node_name='CaptureContactDetails']//input[@id='ff5ca8f7']")
	WebElement Secondary_Mobile_No;
	
	@FindBy(xpath ="//div[@node_name='CaptureContactDetails']//input[@id='1632feb2']")
	WebElement Secondary_Email;
	
	@FindBy(xpath ="//button[@data-test-id='20161017110917023176385']")
	WebElement Continue_Btn2;
	
	@FindBy(xpath ="//input[@id='b4c64072']")
	WebElement Current_Company;
	
	@FindBy(xpath ="//input[@id='628114a8']")
	WebElement Job_Title;
	
	@FindBy(xpath ="//input[@id='9a7574ae']")
	WebElement Current_Location;
	
	@FindBy(xpath ="//input[@id='7b32e6f6']")
	WebElement Preferred_Location;
	
	@FindBy(xpath ="//select[@id='0716b298']")
	WebElement Relevant_Work_Exp_Y;
	
	@FindBy(xpath ="//select[@id='cae7d3d4']")
	WebElement Relevant_Work_Exp_M;
	
	@FindBy(xpath ="//select[@id='02096d9f']")
	WebElement Total_Work_Exp_Y;
	
	@FindBy(xpath ="//select[@id='d6c2f855']")
	WebElement Total_Work_Exp_M;
	
	@FindBy(xpath ="//input[@id='ed0dce4a']")
	WebElement Current_CTC;
	
	@FindBy(xpath ="//input[@id='f1aa78ab']")
	WebElement Expected_CTC;
	
	@FindBy(xpath ="//input[@id='97a2e6c0']")
	WebElement Certifications;
	
	@FindBy(xpath ="//select[@id='9a7691e7']")
	WebElement Source;
	
	@FindBy(xpath ="//input[@data-test-id='20221220235133076529']")
	WebElement Emp_ID_Ref;
	
	@FindBy(xpath ="//input[@data-test-id='202212202351330765231']")
	WebElement Emp_Name_Ref;	
	
	@FindBy(xpath ="//textarea[@id='26abc898']")
	WebElement Job_Change_Reason;
	
	@FindBy(xpath ="//textarea[@id='243636ad']")
	WebElement Remarks;
	
	@FindBy(xpath ="//input[@id='854e0722']")
	WebElement Linkedin_URL;
	
	@FindBy(xpath ="//button[normalize-space()='Finish']")
	WebElement Finish_Button;
	
	@FindBy(xpath ="//a[contains(@data-click,'List Of Candidates')]")
	WebElement List_of_Candidates;
	
	@FindBy(xpath ="//div[@class='content-item content-layout item-2 flex flex-row']")
	WebElement Can_Summary;
	
	@FindBy(xpath ="//table[@pl_prop='D_InprogressCandidates.pxResults']//tr[1]/th[1]/div/span/a")
	WebElement Can_ID_Filter;
	
	@FindBy(xpath ="//input[@id='131f951c']")
	WebElement Filter_Search;	
	
	@FindBy(xpath ="//button[text()='Apply']")
	WebElement Apply_Btn;
	
	@FindBy(xpath ="//table[@class='gridTable ']//tr[@id='$PD_InprogressCandidates$ppxResults$l1']/td[1]/div/span/a")
	WebElement First_Case_ID;
					
	
	//OBJECTS METHODs
	public void Click_Create_Button() throws InterruptedException
	{
		movetoElement(Create_Button);
		click(Create_Button, "Create Button CS");	
	}
	
	public void Click_Can_Sourcing() throws InterruptedException
	{
//		tr.movetoElement(Candidate_Sourcing);
		Thread.sleep(2000);
		click(Candidate_Sourcing, "CS BUTTON");		
	}
	
	public String Get_CaseID() throws InterruptedException
	{
		CaseID = getText(Case_Title);
		System.out.println(CaseID);
		return CaseID;
	}
	
	public void Enter_First_Name() throws InterruptedException
	{
		randomFname = "FirstName" + RandomData("abcdefghijklmnopqrstuvwxyz",5);
	    enterText(First_Name, "FirstNamwField", randomFname);
	}
	
	public void Enter_Middle_Name() throws InterruptedException
	{
		randomMname = "MiddleName" + RandomData("abcdefghijklmnopqrstuvwxyz",5);	    
		Middle_Name.click();
		Thread.sleep(2000);
		Middle_Name.click();
		enterText(Middle_Name, "MiddleNameField", randomMname);
	}
	
	public void Enter_Last_Name() throws InterruptedException
	{		
		randomLname = "LastName" + RandomData("abcdefghijklmnopqrstuvwxyz",5);	
		Last_Name.click();
		Thread.sleep(2000);
		Last_Name.click();
		enterText(Last_Name, "LastNameField", randomLname);	
	}
	
	public void Enter_Gender() throws InterruptedException
	{
		click(Gender, "GenderDD");
		Thread.sleep(2000);
		selectByText(Gender, "GenderDD", "Male");	
	}
	
	public void Enter_Highest_Qualification(String HQ) throws InterruptedException
	{
		click(Highest_Qualification,"Highest_Qualification_DD");
		List<WebElement> hqs = driver.findElements(By.xpath("//div[@node_name='CandidatePersonalDetails']//select[@id='55e62e6e']/option"));		
		int hqs_size = hqs.size();																												
		ThreadLocalRandom random = ThreadLocalRandom.current();
		int rand_HQ = random.nextInt(1, hqs_size);		
		Thread.sleep(2000);
		selectByIndex(Highest_Qualification, "HQ_DD", rand_HQ);
	}
	
	public void Enter_Course(String course) throws InterruptedException
	{
		enterText(Course, "course", course);
	}
	
	public void Enter_Country(String con) throws InterruptedException
	{
		pageLoader(Loader);
		selectByText(Country, "CountryDD", con);
	}
	
	public void Enter_State(String state) throws InterruptedException
	{
		pageLoader(Loader);
		Thread.sleep(5000);
		selectByText(State, "StateDD", state);
		
	}
	
	public void Enter_City(String city) throws InterruptedException
	{
		Thread.sleep(5000);
		pageLoader(Loader);
		selectByText(City, "CityDD", city);
	}
	
	public void Enter_ZipCode(String zcode) throws InterruptedException
	{
		enterText(ZipCode, "zcode", zcode);
	}
	
	public void Enter_JobID() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(JobID));
		Thread.sleep(3000);
		click(JobID, "JobID_DD");
		PressSpecialKey(JobID, "Down");
		List<WebElement> jobs = driver.findElements(By.xpath("//table[@pl_prop_class='BIG-HRM-Data-JobPost']//tr"));		
		int jobs_size = jobs.size();
		ThreadLocalRandom random = ThreadLocalRandom.current();
		int rand = random.nextInt(1, jobs_size-1);		
		jobs.get(rand).click();
		Thread.sleep(2000);
	}
	
	
	public void Enter_Notes(String note) throws InterruptedException
	{
		enterText(Notes, "Notes", note);
	}
	
	public void Enter_Attachment() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
//		fileUpload(""+Attachment+"","Resume",""+System.getProperty("user.dir")+"\\hr_Resume\\RESUME-HR.docx");
//		fileUpload("//div[@id='uniqueIDforMultiFilePath']//input[@type='file']","Resume",""+System.getProperty("user.dir")+"\\hr_Resume\\RESUME-HR.docx");
		fileUpload("//div[@id='uniqueIDforMultiFilePath']//input[@type='file']","ResumeUpload","C:\\Users\\manpreet.kaur_bitsin\\Desktop\\RESUME-HR.docx");						
	}
	
	
	public void Click_ContinueTab1() throws InterruptedException
	{
		Thread.sleep(2000);
		click(Continue_Button, "ContinueTab1");
		Thread.sleep(2000);
	}
	
	public void Enter_Primary_Mobile_No() throws InterruptedException
	{
		pageLoader(Loader);
		String randomPrinum = RandomData("0123456789",10);	
		enterText(Primary_Mobile_No, "Primary_Num", randomPrinum);
		Thread.sleep(2000);
	}
	
	public void Enter_Primary_Email() throws InterruptedException
	{
		String pemail = randomFname + "@gmail.com";
		click(Primary_Email,"Primary_Email_Field");
		Thread.sleep(2000);
		enterText(Primary_Email, "Primary email", pemail);
		Thread.sleep(2000);
	}
	
	
	public void Enter_Secondary_Mobile_No(String snumber) throws InterruptedException
	{
		click(Secondary_Email,"Secondary_Email_Field");
		Thread.sleep(2000);
		enterText(Secondary_Mobile_No, "Secondary Number", snumber);
		Thread.sleep(2000);
	}
	
	public void Enter_Secondary_Email(String semail) throws InterruptedException
	{
		click(Secondary_Email,"Secondary_Email_Field");
		Thread.sleep(2000);
		enterText(Secondary_Email, "Seconday email", semail);
		Thread.sleep(2000);	
	}
	
	public void Click_ContinueTab2() throws InterruptedException, AWTException
	{	
		Click_ContinueTab1();
	}
	
	public void Enter_Current_Company(String company) throws InterruptedException
	{
		pageLoader(Loader);
		enterText(Current_Company, "Current Company", company);
		Thread.sleep(2000);
	}
	
	public void Enter_Job_Title(String job) throws InterruptedException
	{
		enterText(Job_Title, "JobTitle", job);
		Thread.sleep(2000);
	}
	
	public void Enter_Current_Location(String Curr_loc) throws InterruptedException
	{
		enterText(Current_Location, "Current_Location", Curr_loc);
		Thread.sleep(2000);
	}
	
	
	public void Enter_Preferred_Location(String pre_loc) throws InterruptedException
	{
		enterText(Preferred_Location, "Preferred_Location", pre_loc);
		Thread.sleep(2000);
	}	
	
	public void Enter_Relevant_Work_Exp_Y() throws InterruptedException
	{	
		selectByValue(Relevant_Work_Exp_Y, "Relevant_Work_Exp_Y", "2");
		Thread.sleep(2000);
	}
	
	public void Enter_Relevant_Work_Exp_M() throws InterruptedException
	{
		selectByValue(Relevant_Work_Exp_M, "Relevant_Work_Exp_M", "00");
		Thread.sleep(2000);
	}
	
	public void Enter_Total_Work_Exp_Y() throws InterruptedException
	{
		selectByValue(Total_Work_Exp_Y, "Total_Work_Exp_Y", "3");
		Thread.sleep(2000);
	}
	
	public void Enter_Total_Work_Exp_M() throws InterruptedException
	{
		selectByValue(Total_Work_Exp_M, "Total_Work_Exp_M", "00");
		Thread.sleep(2000);
	}	
	
	public void Enter_Current_CTC(String curr_CTC) throws InterruptedException
	{
		enterText(Current_CTC, "Current_CTC", curr_CTC);
		Thread.sleep(2000);
	}
	
	public void Enter_Expected_CTC(String exp_CTC) throws InterruptedException
	{
		enterText(Expected_CTC, "Expected_CTC", exp_CTC);
		Thread.sleep(2000);
	}
	
	public void Enter_Certifications(String cert) throws InterruptedException
	{
		enterText(Certifications, "Certifications", cert);
		Thread.sleep(2000);	
	}
	
	public void Enter_Source() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Source));
		Thread.sleep(5000);
		click(Source,"Source_DD");
		List<WebElement> source_values = driver.findElements(By.xpath("//select[@id='9a7691e7']/option"));		
		int source_size = source_values.size();																												
		ThreadLocalRandom random = ThreadLocalRandom.current();
		int rand_source = random.nextInt(1, source_size);	
		Thread.sleep(4000);
		selectByIndex(Source, "Source", rand_source);
		Thread.sleep(5000);
		
//		if (Source.getText().equalsIgnoreCase("Referral"))	
		if (getSelectedOption(Source,"SourceDD").equalsIgnoreCase("Referral")) 
		{
			Thread.sleep(1000);
			Emp_ID_Ref.sendKeys("CTPL1234");
			Thread.sleep(1000);
			Emp_Name_Ref.sendKeys("Referal Emp Name");
		}		
		Thread.sleep(2000);
	}
	
	public void Enter_Job_Change_Reason(String reason) throws InterruptedException
	{
		enterText(Job_Change_Reason, "Job_Change_Reason", reason);
		Thread.sleep(5000);
	}
	
	public void Enter_Remarks(String remark) throws InterruptedException
	{
		enterText(Remarks, "Remarks", remark);
		Thread.sleep(2000);
	}
	
	public void Enter_Linkedin_URL(String linkURL) throws InterruptedException
	{
		enterText(Linkedin_URL, "Linkedin_URL", linkURL);
		Thread.sleep(2000);
	}
	
	public void Click_Finish_Button() throws InterruptedException
	{
		click(Finish_Button, "Finish_Button");
		Thread.sleep(2000);
	}
	
	public void Click_List_of_Candidates() throws InterruptedException
	{
		Thread.sleep(2000);
		click(List_of_Candidates,"List_of_Candidates");
		click(Can_Summary, "Can_summary");
		Thread.sleep(2000);
	}
	
	public void Click_Can_ID_Filter() throws InterruptedException
	{
		click(Can_ID_Filter, "Can_ID_Filter");
		Thread.sleep(2000);
	}
	
	public void Enter_Filter_Search(String CiD) throws InterruptedException
	{
		enterText(Filter_Search, "Filter_Search", CiD);
		Thread.sleep(2000);
	}
	
	public void Click_Apply_Btn() throws InterruptedException
	{
		click(Apply_Btn, "Apply_Btn");
		Thread.sleep(2000);
	}
	
	public String Get_First_CaseID() throws InterruptedException
	{
		String FirstcaseID = getText(First_Case_ID);
		System.out.println(FirstcaseID);
		return FirstcaseID;
	}	
	
//	public void Write_CSID_Excel() throws IOException
//	{
//		FileInputStream xl = new FileInputStream("C:\\Users\\manpreet.kaur_bitsin\\Desktop\\Java Backup\\HR_Pro_Files\\HRCandidates.ods");
//		XSSFWorkbook workbook = new XSSFWorkbook(xl);
//	    XSSFSheet sheet = workbook.getSheetAt(0);
//	    int rows = sheet.getLastRowNum();
//        int cols = sheet.getRow(0).getLastCellNum();
//        
//        for(int row=1;row<=rows;row++)
//        {
//        	
//        }
//        
//        File file = new File("C:\\Users\\manpreet.kaur_bitsin\\Desktop\\Java Backup\\HR_Pro_Files\\HRCandidates.ods");
//        
//	    FileOutputStream outputStream = new FileOutputStream(file);
//	    workbook.write(outputStream);
//	    outputStream.close();
//	    workbook.close();
//	    System.out.println("File written successfully");
//	}
	
}
