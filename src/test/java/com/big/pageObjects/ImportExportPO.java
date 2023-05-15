package com.big.pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.big.utils.ScenarioContext;
import com.big.utils.TestReusables;

public class ImportExportPO extends TestReusables {
	public ImportExportPO(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	ScenarioContext sc = new ScenarioContext();
	
	@FindBy(xpath = "//button[@data-test-id='202212220422270558726']")
    public WebElement btn_Export;
	
	@FindBy(xpath = "//button[@data-test-id='202212190745180865370']")
    public WebElement btn_Import;
	
	@FindBy(xpath = "//input[@type='file']")
    public WebElement btn_ChooseFile;
	
	@FindBy(xpath = "//button[text()='  Submit ']")
    public WebElement btn_Submit;
	
	@FindBy(xpath = "//li[@data-test-id='dynamic-nav-menu_5']/a")
    public WebElement btn_CandidateList;
	
	public void click_Export() {
		movetoElement(btn_CandidateList);
		click(btn_CandidateList, "Candidate of List");
		Set<String> handles= getWindowHandles();
        List<String>handle= new ArrayList<String>();
        handle.addAll(handles);
		click(btn_Export, "Export Button");
		getWindowHandles();
	    
        switchToWindow(handle.get(1));
		driver.close();
//		driver.findElement(By.xpath("//div[@class="+"'"+abc+"'"+"]"));
	}
}


