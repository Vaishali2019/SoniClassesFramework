package soni.TestScenario;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import soni.Practice.base.BaseTest;
import soni.Practice.base.BrowserFactory;
import soni.Practice.module.FreeCRMHomeModule;
import soni.Practice.module.LoginPOModule;
import soni.Practice.module.NewCompanyModule;

public class TestNGWebsite extends BaseTest {

	@Test
	public static void MoveElementPractice() throws Exception {

		WebDriver driver=BrowserFactory.initializeBrowser(config.getBrowser(), config.getApplicationurl());
		SoftAssert soft = new SoftAssert();
		LoginPOModule newl= new LoginPOModule(driver,soft);
		newl.LoginPOPage(config);

		Thread.sleep(10000);

		FreeCRMHomeModule newf = new FreeCRMHomeModule(driver);
		newf.FreeCRMHomePagePO();
	
		NewCompanyModule newc= new NewCompanyModule(driver);
		newc.EnterValuesinCompanyPage();
		
	}
}
