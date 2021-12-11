package testNG;

import org.junit.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class First_Program_TestNg {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite - first");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is atter suite - last");
	} 
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test - ");
	} 
	@AfterTest
	public void afterTest() {
		System.out.println("this is after test - ");
	} 
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method - ");
	} 
	@Test
	public void test() {
		System.out.println("this is test");
	}
	
}
