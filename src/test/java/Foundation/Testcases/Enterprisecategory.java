package Foundation.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Foundation.Pageobjects.loginPage_Pageobjects;
import Foundation.Pageobjects.page_Enterprisecategory;
import Foundation.factory.baseclass;


public class Enterprisecategory extends baseclass {
	
	
	
	
	@Test(priority=1)
	public void verifylogin()
	{
		loginPage_Pageobjects lg= PageFactory.initElements(driver, loginPage_Pageobjects.class);
		  lg.verifyLoginpage("ndarshanala", "Pmap@098");
		  //commonMethods.wait(driver, 1, lg.userDropdown);
	}
	
	
  @Test(priority=1)
  public void addEnterprisecategory() throws InterruptedException
  {
	  page_Enterprisecategory ec=  PageFactory.initElements(driver, page_Enterprisecategory.class);
	  ec.addEnterprisecategory("category321", "Active");
	  
  }
  
  
/*  @Test(priority=3)
  public void updateEnterprisecategory() throws InterruptedException
  {
	
	page_Enterprisecategory ec=  PageFactory.initElements(driver, page_Enterprisecategory.class);
	 ec.updateEnterprisecategory("category123", "category23");

  }
  
  @Test(priority=4)
  public void deleteEnterprisecategory() throws InterruptedException
  {
	
	page_Enterprisecategory ec=  PageFactory.initElements(driver, page_Enterprisecategory.class);
	 ec.deleteEnterprisecategory("category23");

  }
  */
 
  
  
}
