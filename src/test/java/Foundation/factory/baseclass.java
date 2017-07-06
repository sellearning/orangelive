package Foundation.factory;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class baseclass extends invokeBrowser  {
  
public  static ExtentReports er;
 public static ExtentTest logger;
	
 @BeforeSuite
	 public static void report()
	 {
	er=new ExtentReports("C:\\Users\\home\\git\\orangelive\\Reports\\foubdation"+System.currentTimeMillis()+".html");
	 }
	
	@BeforeClass
  public static void invokeUrl()
  {
	  baseclass.browserInvocations("chrome");
	  driver.get(Textfileconfiguration.getUrl());
  }
  
@AfterSuite
public static void report1()
{
	er.flush();
}
 
}
