package Foundation.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Foundation.Library.commonMethods;





public class loginPage_Pageobjects extends commonMethods {
	
	public static  WebDriver driver;
	
	@FindBy(id="txtUsername")
	public  WebElement userName;
	
	@FindBy(id="txtPassword")
	public  WebElement Upassword;

	
	@FindBy(id="btnLogin")
	public  WebElement Loginbtton;
	
	
	@FindBy(id="welcome")
	public  WebElement userDropdown;
	
	
	@FindBy(xpath="//a[text()='Logout']")
	public WebElement lgout;
	
	@FindBy(id="spnLogout")
	public   WebElement loGout;
	
	@FindBy(id="ddlLanguage")
	public WebElement languageDropdown;
	
	
	public loginPage_Pageobjects(WebDriver ldriver)
	{
		loginPage_Pageobjects.driver=ldriver;
	}
	
	
	public  void  verifyLoginpage(String Loginname,String Password)
	{
		
		
		commonMethods.settext(userName, Loginname);
		commonMethods.settext(Upassword, Password);
		commonMethods.Click(Loginbtton);
			
		
	}
	
	public  void  verifyLogout()
	{
		
		
		
		commonMethods.Click(userDropdown);
		commonMethods.Click(loGout);
			
		
	}
}
