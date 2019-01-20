package soni.Practice.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	Properties propertiesdata;
	public void readconfigfile ()  {
		
		String projectFolder=System.getProperty("user.dir");
		String filepath = projectFolder + "/GlobalConfig/Config.properties";
		FileReader pFile;
		try {
			pFile = new FileReader (filepath);
			BufferedReader reader = new BufferedReader (pFile);
			propertiesdata=new Properties();
			propertiesdata.load(reader);
			reader.close();
			
			// TO READ A DATA FROM PROPERTIES FILE
			
		} 
		catch(FileNotFoundException f) {
			f.printStackTrace();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public String getBrowser () {
		String Browser=propertiesdata.getProperty("Browser");
		if(Browser != null)
			return Browser;
		else 
			throw new RuntimeException("Browser not define");
	}
	
	public String getFileName () {
		String filename=propertiesdata.getProperty("ExcelFile");
		if(filename != null)
			return filename;
		else 
			throw new RuntimeException("FileName not define");
	}
	
	public String getUserName () {
		String username=propertiesdata.getProperty("Username");
		if(username != null)
			return username;
		else 
			throw new RuntimeException("username not define");
	}
	
	public String getPassword () {
		String passwd=propertiesdata.getProperty("Password");
		if(passwd != null)
			return passwd;
		else 
			throw new RuntimeException("Password not define");
	}
	public String getApplicationurl () {
		String Applicationurl=propertiesdata.getProperty("Url");
		if(Applicationurl != null)
			return Applicationurl;
		else 
			throw new RuntimeException("Url not define");
	}
	
	public String getEmailrequired () {
		String Emailrequired=propertiesdata.getProperty("Emailrequired");
		if(Emailrequired != null || Emailrequired != "")
			return Emailrequired;
		else 
			throw new RuntimeException("Emailrequired not define");
	}
	
	
}
