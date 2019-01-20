package soni.Practice.module;

import org.openqa.selenium.WebDriver;

import soni.Practice.po.FreeCRMHomePagePO;

public class FreeCRMHomeModule {

	private WebDriver driver;

	public FreeCRMHomeModule (WebDriver driver){
		this.driver=driver;
	}
	public void FreeCRMHomePagePO() {

		FreeCRMHomePagePO f = new FreeCRMHomePagePO(driver);
		f.SwitchToFrame();
		f.MoveToMenuBar("companies");
	}
}
