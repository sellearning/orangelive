package Foundation.Library;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Foundation.factory.baseclass;







public class commonMethods extends baseclass {
	
	public static void wait(WebDriver Ldriver,int time,WebElement Element ){
	
	try{
	 WebDriverWait wait=new WebDriverWait(Ldriver,time);
	  wait.until(ExpectedConditions.visibilityOf(Element));
	}
	
	catch(Exception e)
	{
		
	}
	
	
	}
	
	

	public static int Click(WebElement object)
	{
			
			boolean value=false;
			boolean value1=false;
			//int i=0;
			
	  try
	 {
	   
	    if (object == null)
	    {
	      System.out.println("Action: Status: Failed Message: Failed to retrieve the locator value.");
	      
	      return 1;
	    }
	    
	    
	  
	    	value=object.isDisplayed();
	    	value1=object.isEnabled();
	    	
	    	if (value == true && value1==true)
	        {
	    		 try
	    		    {
	    		       object.click();
	    		     System.out.println("Action: Status: Passed  Message: The " + object + " is clicked successfully.");
	    		      return 0;
	    		     
	    		    }
	    		    catch (Exception e)
	    		    {
	    		    	System.out.println("exception in click:" + e.getStackTrace() + "exception=" + e.getMessage().toString());
	    		    }
	    		  
	    		     }
	    	
	    	else
	    	{
	    		try{
	    		Thread.sleep(1000);
	    		}
	    		catch(InterruptedException e1)
	    		{
	    			 System.out.println("Action: Status: waiting for the " + object + " to be displayed.");
	    			
	    		}
	    	}
	     System.out.println("Action: " + object + "    " + "Status: Failed    " + "Message: The webedit does not exist , please verify");
	    	
	    
	 }
	     catch (Exception ex)
	     {
	       System.out.println("Error occured >>" + ex);
	     }
	
	return 0;
	}
	
	
public static  int settext(WebElement object,String value)
{
  
try
{
	
		if (value != null)
    {
			
      if ((value.trim().equals("")) || (value.isEmpty()))
      {
       System.out.println("Since a valid value for the parameter is not given, assuming the default value as a zero length empty string .");
        value = "";
      }
    }
	else
    {
      value = "";
      System.out.println("Since a valid value for the parameter is not given, assuming the default value as a zero length empty string .");
    }
	if (object == null)
    {
      System.out.println("Action: " + object + "    " + "Status: Failed    " + "Message: Failed to retrieve the locator value.");
      
 return 1;
    }
  
  boolean query1 =object.isDisplayed();
  boolean query=  object.isEnabled();
  
 
	  if (query1 == true && query==true)
	  {
		  try{
		  object.sendKeys(value);
		 // System.out.println("Action: " + object + "    " + "Status: Passed    " + "Message: The value '" + value + "' is set successfully.");
		  System.out.println("Action: " + object + "    " +"  Status: Passed  Message: The value  is set successfully.");
		   return 0;
		  }
		  catch (Exception e)
		    {
		    	System.out.println("exception in click:" + e.getStackTrace() + "exception=" + e.getMessage().toString());
		    }
		  
	  }
	  else
	  {
		  try
		  {
		  Thread.sleep(1000);
		  System.out.println("Action:" + object + "    " + "Status: waiting for the " + object + " to be displayed.");
		  
		  
		  }
		  catch(Exception e)
		  {
			 System.out.println(e.getMessage());
		  }
	 }
  
	  //System.out.println("Action: " + object + "    " + "Status: Failed    " + "Message: The webedit is  not enbaled , please verify");
	  System.out.println("Action: Message: The webedit is  not enbaled , please verify");
  }
catch (Exception ex)
{
  System.out.println("Error occured >>" + ex);
}
return 1;
  
}

public static int SelectItem(WebElement object, String value,int time)
{
		
	
try{
	if (value!= null)
    {
			
      if ((value.trim().equals("")) || (value.isEmpty()))
      {
       System.out.println("We cant select the balnk value in drop down .please verify.");
       return 1;
      }
    }
	
	if (object == null)
    {
      System.out.println("Action: Status: Failed    " + "Message: Failed to retrieve the locator value.");
      return 1;
    }
  
	boolean query = object.isEnabled();
	boolean query1=object.isDisplayed();
	
	for(int i=0;i<time;i++)
	{
				if (query == true && query1==true)
		{
					 try
					  {
						
					    Select listBox = new Select(object);
					    List<WebElement> values=listBox.getOptions();
					  //  int length=values.size();
					    Iterator<WebElement> it=values.iterator();
					    while(it.hasNext())
					    {
					    	
					    	String name=it.next().getText();
					    	if(name.equalsIgnoreCase(value))
					    	listBox.selectByVisibleText(name);
					    	break;
					    	
					    }
					    
					    
					  }
					  catch (Exception e)
					  {
						  System.out.println(
					      "Action: " + object + "    " + "Status: Failed    " + "Message: The item to be selected may not be present in the list.Please verify");
					    return 1;
					  }

					  System.out.println("Action: " + object + "    " + "Status: Passed    " + "Message: The item " + value + " are selected successfully.");
					  return 0;
			
		}
		else
		{
			try
			  {
			  Thread.sleep(1000);
			  System.out.println("Action: Status: waiting for the " + object + " to be displayed.");
		  
			  }
			  catch(Exception e)
			  {
				 System.out.println(e.getMessage());
			  }
			
		}
		
		System.out.println("Action: " + object + "    " + "Status: Failed    " + "Message: The list does not exist , please verify");
	    
	    return 1;
		
		
}
	}
 catch (Exception ex)
	{
	  System.out.println("Error occured >>" + ex);
	}
	return 1;
	  
  
}



/*public static  int SelectFrame(WebElement object)
{
  try
  {
    int result = 1;
    
    
    boolean value=object.isDisplayed();
    
    
   if (value ==false)
    {
      System.out.println("Action: Status: Failed Message: The " + object + " does not exist , please verify");
     
      return 1;
    }
    try
    {
    	driver.switchTo().frame(object);
    	System.out.println("Action: Status: Passed    " + "Message: The " + object + " is selected successfully.");
         result = 0;
    }
    catch (NoSuchFrameException nsfe)
    {
    	System.out.println(
        "Action:Status: Failed    " + "Message: Failed to select the frame. Either the " + object + " does not exist " + "OR the given element is neither an IFRAME nor a FRAME element");
      return 1;
    }
    return 0;
  }
  catch (Exception ex)
  {
   
	  System.out.println("Action: SelectFrame Status: Failed    Message: Failed to select the frame." + ex);
    return 1;
  }
}


*/

public static int Check(WebElement object)
{
  int result = 1;
  
  if (object == null)
  {
   System.out.println("Action:Status: Failed    " + "Message: The " + object + " does not exist , please verify");
    result = 1;
    return result;
  } 
  
  
 boolean value= object.isDisplayed();
 

 
 try
 {
 if(value==true)
 {
 
  if (object.isEnabled())
	    {
	      if (!object.isSelected()) {
	    	  object.click();
	      }
	    }
	    else
	    {
	    	System.out.println(
	        "Action: Status: Failed    " + "Message:  The " + object + " is disabled and cannot be check, please verify.");
	      return 1;
	    }
 }	
 }
	  catch (ElementNotVisibleException enve)
	  {
		  System.out.println(
	      "Action: Status: Failed    " + "Message:  The " + object + " is not visible and hence cannot be select, please verify.");
	    return 1;
	  }
 
 try
 {
   Thread.sleep(2000);
 }
 catch (Exception localException) {}
 boolean checked = object.isSelected();
 if (checked)
 {
	 System.out.println("Action: Status: Passed    " + "Message:  The " + object + " is checked.");
   result = 0;
 }
 else
 {
	 System.out.println(
     "Action:Status: Failed    " + "Message:  The " + object + " is not checked , even after the check operation is performed ,please verify.");
   result = 2;
 }
 return result; 

}
 
}







	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	




	
	