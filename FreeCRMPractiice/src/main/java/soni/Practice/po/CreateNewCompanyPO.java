package soni.Practice.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewCompanyPO extends FreeCRMHomePagePO {

	public CreateNewCompanyPO (WebDriver driver) {
		super(driver);
	}

	WebDriver driver;
	By companyname= By.xpath("//input[@id='company_name']");
	By companyphone= By.xpath("//input[@name='phone']");
	By Description=By.xpath("//textarea[@name='service']");
	By Status= By.xpath("//select[@name='status']");
	By addressType= By.xpath("//table[@class='addressFormTable']//select[@name='type']");
	By SaveButton= By.xpath("//form[@id='companyForm']//tr[1]/td[@valign='top']//input[@value='Save']");
	
	public void setcompanyname(String cname) {
		typeOnElement(companyname, cname);
	}

	public void setcompanyphone(String cphone) {
		typeOnElement(companyphone, cphone);
	}

	public void setDescription(String cdesc) {
		typeOnElement(Description, cdesc);
	}

	public void setStatus(String cstat) {
		typeOnElement(Status, cstat);
	}

	public void setaddressType(String secltValue) {
		selectValuesFromDropDown(addressType,"selectByVisibleText",secltValue);
	}

	public void setSave() {
		clickOnElement(SaveButton);
	}
}
