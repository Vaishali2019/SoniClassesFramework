package soni.Practice.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import soni.Practice.base.BasePageObject;

public class FreeCRMHomePagePO extends BasePageObject{
	
	WebDriver driver;
	By companyMenuBar= By.xpath("//a[@title='Companies']");
	By newCompanyitem= By.xpath("//a[@title='New Company']");
	
	public FreeCRMHomePagePO(WebDriver driver) {
		super(driver);
		this.driver= driver;
	}

	public void SwitchToFrame() {
		frameSwitching("mainpanel");
	}
	
	public void MoveToMenuBar(String typeOfMenuBar) {
		
		if(typeOfMenuBar.equalsIgnoreCase("companies")) {
			WebElement elm= findElementSafelyByLocator(companyMenuBar);
			Actions action = new Actions(driver);
			action.moveToElement(elm).build().perform();
			clickOnElement(newCompanyitem);
			
		}
	}
}
