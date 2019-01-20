package soni.Practice.module;

import org.openqa.selenium.WebDriver;

import soni.Practice.po.CreateNewCompanyPO;
import soni.Practice.utilities.SceenShot;

public class NewCompanyModule {
	
	private WebDriver driver;

	public NewCompanyModule (WebDriver driver){
		this.driver=driver;
	}

	public void EnterValuesinCompanyPage() throws Exception {
		
		CreateNewCompanyPO c= new CreateNewCompanyPO(driver);
		c.setcompanyname("CDE Corp.");
		c.setcompanyphone("859966333");
		c.setDescription("This is a free text - Description entered");
		c.setStatus("Active");
		c.setaddressType("Shipping Address");
		c.setSave();
		System.out.println("New Company is Created");
		SceenShot.captureVisiblePart(driver, "C:\\Users\\vaishu\\eclipse-workspace\\FreeCRMPractiice\\Reports\\ScreenShots", "NewCo");
	}
	
}
