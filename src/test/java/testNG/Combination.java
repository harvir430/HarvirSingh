package testNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Combination {
	@BeforeMethod
	public void intialize() {
		System.out.println("This is initialize");
	}
	@Test
	public void testcase1() {
		System.out.println("This is test case 1");
	}
	@AfterMethod
	public void after_method() {
		System.out.println("This is afte method");
	}

}
