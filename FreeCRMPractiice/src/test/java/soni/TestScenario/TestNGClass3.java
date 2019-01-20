package soni.TestScenario;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;

public class TestNGClass3 {
	
	public String BrowserName2;
	public TestNGClass3(String string) {
		this.BrowserName2 = string;
	}

	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("Output of BeforeSuite");
		System.out.println(BrowserName2);
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Output of AfterSuite");
	}
	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("Output of BeforeTest");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("Output of AfterTest");
	}
	
/*	@BeforeGroups("Sanitytesting")
	public void BeforeGroup(){
		System.out.println("Output of BeforeGroup");
	}
	
	@AfterGroups("Sanitytesting")
	public void AfterGroup() {
		System.out.println("Output of AfterGroup");
	}
	*/
}
