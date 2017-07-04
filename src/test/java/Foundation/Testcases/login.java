package Foundation.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Foundation.Pageobjects.loginPage_Pageobjects;
import Foundation.factory.baseclass;

import org.openqa.selenium.support.PageFactory;

public class login extends baseclass {
  
 
 @Test(priority=1,dataProvider="data")
  public static void verifyLoginPage(String name,String password) throws InterruptedException
  {
	  loginPage_Pageobjects lg= PageFactory.initElements(driver, loginPage_Pageobjects.class);
	  lg.verifyLoginpage(name, password);
	 
  
  }
 @DataProvider(name="data")
 public Object[][] lgdata()
 {
	 Object[][] lg=new Object[1][2];
	 lg[0][0]="Admin";
	 lg[0][1]="admin";
	return lg;
	 
 }
 
 
 
 
 


}
