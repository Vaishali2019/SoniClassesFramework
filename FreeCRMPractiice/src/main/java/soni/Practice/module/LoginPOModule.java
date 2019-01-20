package soni.Practice.module;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import soni.Practice.base.ConfigFileReader;
import soni.Practice.po.LoginPO;

public class LoginPOModule {

	private WebDriver driver;
	SoftAssert soft;

	public LoginPOModule (WebDriver driver, SoftAssert soft){
		this.driver=driver;
		this.soft = soft;
	}
	public void LoginPOPage(ConfigFileReader config) {

		LoginPO l= new LoginPO(driver);
		String actual = driver.getTitle();
		//System.out.println(actual);
		String expected = "#1 Free CRM software in the cloud for sales and service";
		//way to implement hard assert // if assert fails exe will get stop
		Assert.assertEquals(expected, actual);
		
		//way to implement soft assert // if assert will not fails, exe still get continue
		//soft.assertEquals(actual, expected);
		//System.out.println(driver.getTitle());
		l.setUserName(config.getUserName());
	
		l.setPassword(config.getPassword());
		l.clickOnLoginButton();
	}
}