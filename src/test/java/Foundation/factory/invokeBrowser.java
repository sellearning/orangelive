package Foundation.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class invokeBrowser extends Textfileconfiguration {
	
	public static WebDriver driver;
  
  public static void browserInvocations(String browser)
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
      System.setProperty("webdriver.chrome.driver", ".//src//test//resources//chromedriver.exe");
      driver=new ChromeDriver();
	  }
	  if(browser.equalsIgnoreCase("Ie"))
	  {
		  System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
	      driver=new EdgeDriver();
	  }
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

}
