package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertionConcept {
	public static SoftAssert softassert=new SoftAssert();
	
	public static WebDriver driver;
	@BeforeTest
	public void lanchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		
		String actualTitle= driver.getTitle();
		String expectedTitle= "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		


}
}