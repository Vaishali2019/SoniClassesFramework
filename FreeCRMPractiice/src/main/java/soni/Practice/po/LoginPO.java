package soni.Practice.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import soni.Practice.base.BasePageObject;

public class LoginPO extends BasePageObject{

	WebDriver driver;
	
	By userName=By.xpath("//input[@name='username']");
	By password= By.xpath("//input[@name='password']");
	By loginButton= By.xpath("//input[@value='Login']");
	
	public LoginPO(WebDriver driver){
		super(driver);
		//this.driver=driver;
	}
	
	public void setUserName(String uname) {
		elementVisible(userName).sendKeys(uname);
		
		//typeOnElement(userName, uname);
		//driver.findElement(userName).sendKeys(uname);
	}
	
		
	public void setPassword(String pwd) {
		typeOnElement(password, pwd);
		//driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLoginButton(){
		
		elementClickable(loginButton).click();
		//clickOnElement(loginButton);
		//driver.findElement(loginButton).click();
	}
}
