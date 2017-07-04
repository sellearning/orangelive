package Foundation.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Textfileconfiguration {
	public File f;
	public FileInputStream fs;
	static Properties ps;
	
	public Textfileconfiguration(){
	 f=new File(".\\configuration\\configuration.properties");
	try
	{
	 fs=new FileInputStream(f);
	ps=new Properties();
	ps.load(fs);
			
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e.getMessage());
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	}
	
	public static String  getUrl()
	{
		return ps.getProperty("URL");
		 
	}
}
