package soni.TestScenario;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGClass1 {
	
	public String BrowserName;
	public TestNGClass1(String string) {
		this.BrowserName = string;
	}

	@Parameters({ "Browser" })
	@Test(priority=0, groups = {"Smoketesting"}, enabled = false)
	public void c(String c){
		System.out.println("Output of c");
		System.out.println(c);
		System.out.println(BrowserName);
	}
	
	@Parameters({ "Browser" })
	@Test(priority=1, groups = {"Smoketesting"})
	public void e(String e){
		System.out.println("Output of e");
		System.out.println(e);
		System.out.println(BrowserName);
	}
	
	@Parameters({ "Browser" })
	@Test(priority=2, dependsOnMethods="e", groups = {"Smoketesting"})
	public void a(String a){
		System.out.println("Output of a");
		System.out.println(a);
		System.out.println(BrowserName);
	}
	
	@Parameters({ "Browser" })
	@Test(groups = {"Sanitytesting"}, enabled = false)
	public void d(String d){
		System.out.println("Output of d");
		System.out.println(d);
		System.out.println(BrowserName);
	}
	
	
	@Test(groups = {"Sanitytesting"}, expectedExceptions = ArithmeticException.class)
	public void f(){
		System.out.println("Output of f");
		int a = 10;
		int b = a/0;
		System.out.println(b);
		
	}
	
/*
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Output of BeforeClass");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("Output of AfterClass");
	}

	@BeforeGroups("Sanitytesting")
	public void BeforeGroup(){
		System.out.println("Output of BeforeGroup");
	}
	
	@AfterGroups("Sanitytesting")
	public void AfterGroup() {
		System.out.println("Output of AfterGroup");
	}*/
}
