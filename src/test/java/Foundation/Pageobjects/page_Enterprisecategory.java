package Foundation.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Foundation.Library.commonMethods;


public class page_Enterprisecategory extends commonMethods 

{
	

	
	@FindBy(css="a[title='Setup']")
	public WebElement Setup;
	
	@FindBy(xpath="//a[text()='Enterprise Setup']")
	public WebElement EnterpriseSetup;
	
	@FindBy(xpath="//a[text()='Enterprise Categories']")
	public WebElement Enterprisecategory;
	
	
	@FindBy(id="iFrame")
	public static WebElement Frame;
	
	@FindBy(css="	input[id='btnAdd']")
	public WebElement Add;
	
	
	@FindBy(id="fancybox-frame")
	public WebElement Addframe;
	
	@FindBy(css="input[id='txtName']")
	public WebElement Name;
	
	@FindBy(css="select[id='ddlStatus']")
	public WebElement Status;
	
	@FindBy(css="input[name='btnSave']")
	public WebElement Save;
	
	@FindBy(css="span[id='dialogTrue'][class='btnInput']")
	public WebElement Ok;
	
	@FindBy(xpath="//div[@id='messageContent']")
	public WebElement Confirmmsg;
	
	@FindBy(xpath="//div[@id='DIVdialog']/div[@id='messageContent' and @class='msgFailure']")
	public WebElement msgFailure;
	
	@FindBy(css="span[id='dialogTrue'][ class='btnInput'][style^='margin']")
	public WebElement ConfirnOK;
	
	@FindBy(css="span[id='dialogFalse'][style^='display']")
	public WebElement FailureOK;
	
	
	@FindBy(css="input[id='btnClose']")
	public WebElement Close;
	
	@FindBy(css="img[id='btnToggleFilterBartblEnterpriseCategoryList']")
	public WebElement filterIcon;
	
	@FindBy(xpath="(//input[@class='search_init text_filter'])[1]")
	public WebElement searchTextbox;
	
	@FindBy(xpath="//table[@id='tblEnterpriseCategoryList']/tbody/tr/td/a")
	public WebElement updateName;
	
	@FindBy(css="input[id^='chktblEnterpriseCategoryList']")
	public WebElement checkBox;
	
	@FindBy(css="a[id='btnDelete']")
	public WebElement delete;
	
	@FindBy(css="span[id='dialogTrue'][ class='btnInput']")
    public WebElement delok;
	
	
	
	
	
	
	
	
	
	
public page_Enterprisecategory(WebDriver ldriver)
	{
		page_Enterprisecategory.driver=ldriver;
	}
	
	public void addEnterprisecategory(String name,String status) throws InterruptedException
	{
		
	
		commonMethods.Click(Setup);
		commonMethods.Click(EnterpriseSetup);
		commonMethods.Click(Enterprisecategory);
		//commonMethods.wait(driver, 1, Add);
		 Thread.sleep(2000);
		  driver.switchTo().frame(Frame);
		commonMethods.Click(Add);
        Thread.sleep(2000);
        driver.switchTo().frame(Addframe);
		commonMethods.settext(Name, name);
		commonMethods.Click(Save);
		commonMethods.Click(ConfirnOK);
		 driver.switchTo().defaultContent();
		
		
	}
	
	public void updateEnterprisecategory(String value,String updatename) throws InterruptedException
	{
		driver.switchTo().frame(Frame);
		commonMethods.Click(filterIcon);
		Thread.sleep(2000);
		 commonMethods.settext(searchTextbox, value);
		Thread.sleep(2000);
		commonMethods.Click(updateName);
		driver.switchTo().frame(Addframe);
	     Name.clear();
		commonMethods.settext(Name, updatename);
	    commonMethods.Click(Save);
		commonMethods.Click(ConfirnOK);
		
	                               
	}
	
	public void deleteEnterprisecategory(String dname) throws InterruptedException
	{
		
		
		driver.switchTo().frame(Frame);
		commonMethods.Click(filterIcon);
		searchTextbox.clear();
		 commonMethods.settext(searchTextbox, dname);
		 Thread.sleep(2000);
		 commonMethods.Click(checkBox);
		 commonMethods.Click(delete);
		 commonMethods.Click(delok);
		 Thread.sleep(2000);
		 commonMethods.Click(ConfirnOK);
		 
		
	}
	
}
		
		
		
