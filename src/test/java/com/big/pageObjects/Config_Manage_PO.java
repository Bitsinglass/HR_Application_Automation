package com.big.pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.big.utils.ScenarioContext;
import com.big.utils.TestReusables;

public class Config_Manage_PO extends TestReusables{
	public Config_Manage_PO(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	ScenarioContext sc = new ScenarioContext();
	
	@FindBy(xpath = "//li[@data-test-id='dynamic-nav-menu_7']/a")
    public WebElement icon_Config_Manage;
	
	@FindBy(xpath = "//button[@data-test-id='20170301082826089214325']")
    public WebElement btn_Refresh;
	
	@FindBy(xpath = "//h1[text()='Configuration Management']")
    public WebElement header_Config_Manage;
	
	@FindBy(xpath = "//select[@data-test-id='202212200523240081637']")
    public WebElement ddl_RefType;
	
	@FindBy(xpath = "//button[@data-test-id='2016072109232603516456']")
    public WebElement btn_Add;
	
	@FindBy(xpath = "//button[@data-test-id='202212210510360213711']")
    public WebElement btn_Save;
	
	@FindBy(xpath = "//input[@data-test-id='2016072109335505834280']")
    public WebElement inp_NewConfig;
	
	@FindBy(xpath = "//div[@class='loader']")
    public WebElement loader;
	
	@FindBy(xpath = "//div[@data-test-id='202011020429280074262']//div[@data-test-id='202011042325080521889']")
    public WebElement msg_Success;
	
	@FindBy(xpath = "//button[@data-test-id='20161025093458029886575']")
    public WebElement btn_Close;
	
	@FindBy(xpath = "//div[@id='gridBody_right']//tbody/tr/td[1]//span")
    public List<WebElement> table_Rec;
	
	@FindBy(xpath = "//div[@id='gridBody_right']//tbody/tr/td[2]//span/a")
    public List<WebElement> icon_Delete;
	
	@FindBy(xpath = "//button[@data-test-id='202302021451580856845']")
    public WebElement btn_Submit;
	
	@FindBy(xpath = "//div[@node_name='pyGridPaginator']//tr/td[6]//label")
    public WebElement pg_numberofpages;
	
	@FindBy(xpath = "//div[@node_name='pyGridPaginator']//tr/td[7]//button")
    public WebElement btn_nextbutton;
	
	public void click_ConfingManage() throws InterruptedException {
		click(icon_Config_Manage, "Configuration Management icon");
		pageLoader(loader);
		movetoElement(btn_Refresh);
	}
	
	public void verify_Title() {
		String page_Header = header_Config_Manage.getText();
		sc.setContext("Config Manage Page Header",page_Header);
		assertTwoTexts(sc.getContext("Config Manage Page Header"), "Configuration Management");
	}
	
	public void ddl_AdminEmail() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "Admin Email");
		Thread.sleep(3000);
	}
	
	public void addBtn_Admin() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_Admin() throws InterruptedException {
		String admin_Email = rand_String(5)+"@bitsinglass.com";
		sc.setContext("Added Record",admin_Email);
		enterText(inp_NewConfig, "Add new admin email", admin_Email);
		Thread.sleep(2000);
	}
	
	public void saveBtn_Admin() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			System.out.println("Inside Admin Email catch block");
		}
	}
	
	public int pagination()
    {
        int numberofpage=0;
        try {
            if(pg_numberofpages.isDisplayed()==true)
            {
                numberofpage= Integer.valueOf(pg_numberofpages.getText());
            }return numberofpage;
        } catch (Exception e) {
            e.printStackTrace();
            numberofpage = 1;
            return numberofpage; 
        }
    }
	
	public void record_VerifyNdelete() throws InterruptedException
    {
        for(int i=0;i<pagination();i++)
        {
            int k=0;
            for(int j=0;j<table_Rec.size();j++)
            {
                Thread.sleep(2000);
                System.out.println(table_Rec.get(j).getText());
                if(i>0 && pagination()>0)
                {
                    btn_nextbutton.click();
                    Thread.sleep(4000);
                }
                if(sc.getContext("Added Record").equalsIgnoreCase(table_Rec.get(j).getText()))
                {
                    icon_Delete.get(j).click();
                    Thread.sleep(2000);
                    click(btn_Submit, "Delete confirmation");
                    Thread.sleep(2000);
//                    msg_deleteSuccess.isDisplayed();
                    k++;
                    break;
                }
            }
            if(k>0)
            {
                Writeintoreport("**** The newly added location is deleted successfully ****");
                break;
            }
        }
    }
	
	public void ddl_CandidateStatus() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "Candidate Status");
		Thread.sleep(3000);
	}
	
	public void addBtn_CandidateStatus() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_CandidateStatus() throws InterruptedException {
		String candidate_Status = rand_String(5);
		sc.setContext("Added Record",candidate_Status);
		enterText(inp_NewConfig, "Add new Candidate Status", candidate_Status);
		Thread.sleep(2000);
	}
	
	public void saveBtn_CandidateStatus() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
			}
		} catch (Exception e) {
			System.out.println("Inside Candidate Status catch block");
		}
	}
	
	public void ddl_Department() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "Department");
		Thread.sleep(3000);
	}
	
	public void addBtn_Department() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_Department() throws InterruptedException {
		String Department = rand_String(5);
		sc.setContext("Added Record",Department);
		enterText(inp_NewConfig, "Add new Department", Department);
		Thread.sleep(2000);
	}
	
	public void saveBtn_Department() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
			}
		} catch (Exception e) {
			System.out.println("Inside Department catch block");
		}
	}
	
	public void ddl_EmployeeType() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "Employment Type");
		Thread.sleep(3000);
	}
	
	public void addBtn_EmployeeType() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_EmployeeType() throws InterruptedException {
		String employee_Type = rand_String(5);
		sc.setContext("Added Record",employee_Type);
		enterText(inp_NewConfig, "Add new Employee Type", employee_Type);
		Thread.sleep(2000);
	}
	
	public void saveBtn_EmployeeType() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
			}
		} catch (Exception e) {
			System.out.println("Inside Employee Type catch block");
		}
	}
	
	public void ddl_HRMMailCC() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "HRMMailRecipientsCC");
		Thread.sleep(3000);
	}
	
	public void addBtn_HRMMailCC() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_HRMMailCC() throws InterruptedException {
		String HRMMailCC = rand_String(5)+"@bitsinglass.com";
		sc.setContext("Added Record",HRMMailCC);
		enterText(inp_NewConfig, "Add new HRMMailCC", HRMMailCC);
		Thread.sleep(2000);
	}
	
	public void saveBtn_HRMMailCC() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
			}
		} catch (Exception e) {
			System.out.println("Inside HRMMailCC catch block");
		}
	}
	
	public void ddl_HRMMailTO() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "HRMMailRecipientsTo");
		Thread.sleep(3000);
	}
	
	public void addBtn_HRMMailTO() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_HRMMailTO() throws InterruptedException {
		String HRMMailTO = rand_String(5)+"@bitsinglass.com";
		sc.setContext("Added Record",HRMMailTO);
		enterText(inp_NewConfig, "Add new HRMMailCC",HRMMailTO );
		Thread.sleep(2000);
	}
	
	public void saveBtn_HRMMailTO() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
			}
		} catch (Exception e) {
			System.out.println("Inside HRMMailTO catch block");
		}
	}
	
	public void ddl_HighestQualification() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "Highest Qualification");
		Thread.sleep(3000);
	}
	
	public void addBtn_HighestQualification() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_HighestQualification() throws InterruptedException {
		String HighestQualification = rand_String(5);
		sc.setContext("Added Record",HighestQualification);
		enterText(inp_NewConfig, "Add new Highest Qualification", HighestQualification);
		Thread.sleep(2000);
	}
	
	public void saveBtn_HighestQualification() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
			}
		} catch (Exception e) {
			System.out.println("Inside Highest Qualification catch block");
		}
	}
	
	public void ddl_JobStatus() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "Job Status");
		Thread.sleep(3000);
	}
	
	public void addBtn_JobStatus() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_JobStatus() throws InterruptedException {
		String HighestQualification = rand_String(5);
		sc.setContext("Added Record",HighestQualification);
		enterText(inp_NewConfig, "Add new Job Status", rand_String(5));
		Thread.sleep(2000);
	}
	
	public void saveBtn_JobStatus() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
			}
		} catch (Exception e) {
			System.out.println("Inside Job Status catch block");
		}
	}
	
	public void ddl_Location() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "Location");
		Thread.sleep(3000);
	}
	
	public void addBtn_Location() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_Location() throws InterruptedException {
		String Location = rand_String(5);
		sc.setContext("Added Record",Location);
		enterText(inp_NewConfig, "Add new Job Status", Location);
		Thread.sleep(2000);
	}
	
	public void saveBtn_Location() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
			}
		} catch (Exception e) {
			System.out.println("Inside Location catch block");
		}
	}
	
	public void ddl_OfferStatus() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "Offer Status");
		Thread.sleep(3000);
	}
	
	public void addBtn_OfferStatus() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_OfferStatus() throws InterruptedException {
		String Offer_Status = rand_String(5);
		sc.setContext("Added Record",Offer_Status);
		enterText(inp_NewConfig, "Add new Offer Status", Offer_Status);
		Thread.sleep(2000);
	}
	
	public void saveBtn_OfferStatus() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
			}
		} catch (Exception e) {
			System.out.println("Inside Offer Status catch block");
		}
	}
	
	public void ddl_Role() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "Role");
		Thread.sleep(3000);
		
		
	}
	
	public void addBtn_Role() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_Role() throws InterruptedException {
		String Role = rand_String(5);
		sc.setContext("Added Record",Role);
		enterText(inp_NewConfig, "Add new Role", Role);
		Thread.sleep(2000);
	}
	
	public void saveBtn_Role() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
	}
	
	public void ddl_Source() throws InterruptedException {
		selectByText(ddl_RefType, "Reference Type DDL", "Source");
		Thread.sleep(3000);
	}
	
	public void addBtn_Source() throws InterruptedException {
		click(btn_Add, "Add Button");
		Thread.sleep(2000);
	}
	
	public void input_Source() throws InterruptedException {
		String Source = rand_String(5);
		sc.setContext("Added Record",Source);
		enterText(inp_NewConfig, "Add new Source", Source);
		Thread.sleep(2000);
	}
	
	public void saveBtn_Source() throws InterruptedException {
		click(btn_Save, "Save button");
		pageLoader(loader);
		Thread.sleep(3000);
		try {
			if(msg_Success.isDisplayed()==true) {
				click(btn_Close, "Close button");
			}
		} catch (Exception e) {
			System.out.println("Inside Offer Status catch block");
		}
	}
}
