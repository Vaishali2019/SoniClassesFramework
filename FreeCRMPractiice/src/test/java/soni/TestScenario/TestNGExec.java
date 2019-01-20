package soni.TestScenario;

import org.testng.annotations.Test;

import soni.Practice.base.ConfigFileReader;

public class TestNGExec {
	
	@Test
	public void readconfigfile(){
		ConfigFileReader readClassObj =new ConfigFileReader();
		readClassObj.readconfigfile();
		readClassObj.getBrowser();
		readClassObj.getApplicationurl();
		readClassObj.getEmailrequired();
		System.out.println(readClassObj.getBrowser());
		System.out.println(readClassObj.getApplicationurl());
		System.out.println(readClassObj.getEmailrequired());
	}
}
