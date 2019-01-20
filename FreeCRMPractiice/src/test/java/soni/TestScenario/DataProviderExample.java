package soni.TestScenario;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider = "InputData")
	public void c(String DataReader) {
		System.out.println("Output of " + DataReader);
	}
	
	@Test
	public void d() {
		System.out.println("Output of ______");
	}
	
	@DataProvider(name="InputData")
	public Object[][] dp() {
			return new Object[][] { { "one" }, { "two" }, { "three" }, { "four" }, { "five" }, { "six" }, { "seven" }, { "eight" }, { "nine" }, { "ten" } }; 
	}
	
}
