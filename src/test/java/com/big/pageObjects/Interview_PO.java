package com.big.pageObjects;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.big.utils.TestReusables;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Interview_PO extends TestReusables {
	
		// CASE STATUS
//		@FindBy(xpath="//div[@node_name='CaseDetails']/div[2]/div//div[@node_name='HeaderStatus']//span")
		@FindBy(xpath="//span[text()='Pending-Screening']")	
		WebElement Screening_Round_Status;	
		
		
		//GO BUTTON - TO SCREENING ROUND STAGE 
		@FindBy(xpath ="//div[@node_name='pyToDoItem']/div/div[3]//button")
		WebElement Screening_Go_Btn;	
			
		@FindBy(xpath ="//span[text()='Candidate Screening']")
		WebElement Screening_FBHeading;				
		
		@FindBy(xpath ="//label[text()='Approve']")
		WebElement Screening_Approve;
		
		@FindBy(xpath ="//input[@type='radio' and @id='32facc6dApprove']")
		WebElement Screening_Approve_cb;
			
		@FindBy(xpath ="//label[text()='Reject']")
		WebElement Screening_Reject;
		
		@FindBy(xpath ="//input[@type='radio' and @id='32facc6dReject']")
		WebElement Screening_Reject_CB;
		
		@FindBy(xpath ="//span[@class='textAreaExpandStyle ']/textarea")
		WebElement Screening_Comment;
		
		@FindBy(xpath ="//button[text()='Submit']")
		WebElement Screening_Submit;	
			
		@FindBy(xpath ="//span[text()='        Confirmation       ' and @id='modaldialog_hd_title']")
		WebElement Confirmation_Heading;
		
		@FindBy(xpath ="//button[text()='Submit' and @data-test-id='202302201022520834243']")
		WebElement Confirmation_Submit;
		
		@FindBy(xpath ="//span[text()='Candidate screening is completed']")
		WebElement Screening_CompletionMsg;
		
		
		
		
		// PAGE HEADING  - L1
		@FindBy(xpath ="//span[text()='Add Interviewer For L1 Round' and @data-test-id='20190208081744082517799']")
		WebElement ToDo_InterviewerL1;

		@FindBy(xpath ="//div[@node_name='pyToDoItem']/div/div[3]//button")
		WebElement InterviewerL1_Go_Btn;

		@FindBy(xpath ="//input[@data-test-id='202212210205410475618']")
		WebElement InterviewerL1_Email;
		
		@FindBy(xpath ="//input[@data-test-id='202212210205410474653']")
		WebElement InterviewerL1_Name;
		
		@FindBy(xpath ="//select[@data-test-id='202212210205410475507']")
		WebElement Interview_Type;
			
		@FindBy(xpath ="//select[@data-test-id='202212210205410475507']/option")
		List<WebElement> Interview_TypeOptions;
		
		@FindBy(xpath ="//input[@data-test-id='202212210212410990814']")
		WebElement Interview_DateTime;
				
		@FindBy(xpath ="//div//img[@alt='Choose from calendar']")
		WebElement Calendar_Icon;
		
		@FindBy(xpath ="//td[@class='calcell today selected']")
		WebElement TodayDate;
		
		@FindBy(xpath ="//span[@id='minSpinner']//button[@class='spin-button spin-up']")
		WebElement Minute_UpArrow;
		
		@FindBy(xpath ="//span[@id='hourSpinner']//button[@class='spin-button spin-up']")
		WebElement Hour_Up;
		
		@FindBy(xpath ="//span[@id='minSpinner']//input[@class='spinner-input']")
		WebElement Minute_Value;
		
		@FindBy(xpath ="//input[@data-test-id='202212210208130479982']")
		WebElement Meeting_Link;
		
		@FindBy(xpath ="//textarea[@data-test-id='202212210212410990542']")
		WebElement Address;
		
		// SUBMIT BUTTON
		@FindBy(xpath ="//button[text()='Submit']")
		WebElement L1_Submit;
		
		@FindBy(xpath ="//span[text()='L1 Interview is now scheduled']")
		WebElement L1Schedule_CompletionMsg;
		
		@FindBy(xpath ="//div[@data-test-id='20190206080236048636']//div[@section_index='2']/div/div/div/div[@index='3']//span/button")
		WebElement L1InterviewFeedback_Go;
		
		@FindBy(xpath ="//div[@data-node-id='pyCaseActionAreaTitle']/div/div[1]//span")
		WebElement L1_FBPageHeading;
		
		@FindBy(xpath ="//input[@type='radio' and @id='7b06a625Approve']")
		WebElement L1_Approve_cb;

		@FindBy(xpath ="//input[@type='radio' and @id='7b06a625Reject']")
		WebElement L1_Reject_CB;	
		
		@FindBy(xpath ="//span[@data-test-id='202302220634260345957' and text()='L1 Interview is completed. ']")
		WebElement L1_Completion_Success;
	
		
		
//		// GO BUTTON TO ENTER L2 DETAILS
//		@FindBy(xpath ="//span[text()='Add Interviewer details For L2' and @data-test-id='20190208081744082517799']")
//		WebElement Go_InterviewerL2;
		
		@FindBy(xpath ="//button[text()='View all']")
		WebElement ViewALLBtn;
		
		@FindBy(xpath ="//div[@node_name='pyAssignmentListFlat']//div[@section_index='2']/div/div[1]/div[last()-1]//span/button")
		WebElement L2Round_Go_Btn;
		
		@FindBy(xpath ="//span[@data-test-id='202302220634260345957' and text()='L2 Interview is now scheduled']")
		WebElement L2Round_Schedule_Success;	
		
		@FindBy(xpath ="//div[@node_name='pyAssignmentListFlat']//div[@section_index='2']/div/div[1]/div[last()-1]//span/button")
		WebElement Go_L2FB;
		
		@FindBy(xpath ="//span[text()='L2 Interview' and @data-test-id='20150116110353086421138']")
		WebElement L2_FBPageHeading;
		
		@FindBy(xpath ="//input[@type='radio' and @id='ce6737eeApprove']")
		WebElement L2_Approve_CB;
		
		@FindBy(xpath ="//input[@type='radio' and @id='ce6737eeReject']")
		WebElement L2_Reject_CB;
			
		
		
		// SKIP L2 ROUND
		@FindBy(xpath ="//label[text()='Skip L2 Interview']")
		WebElement SkipL2_Label;
			
		@FindBy(xpath ="//input[@name='$PpyWorkPage$pSkipL2Interview' and @type='checkbox']")
		WebElement SkipL2_CB;
			
		@FindBy(xpath="//span[text()='L1 Interview is completed and Moved to Operational round.']")	
		WebElement SkipL2_Completion;
	
		
		// REQ L3 ROUND
		@FindBy(xpath ="//label[text()='Require another round?']")
		WebElement ReqL3_Label;
		
		@FindBy(xpath ="//input[@name='$PpyWorkPage$pInterviewerDetails$l2$pConsiderForFurtherRoundsOfInterview' and @type='checkbox']")
		WebElement ReqL3_CB;
		
		@FindBy(xpath="//span[text()='L2 Interview is completed.']")	
		WebElement L2_Completion;
		
		
		// L3 STAGES
		@FindBy(xpath ="//div[@section_index='2']//button[text()='View all']")
		WebElement L3Round_GoView;
			
		@FindBy(xpath ="//div[@data-test-id='20190206080236048636']/div[last()-1]/div/div/div[3]//span/button")
		WebElement L3Round_Go_Btn;
		
		@FindBy(xpath ="//span[text()='L3 Interview is now scheduled.']")
		WebElement L3_Schedule_Success;	
		
		@FindBy(xpath ="//div[@data-test-id='20190206080236048636']/div[last()-1]/div/div/div[3]//span/button")
		WebElement Go_L3FB;
		
		@FindBy(xpath ="//span[text()='L3 Interview']")
		WebElement L3_FBPageHeading;
		
		@FindBy(xpath ="//input[@type='radio' and @id='ce6737eeApprove']")
		WebElement L3_Approve_CB;
		
		@FindBy(xpath ="//input[@type='radio' and @id='ce6737eeReject']")
		WebElement L3_Reject_CB;
		
		@FindBy(xpath="//span[text()='L3 Interview is completed.']")	
		WebElement L3_Completion;
		
		
		
		// OPERATION ROUND
		
		static List<String> offerLetterList = new ArrayList<String>();	
		
		@FindBy(xpath="//div[@section_index='2']//button[text()='View all']")
		WebElement L3_ViewAll;	
		
		@FindBy(xpath="//div[@section_index='2']/div/div/div[last()-1]//span/button")
		WebElement Opr_Go;
		
		@FindBy(xpath="//span[@class='heading_3' and text()='Operation Round']")
		WebElement OprRound_Heading;
		
		@FindBy(xpath="//select[@data-test-id='202212220330170582676']")
		WebElement OfferLetter_DD;
		
		
		@FindBy(xpath="//select[@data-test-id='202302210713070876266']")
		WebElement FinalOfferLetter_DD;
		
		@FindBy(xpath="//img[@name='CalendarImg-de6196fe']")
		WebElement JoiningCalendar;
		
		@FindBy(xpath="//td[@class='calcell today selected']")
		WebElement JoiningDate;
		
		@FindBy(xpath="//td[@class='calcell today selected']/a")
		WebElement TodayDateAttribute;
		
		@FindBy(xpath="//td[@class='calcell']/a[@data-day='1']")
		WebElement SelectJoiningDate;
		
		@FindBy(xpath="//span[text()='Pending-FinalApproval']")
		WebElement Opr_Completion;
		
		@FindBy(xpath="//div[@section_index='2']/div/div/div[last()-1]//span/button")
		WebElement FinalGO;
		
		@FindBy(xpath="//div[@section_index='2']//button[text()='View all']")
		WebElement Final_ViewAll;
		
		@FindBy(xpath="//input[@data-test-id='202212220342420255853']")
		WebElement Designation;
		
		@FindBy(xpath="//input[@data-test-id='202212220344070760975']")
		WebElement CTCOffered;
		
		@FindBy(xpath="//div[@data-test-id='201905170004100834989']//div[@class='content-item content-field item-1 flex flex-row dataValueRead']//span")
		WebElement Final_Heading;
		
		@FindBy(xpath="//span[text()='Resolved-Rejected']")
		WebElement CaseRejectionCompletion;
		
		@FindBy(xpath="//span[text()='Resolved-Completed']")
		WebElement CaseApprovedCompletion;

	
		
		// JOINING DATE HANDLING
		@FindBy(xpath="//tbody[@id='controlCalBody']/tr/td/a")
		List<WebElement> CalendarAllDates;
		
		@FindBy(xpath="//table[@id='Pega_Cal_Cont']//tbody[@id='controlCalBody']/tr/td[@class='calcell today selected']/a")
		WebElement CalenderTodayDate;
		
		@FindBy(xpath="//span[@id='monthSpinner']/span/button[1]")
		WebElement Month_UpBtn;	
		
		@FindBy(xpath="//table[@id='Pega_Cal_Cont']//tbody[@id='controlCalBody']/tr/td[@class='calcell']/a[@data-day='1']")
		WebElement NextMonthDate;
		
		
		//WEB ELEMENT METHODS
		public void Add_offerLetterList()
		{
			offerLetterList.add("Approved");  
			offerLetterList.add("On Hold");  
			offerLetterList.add("Rejected");  
			offerLetterList.add("Dropped Out"); 
			System.out.println(offerLetterList);
		}
		
		
		public void Click_Go_Screening() throws InterruptedException {
			
			
			System.out.println(getText(Screening_Round_Status));
			if (getText(Screening_Round_Status).equalsIgnoreCase("Pending-Screening"))
			{
				Thread.sleep(3000);
				click(Screening_Go_Btn,"Go Button to enter screening stage");
			}	
			System.out.println("Screening go button clicked");
		}
		
		public void Approve_Screening() throws InterruptedException
		{
			System.out.println(getText(Screening_FBHeading));	
			if (getText(Screening_FBHeading).equalsIgnoreCase("Candidate Screening"))
			{
				click(Screening_Approve,"Approve screening stage");
				Thread.sleep(2000);			
				if (Screening_Approve_cb.isSelected()==true) 
				{
					click(Screening_Comment,"Screening_CommentBox");
					enterText(Screening_Comment,"Screening_CommentBox" , "Screening Approved");
				}
			}	
			System.out.println("screening approve btn clicked");
		}
		
		
		public void Reject_Screening() throws InterruptedException {
			System.out.println(getText(Screening_FBHeading));			
			if (getText(Screening_FBHeading).equalsIgnoreCase("Candidate Screening"))
			{
				click(Screening_Reject,"Approve screening stage");
				Thread.sleep(2000);
				System.out.println("rejected true verify: " + Screening_Reject_CB.isSelected());
				if (Screening_Reject_CB.isSelected()==true)
				{
					enterText(Screening_Comment,"Screening_CommentBox" , "Screening Rejected");
				}	
			}	
			System.out.println("screening rejection btn clicked");
		}
		
		public void Click_FeedbackSubmit() {
			click(Screening_Submit,"Submit Button clicked post feedback");
			System.out.println("round feedback submitted");
		}		
		
		public void Click_ConfirmationSubmit() {
			System.out.println(getText(Confirmation_Heading));
			if (getText(Confirmation_Heading).equalsIgnoreCase("Confirmation"))
			{
				click(Confirmation_Submit,"Submit Button clicked post confirmation");
			}		
			System.out.println("confirmaton submit clicked");
		}
		
		
		public void Get_ScreeningCompletion()
		{
			try {
				if (getText(Screening_CompletionMsg).equalsIgnoreCase("Candidate screening is completed")) 
				{
					System.out.println("Candidate screening stage is completed");
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}		
			System.out.println("screening completion msg displayed");
		}
		
		public void Click_Go_ToEnterL1() throws InterruptedException
		{
			System.out.println("screening completion t/f : "+Screening_CompletionMsg.isDisplayed());
			Thread.sleep(2000);
			
			if (Screening_CompletionMsg.isDisplayed()==true)
			{
				Thread.sleep(2000);
				click(InterviewerL1_Go_Btn,"Go Button to enter InterviewerL1 details");
				System.out.println("L1 GO CLICKED");
			}		
		}	
		
		public void Enter_InterviewerEmail() throws InterruptedException 
		{
				enterText(InterviewerL1_Email,"Interviewer Email" , "manpreet.kaur@bitsinglass.com");
				keybordentry("Down");
				Thread.sleep(3000);
				keybordentry("Down");
				Thread.sleep(3000);
				keybordentry("Enter");
				Thread.sleep(5000);
				System.out.println("INTERVIEWER EMAIL ENTERED");
		}
		
		
		public void Enter_InterviewerName() throws InterruptedException {
			Thread.sleep(3000);
			enterText(InterviewerL1_Name,"Interviewer Name" , "Manpreet Kaur");
			Thread.sleep(3000);
		}
		
		
		public void Select_InterviewerType() throws InterruptedException
		{
			
			int interTypessize = Interview_TypeOptions.size();
			ThreadLocalRandom random = ThreadLocalRandom.current();
			int randType = random.nextInt(1, interTypessize);
			System.out.println(randType);
			
			
			Thread.sleep(2000);
			click(Interview_Type, "InterviewTypeDD");
			System.out.println("INTERVIEW TYPE clicked");
			Thread.sleep(3000);
			selectByIndex(Interview_Type, "InterviewTypeDD", randType);
			Thread.sleep(3000);
			
		}
		
		public void Enter_Interview_Venue() throws InterruptedException {		
			System.out.println("interview type selected: " +getSelectedOption(Interview_Type,"InterviewTypeDD"));		
			if (getSelectedOption(Interview_Type,"InterviewTypeDD").equalsIgnoreCase("Online")) 
			{
				Thread.sleep(2000);
				enterTextUnsingJS(Meeting_Link,"Meeting URL for online interview" , "test meeting Link");
				System.out.println("INTERVIEW TYPE ENTERED - online");
				Thread.sleep(3000);
			}
			if (getSelectedOption(Interview_Type,"InterviewTypeDD").equalsIgnoreCase("Face To Face"))
			{
				Thread.sleep(2000);
				enterTextUnsingJS(Address,"Interview location for offline round" , "interview location");			
				System.out.println("INTERVIEW TYPE ENTERED - offline");
				Thread.sleep(3000);
			}	
		}
		

		public void Enter_DateTime() throws InterruptedException
		{
//			Calendar cal = Calendar.getInstance();
//			SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
//			System.out.println("Today's date = " + simpleformat.format(cal.getTime()));
//
//			if (simpleformat.format(cal.getTime()).charAt(0) == '0') {
//				char today_day = simpleformat.format(cal.getTime()).charAt(1);
//				System.out.println(today_day);
//			}
//
//			else {
//				Format f = new SimpleDateFormat("dd");
//				String strDay = f.format(new Date());
//				System.out.println("Day Number = " + strDay);
//			}
			
			// minute less than 59
//			Thread.sleep(2000);
//			click(Calendar_Icon,"Calendar_Icon");
//			Thread.sleep(2000);
//			click(Minute_UpArrow,"Minute_UpArrow");
//			Thread.sleep(2000);
//			click(Minute_UpArrow,"Minute_UpArrow");
//			Thread.sleep(2000);
//			click(TodayDate,"TodayDate");
//			Thread.sleep(3000);
//			System.out.println("INTERVIEWER DATE ENTERED");
			
			click(Calendar_Icon,"Calendar_Icon");
			System.out.println("CALENDAR CLICKED");
			System.out.println(getText(Minute_Value));		// NOT READING VALUES
			
			System.out.println("COMPARING MIN VALUE:");	
			System.out.println(getText(Minute_Value)=="58" || getText(Minute_Value)=="59");
			
			if (getText(Minute_Value)=="58" || getText(Minute_Value)=="59")
			{
				Thread.sleep(3000);
				click(Hour_Up,"Hour_Up");
				Thread.sleep(3000);
				enterText(Minute_Value, "Enter min 02 ", "02");
				Thread.sleep(3000);
			}
			else
			{
				click(Minute_UpArrow,"Minute_UpArrow");
				Thread.sleep(2000);
				click(Minute_UpArrow,"Minute_UpArrow");
				Thread.sleep(2000);
				click(TodayDate,"TodayDate");
				Thread.sleep(3000);
			}			
		}
		
		public void L1_Details_Submit () throws InterruptedException {
			Click_FeedbackSubmit();
			Click_ConfirmationSubmit();
			System.out.println("INTERVIEW DETAILS SUBMITTED ");
		}
		
		
		public void Click_Go_L1Feedback() throws InterruptedException
		{
			Thread.sleep(5000);
			click(L1InterviewFeedback_Go,"Go Button to enter L1 feedback page");
			
//			String l1schedulecompletemsg = getText(L1Schedule_CompletionMsg);
//			System.out.println("l1 schedule completion msg: " + l1schedulecompletemsg);
//			System.out.println(l1schedulecompletemsg.equalsIgnoreCase("L1 Interview is now scheduled"));
//				
//				try {
//					System.out.println("Inside try");
//					if (l1schedulecompletemsg.equalsIgnoreCase("L1 Interview is now scheduled"))
//					{System.out.println("Inside if");
//						Thread.sleep(3000);
//						click(L1InterviewFeedback_Go,"Go Button to enter L1 feedback page");
//						Thread.sleep(3000);
//						System.out.println("Go Button to enter L1 feedback page clicked");
//					}
//				} catch (InterruptedException e) {
//					System.out.println("Inside catch");
//					click(L1InterviewFeedback_Go,"Go Button to enter L1 feedback page");
//					e.printStackTrace();
//				}
		}
	
		
		public void Approve_L1() throws InterruptedException
		{		
			while (Screening_Submit.isEnabled()==false)
			{
				Thread.sleep(50000);
				driver.navigate().refresh();
			}
			
			System.out.println(getText(L1_FBPageHeading));	
			if (getText(L1_FBPageHeading).equalsIgnoreCase("L1 Interview"))
			{
				click(Screening_Approve,"Approve screening stage");
				Thread.sleep(2000);			
				if (L1_Approve_cb.isSelected()==true) 
				{
					click(Screening_Comment,"Screening_CommentBox");
					enterText(Screening_Comment,"L1_CommentBox" , "L1 Round Approved");
					Thread.sleep(3000);
				}
			}		
		}
		
		
		public void Reject_L1() throws InterruptedException {
			
			while (Screening_Submit.isEnabled()==false)
			{
				Thread.sleep(50000);
				driver.navigate().refresh();
			}
			System.out.println(getText(L1_FBPageHeading));	
			if (getText(L1_FBPageHeading).equalsIgnoreCase("L1 Interview"))
			{
				click(Screening_Reject,"Approve screening stage");
				Thread.sleep(2000);
				if (L1_Reject_CB.isSelected()==true)
				{
					enterText(Screening_Comment,"L1_CommentBox" , "L1 Round Rejected");
				}	
			}			
		}		
		
		public void Click_L1FeedbackSubmit() throws InterruptedException {
			Click_FeedbackSubmit();
			Click_ConfirmationSubmit();
			Thread.sleep(3000);
		}
		
		
		public void Click_ViewAll() throws InterruptedException 
		{
			Thread.sleep(5000);
			click(ViewALLBtn, "ViewALLBtn");
			Thread.sleep(5000);	
		}
		
		
		public void Click_Go_ToEnterL2() throws InterruptedException {
			String L1_msg = getText(L1_Completion_Success);
			System.out.println(L1_msg);
			System.out.println(L1_Completion_Success.isDisplayed());
			
			if (L1_Completion_Success.isDisplayed()==true)
			{
				click(L2Round_Go_Btn,"Go Button to enter InterviewerL2 details");
				Thread.sleep(5000);
			}
		}
		
		public void Enter_L2_Deatils() throws InterruptedException {
			Thread.sleep(5000);
			Enter_InterviewerEmail();
			Enter_InterviewerName();
			Select_InterviewerType();
			Enter_DateTime();
			Enter_Interview_Venue();
			L1_Details_Submit ();
		}
		
		public void Click_Go_L2Feedback() throws InterruptedException
		{
			String l2schedulecompletemsg = getText(L2Round_Schedule_Success);
			System.out.println("case status" + l2schedulecompletemsg);
			
			if (l2schedulecompletemsg.equalsIgnoreCase("L2 Interview is now scheduled"))
			{
				click(Go_L2FB,"Go Button to enter L2 feedback page");
			}		
		}
		
		public void Approve_L2() throws InterruptedException
		{
			while (Screening_Submit.isEnabled()==false)
			{
				Thread.sleep(50000);
				driver.navigate().refresh();
			}	
			System.out.println(getText(L2_FBPageHeading));
			if (getText(L2_FBPageHeading).equalsIgnoreCase("L2 Interview"))
			{
				click(Screening_Approve,"Approve screening stage");
				Thread.sleep(2000);			
				if (L2_Approve_CB.isSelected()==true) 
				{
					click(Screening_Comment,"Screening_CommentBox");
					enterText(Screening_Comment,"L2_CommentBox" , "L2 Round Approved");
				}
			}		
		}
		
		
		public void Reject_L2() throws InterruptedException {	
			
			while (Screening_Submit.isEnabled()==false)
			{
				Thread.sleep(50000);
				driver.navigate().refresh();
			}
			System.out.println(getText(L2_FBPageHeading));	
			if (getText(L2_FBPageHeading).equalsIgnoreCase("L2 Interview"))
			{
				click(Screening_Reject,"Approve screening stage");
				Thread.sleep(2000);
				if (L2_Reject_CB.isSelected()==true)
				{
					enterText(Screening_Comment,"L2_CommentBox" , "L2 Rejected");
				}	
			}			
		}	
		
		public void Click_L2FeedbackSubmit() {
			Click_FeedbackSubmit();
			Click_ConfirmationSubmit();
		}
		
		
		public void Click_SkipL2 () throws InterruptedException
		{
			click(SkipL2_Label,"SkipL2 Label");
			Thread.sleep(2000);
		}
		
		
		public void Get_SkipL2_Completion()
		{
			System.out.println(getText(SkipL2_Completion));
			if (getText(SkipL2_Completion).equalsIgnoreCase("L1 Interview is completed and Moved to Operational round.")) 
			{
				System.out.println("L2 Round has been skipped and case moved to Operations round.");
			}
		}	
		
		
		public void Click_ReqL3 ()
		{
			click(ReqL3_Label,"SkipL2 Label");
		}
		
		public void Get_l2Completion() {
			if (getText(L2_Completion).equalsIgnoreCase("L2 Interview is completed."))
			{
				System.out.println("L2 Round completed and case moves to L3 Stage.");
			}
		}	
		
		public void Click_L3Round_GoView() throws InterruptedException {
				Thread.sleep(3000);
				click(L3Round_GoView,"View ALL InterviewerL3 Clicked");
				Thread.sleep(5000);
			}
		
		public void Click_Go_ToEnterL3() throws InterruptedException {
			click(L3Round_Go_Btn,"Go Button to enter InterviewerL3 details");
			
			
//			System.out.println("before click of go of l2 details:  " + getText(L2_Completion));	
//			System.out.println(getText(L2_Completion).equalsIgnoreCase("L2 Interview is now scheduled"));
//			try {
//				if (getText(L2_Completion).equalsIgnoreCase("L2 Interview is now scheduled"))
//				{
//					click(L3Round_Go_Btn,"Go Button to enter InterviewerL3 details");
//					Thread.sleep(3000);
//					System.out.println("tried if, clicked go l3");
//				}
//			}
//				catch (Exception e)
//				{
//					e.printStackTrace();
//					click(L3Round_Go_Btn,"Go Button to enter InterviewerL3 details");
//					Thread.sleep(3000);
//					System.out.println("try failed, catch executed, clicked go l3");
//				}
			}
			
		
		public void Enter_L3_Deatils() throws InterruptedException {
			Thread.sleep(3000);
			Enter_InterviewerEmail();
			Enter_InterviewerName();
			Select_InterviewerType();	
			Enter_DateTime();
			Enter_Interview_Venue();		
			L1_Details_Submit();
		}
		
		public void Click_Go_L3Feedback() throws InterruptedException
		{
			click(Go_L3FB,"Go Button to enter L3 feedback page");
			
//			System.out.println(getText(L3_Schedule_Success));
//			System.out.println(getText(L3_Schedule_Success).equalsIgnoreCase("L3 Interview is now scheduled"));
//			if (getText(L3_Schedule_Success).equalsIgnoreCase("L3 Interview is now scheduled"))
//			{
//				click(Go_L3FB,"Go Button to enter L3 feedback page");
//				Thread.sleep(3000);
//			}		
		}
		
		public void Approve_L3() throws InterruptedException
		{
			while (Screening_Submit.isEnabled()==false)
			{
				Thread.sleep(50000);
				driver.navigate().refresh();
			}
			System.out.println(getText(L3_FBPageHeading));
			if (getText(L3_FBPageHeading).equalsIgnoreCase("L3 Interview"))
			{
				click(Screening_Approve,"Approve screening stage");
				Thread.sleep(2000);			
				if (L3_Approve_CB.isSelected()==true) 
				{
					click(Screening_Comment,"Screening_CommentBox");
					enterText(Screening_Comment,"L3_CommentBox" , "L3 Round Approved");
					Thread.sleep(3000);
				}
			}		
		}
		
		
		public void Reject_L3() throws InterruptedException {	
			while (Screening_Submit.isEnabled()==false)
			{
				Thread.sleep(50000);
				driver.navigate().refresh();
			}
			System.out.println(getText(L3_FBPageHeading));
			if (getText(L3_FBPageHeading).equalsIgnoreCase("L3 Interview"))
			{
				click(Screening_Reject,"Approve screening stage");
				Thread.sleep(2000);
				if (L3_Reject_CB.isSelected()==true)
				{
					enterText(Screening_Comment,"L3_CommentBox" , "L3 Rejected");
					Thread.sleep(3000);
				}	
			}			
		}	
		
		public void Click_L3FeedbackSubmit() throws InterruptedException {
			Click_FeedbackSubmit();
			Click_ConfirmationSubmit();
			Thread.sleep(3000);
		}
		
		public void Get_L3Success()
		{
			System.out.println(getText(L3_Completion));
			if (getText(L3_Completion).equalsIgnoreCase("L3 Interview is completed."))
			{
				System.out.println("L3 Round completed sucessfully.");
			}
		}
		
		
	
		public void Click_Opr_Go() throws InterruptedException
		{
			Thread.sleep(5000);
			click(L3_ViewAll,"L3_ViewAll");
			Thread.sleep(5000);
			click(Opr_Go,"Opr_Go");
		}
		
		
		public void Rejected_OfferLetter() throws InterruptedException {
			selectByValue(OfferLetter_DD, "OfferLetter_DD", offerLetterList.get(2));
			Thread.sleep(3000);
		}
	
		public void DroppedOut_OfferLetter() throws InterruptedException {
			selectByValue(OfferLetter_DD, "OfferLetter_DD", offerLetterList.get(3));
			Thread.sleep(3000);
		}
		
		public void Approved_OfferLetter() throws InterruptedException {
			selectByValue(OfferLetter_DD, "OfferLetter_DD", offerLetterList.get(0));
			Thread.sleep(3000);
		}
		
		public void OnHold_OfferLetter() throws InterruptedException {
			selectByValue(OfferLetter_DD, "OfferLetter_DD", offerLetterList.get(1));
			Thread.sleep(3000);
		}
		
		
		public void Select_OfferLetter() throws InterruptedException
		{
//			List<String> offerLetterList = new ArrayList<String>();
//			offerLetterList.add("Approved");  
//			offerLetterList.add("On Hold");  
//			offerLetterList.add("Rejected");  
//			offerLetterList.add("Dropped Out"); 
//			System.out.println(offerLetterList);
//			int offerletter_size = offerLetterList.size();																									
//			ThreadLocalRandom random = ThreadLocalRandom.current();
//			int rand_OL = random.nextInt(0, offerLetterList.size()-1);
//			System.out.println("random list index value: " + offerLetterList.get(rand_OL));
//			selectByValue(OfferLetter_DD, "OfferLetter_DD", offerLetterList.get(1));
//			Thread.sleep(3000);
		}
		
		public void Get_OfferLetterType() throws InterruptedException
		{
			String OfferLetter_DD_Value = getSelectedOption(OfferLetter_DD, "OfferLetter_DD_Value");
			System.out.println("OfferLetter_DD_Value: " + OfferLetter_DD_Value);
			
			if (OfferLetter_DD_Value.equalsIgnoreCase("Approved"))
			{
				System.out.println("-------------------------approved selected-------------------");
				enterText(Designation, "Designation", "Test designation");
				enterText(CTCOffered, "CTCOffered", "60000");
				
				// DATE SELECTION - WORKING EXISTING CODE
//				click(Calendar_Icon,"Calendar_Icon");
//				Thread.sleep(5000);
//				int addDate = 1;
//				String todaydate = getAttributeValue(TodayDateAttribute, "data-day");
//				System.out.println("todaydate: " + todaydate);
//				int dateToSelect = Integer.valueOf(todaydate) + addDate;
//				System.out.println("dateToSelect : " +dateToSelect);
//				driver.findElement(By.xpath("//td[@class='calcell']/a[@data-day="+dateToSelect+"]")).click();
//				Thread.sleep(5000);	
				
				
				// CLICKING CALENDAR ICON
				click(Calendar_Icon,"Calendar_Icon");
				Thread.sleep(5000);
				
				// GETTING TODAY DATE
				String todayDate = getAttributeValue(CalenderTodayDate, "data-day");
				
				// GETTING TOTAL NO OF DATES IF 30 OR 31
				int totalDates = CalendarAllDates.size();
				if (totalDates == 30) {
					System.out.println("30 DAYS MONTH");
					if (Integer.valueOf(todayDate) == 30)
					{
						System.out.println("TODAY DATE IS 30");
						click(Month_UpBtn,"Month_UpBtn");
						Thread.sleep(3000);
						click(NextMonthDate,"NextMonthDate");
					}
					else
					{
						int addDate = 1;
						System.out.println("todaydate: " + todayDate);
						int dateToSelect = Integer.valueOf(todayDate) + addDate;
						System.out.println("dateToSelect : " +dateToSelect);
						driver.findElement(By.xpath("//td[@class='calcell']/a[@data-day="+dateToSelect+"]")).click();
						Thread.sleep(5000);
					}
				}		
				else if (totalDates == 31)
				{
					System.out.println("31 DAYS MONTH");
					if (Integer.valueOf(todayDate) == 31)
					{
						System.out.println("TODAY DATE IS 31");
						click(Month_UpBtn,"Month_UpBtn");
						Thread.sleep(3000);
						click(NextMonthDate,"NextMonthDate");
					}
					else
					{
						System.out.println("NEITHER 30 NOR 31");
						int addDate = 1;
						System.out.println("todaydate: " + todayDate);
						int dateToSelect = Integer.valueOf(todayDate) + addDate;
						System.out.println("dateToSelect : " +dateToSelect);
						driver.findElement(By.xpath("//td[@class='calcell']/a[@data-day="+dateToSelect+"]")).click();
						Thread.sleep(5000);
					}
				
				Click_FeedbackSubmit();
				Click_ConfirmationSubmit();
				Thread.sleep(5000);


				System.out.println(getText(Opr_Completion));
				if (getText(Opr_Completion).equalsIgnoreCase("Pending-FinalApproval"))
				{
					click(Final_ViewAll,"Final_ViewAll");
					Thread.sleep(5000);
					click(FinalGO,"FinalGO");
					System.out.println("FINAL APPROVAL GO CLICKED.");
				}	
	
				System.out.println(getText(Final_Heading));
				if (getText(Final_Heading).equalsIgnoreCase("Final Approval"))
				{
					click(Screening_Submit, "Submit button");
					System.out.println("FINAL APPROVAL SUBMITTED.");
				}
			}
		}

			
			else if (OfferLetter_DD_Value.equalsIgnoreCase("On Hold"))
			{
				System.out.println("-------------------------On Hold selected-------------------");
				enterText(Designation, "Designation", "Test designation");
				enterText(CTCOffered, "CTCOffered", "60000");
				
//				DATE SELECTION - EXISTING CODE
//				click(Calendar_Icon,"Calendar_Icon");
//				Thread.sleep(5000);
//				int addDate = 1;
//				String todaydate = getAttributeValue(TodayDateAttribute, "data-day");
//				System.out.println("todaydate: " + todaydate);
//				int dateToSelect = Integer.valueOf(todaydate) + addDate;
//				System.out.println("dateToSelect : " +dateToSelect);
//				driver.findElement(By.xpath("//td[@class='calcell']/a[@data-day="+dateToSelect+"]")).click();
//				Thread.sleep(5000);	
				
				
				// CLICKING CALENDAR ICON
				click(Calendar_Icon,"Calendar_Icon");
				Thread.sleep(5000);
				
				// GETTING TODAY DATE
				String todayDate1 = getAttributeValue(CalenderTodayDate, "data-day");
				
				// GETTING TOTAL NO OF DATES IF 30 OR 31
				int totalDates1 = CalendarAllDates.size();
				if (totalDates1 == 30) {
					System.out.println("30 DAYS MONTH");
					if (Integer.valueOf(todayDate1) == 30)
					{
						System.out.println("TODAY DATE IS 30");
						click(Month_UpBtn,"Month_UpBtn");
						Thread.sleep(3000);
						click(NextMonthDate,"NextMonthDate");
					}
					else
					{
						int addDate = 1;
						System.out.println("todaydate: " + todayDate1);
						int dateToSelect = Integer.valueOf(todayDate1) + addDate;
						System.out.println("dateToSelect : " +dateToSelect);
						driver.findElement(By.xpath("//td[@class='calcell']/a[@data-day="+dateToSelect+"]")).click();
						Thread.sleep(5000);
					}
				}		
				else if (totalDates1 == 31)
				{
					System.out.println("31 DAYS MONTH");
					if (Integer.valueOf(todayDate1) == 31)
					{
						System.out.println("TODAY DATE IS 31");
						click(Month_UpBtn,"Month_UpBtn");
						Thread.sleep(3000);
						click(NextMonthDate,"NextMonthDate");
					}
					else
					{
						System.out.println("NEITHER 30 NOR 31");
						int addDate = 1;
						System.out.println("todaydate: " + todayDate1);
						int dateToSelect = Integer.valueOf(todayDate1) + addDate;
						System.out.println("dateToSelect : " +dateToSelect);
						driver.findElement(By.xpath("//td[@class='calcell']/a[@data-day="+dateToSelect+"]")).click();
						Thread.sleep(5000);
					}
				
				Click_FeedbackSubmit();
				Click_ConfirmationSubmit();
				Thread.sleep(5000);
				
				System.out.println(getText(Opr_Completion));
				if (getText(Opr_Completion).equalsIgnoreCase("Pending-FinalApproval"))
				{
					click(Final_ViewAll,"Final_ViewAll");
					Thread.sleep(5000);
					click(FinalGO,"FinalGO");
					System.out.println("FINAL APPROVAL GO CLICKED.");
				}	
				
				System.out.println(getText(Final_Heading));
				if (getText(Final_Heading).equalsIgnoreCase("Final Approval"))
				{
					Thread.sleep(2000);
					selectByValue(FinalOfferLetter_DD, "FinalOfferLetter_DD", offerLetterList.get(0));
					Thread.sleep(2000);
					click(Screening_Submit, "Submit button");
					System.out.println("FINAL APPROVAL SUBMITTED.");
				}		
			}
		}
			
			else
			{
				System.out.println("Rejected or dropped out selected");
				Click_FeedbackSubmit();
				Thread.sleep(2000);
				Click_ConfirmationSubmit();
				Thread.sleep(5000);
				System.out.println(getText(CaseRejectionCompletion));
				if (getText(CaseRejectionCompletion).equalsIgnoreCase("Resolved-Completed"))
				{
					System.out.println("Candidate Case - Resolved Rejected");
				}
			}
	 }
		
//		public void Enter_JoiningDate() throws InterruptedException
//		{
//			System.out.println("joining date method");	
//			click(Calendar_Icon,"Calendar_Icon");
//			Thread.sleep(5000);
//			int addDate = 1;
//			String todaydate = getAttributeValue(TodayDateAttribute, "data-day");
//			System.out.println("todaydate: " + todaydate);
//			int dateToSelect = Integer.valueOf(todaydate) + addDate;
//			System.out.println("dateToSelect : " +dateToSelect);
//			driver.findElement(By.xpath("//td[@class='calcell']/a[@data-day="+dateToSelect+"]")).click();
//			Thread.sleep(5000);	
//		}
		
		
		// yet to handle when date equals 31 or month is of 30 days
		public void Enter_JoiningDate1() throws InterruptedException
		{
			// CLICKING CALENDAR ICON
			click(Calendar_Icon,"Calendar_Icon");
			Thread.sleep(5000);
			
			// GETTING TODAY DATE
			String todayDate = getAttributeValue(CalenderTodayDate, "data-day");
			
			// GETTING TOTAL NO OF DATES IF 30 OR 31
			int totalDates = CalendarAllDates.size();
			if (totalDates == 30) {
				if (Integer.valueOf(todayDate) == 30)
				{
					click(Month_UpBtn,"Month_UpBtn");
					Thread.sleep(3000);
					click(NextMonthDate,"NextMonthDate");
				}
				else
				{
					int addDate = 1;
					System.out.println("todaydate: " + todayDate);
					int dateToSelect = Integer.valueOf(todayDate) + addDate;
					System.out.println("dateToSelect : " +dateToSelect);
					driver.findElement(By.xpath("//td[@class='calcell']/a[@data-day="+dateToSelect+"]")).click();
					Thread.sleep(5000);
				}
			}		
			else if (totalDates == 31)
			{
				if (Integer.valueOf(todayDate) == 31)
				{
					click(Month_UpBtn,"Month_UpBtn");
					Thread.sleep(3000);
					click(NextMonthDate,"NextMonthDate");
				}
				else
				{
					int addDate = 1;
					System.out.println("todaydate: " + todayDate);
					int dateToSelect = Integer.valueOf(todayDate) + addDate;
					System.out.println("dateToSelect : " +dateToSelect);
					driver.findElement(By.xpath("//td[@class='calcell']/a[@data-day="+dateToSelect+"]")).click();
					Thread.sleep(5000);
				}
			}	
		}
		
		public void Click_OprSubmit() throws InterruptedException {
			Click_FeedbackSubmit();
			Click_ConfirmationSubmit();
			Thread.sleep(5000);
		}
		
		public void Click_FinalAproval_Go() throws InterruptedException
		{	
			System.out.println(getText(Opr_Completion));
			if (getText(Opr_Completion).equalsIgnoreCase("Pending-FinalApproval"))
			{
				click(Final_ViewAll,"Final_ViewAll");
				Thread.sleep(5000);
				click(FinalGO,"FinalGO");
				System.out.println("FINAL APPROVAL GO CLICKED.");
			}	
		}
		
		public void Submit_FinalAproval()
		{			
			System.out.println(getText(Final_Heading));
			if (getText(Final_Heading).equalsIgnoreCase("Final Approval"))
			{
				click(Screening_Submit, "Submit button");
				System.out.println("FINAL APPROVAL SUBMITTED.");
			}
		}
		
		public void Get_ApprovalStatus()
		{
			System.out.println(getText(CaseApprovedCompletion));
			if (getText(CaseApprovedCompletion).equalsIgnoreCase("Resolved-Completed"))
			{
				System.out.println("Candidate Case - Resolved-Completed post approval of final stage.");
			}
		}
		
		public void Get_RejectionStatus()
		{
			System.out.println(getText(CaseRejectionCompletion));
			if (getText(CaseRejectionCompletion).equalsIgnoreCase("Resolved-Completed"))
			{
				System.out.println("Candidate Case - Resolved Rejected");
			}
		}
}
