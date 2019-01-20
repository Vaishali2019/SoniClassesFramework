package soni.TestScenario;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass2 {

	public String BrowserName1;
	public TestNGClass2(String string) {
		this.BrowserName1 = string;
	}

	@Test(priority=1, groups = {"Sanitytesting"})
	public void z(){
		System.out.println("Output of z");
		System.out.println(BrowserName1);
	}
	
	@Test(priority=1, groups = {"Smoketesting"})
	public void v(){
		System.out.println("Output of v");
		System.out.println(BrowserName1);
	}
	
	@Test(priority=1, dependsOnMethods="v" , groups = {"Smoketesting"})
	public void x(){
		System.out.println("Output of x");
	}
	
	@Test(priority=2, groups = {"Sanitytesting"})
	public void y(){
		System.out.println("Output of y");
	}
	
	@Test(priority=2, dependsOnMethods="z", groups = {"Sanitytesting"})
	public void l(){
		System.out.println("Output of l");
	}

	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("Output of BeforeMethod");
	}

	@AfterMethod
	public void AfterMethod(){
		System.out.println("Output of AfterMethod");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Output of BeforeClass");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("Output of AfterClass");
	}

}
