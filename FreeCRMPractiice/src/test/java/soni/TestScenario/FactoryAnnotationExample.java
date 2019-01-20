package soni.TestScenario;

import org.testng.annotations.Factory;

public class FactoryAnnotationExample {
	
	@Factory
	public Object[] factoryMethod() {
		Object[] tests = new Object[3];
		tests[0] = new TestNGClass1("Chrome");
		tests[1] = new TestNGClass2("Firefox");
		tests[2] = new TestNGClass3("Amol");
		return tests;
	}
	
	

}
