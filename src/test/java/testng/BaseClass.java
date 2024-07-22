package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeMethod(alwaysRun=true)  ///always run to execute before and after in group testcases...
	public void method1() {
		
		System.out.println("Inside before method");
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void method2() {
		
		System.out.println("Inside after method");
	}
	
	@BeforeTest(alwaysRun=true)
	public void method3() {
		
		System.out.println("Inside before test");
		
	}
	
	@AfterTest(alwaysRun=true)
	public void method4() {
		
		System.out.println("Inside after test");
		
	}

}
