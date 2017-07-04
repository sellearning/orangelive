package Foundation.factory;

import org.testng.annotations.BeforeClass;

public class baseclass extends invokeBrowser  {
  
 @BeforeClass
  public static void invokeUrl()
  {
	  baseclass.browserInvocations("chrome");
	  driver.get(Textfileconfiguration.getUrl());
  }
  

 
}
