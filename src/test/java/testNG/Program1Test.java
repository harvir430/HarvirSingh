package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1Test {
	public static WebDriver driver;
	@BeforeTest
	public static void begin() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	@Test
	public static void signinLinkClick(){
		WebElement signinlink=driver.findElement(By.xpath("//a[@class='signin']"));
	if(signinlink.isEnabled()==true) {
		signinlink.click();
	}
	else {
		System.out.println("fail");
	}
	}
	@Test
	public static void username() {
	
		driver.findElement(By.xpath("//input[@id='login1' and @name='login']")).sendKeys("seleniumpanda@rediffmail.com");

	}
	@AfterTest
	public static void afterTest() {
		
	}
	
	
}
