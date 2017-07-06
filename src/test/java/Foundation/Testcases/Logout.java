package Foundation.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Foundation.Pageobjects.loginPage_Pageobjects;
import Foundation.factory.baseclass;

public class Logout extends baseclass {
  @Test
  
  
  public void logout() 
  {
	  logger=er.startTest("logout");
	  loginPage_Pageobjects lg= PageFactory.initElements(driver, loginPage_Pageobjects.class);
	  lg.verifyLogout();
	  er.endTest(logger);
  }
}
