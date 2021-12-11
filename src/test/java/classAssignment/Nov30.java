package classAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nov30 {
	public static WebDriver driver;
	public static SoftAssert softassert= new SoftAssert();
	public static ChromeOptions options= new ChromeOptions();
	
	@Test(priority=1)
	public static void begin(){
		WebDriverManager.chromedriver().setup();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver= new ChromeDriver(options);
		driver.get("https://rediff.com");
		softassert.assertAll();
		//softassert.assertEquals(driver.getTitle(), "rediff.com");
	//	softassert.assertAll();
		
		
	}
	
	@Test(priority=2)
	public static void title_url() {
		String ActualTitle=driver.getTitle();
		String EstTitl="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String ActUrl=driver.getCurrentUrl();
		String EstUrl="https://www.rediff.com/..";
		softassert.assertEquals(ActualTitle,EstTitl,"Title is not accurate!!!");
		softassert.assertEquals(ActUrl, EstUrl,"Url is not Correct");
		softassert.assertAll();
	}
	@Test(priority=3)
	public static void sign_in_click() {
		WebElement SignIn=driver.findElement(By.className("signin"));
		softassert.assertTrue(SignIn.isEnabled(),"signIn is not enabled");
		SignIn.click();
		softassert.assertAll();
	}
	@Test(priority=4)
	public static void usrnm() {
		WebElement Usrnm=driver.findElement(By.xpath("//input[@id='login1' and @name='login']"));
		softassert.assertTrue(Usrnm.isEnabled(), "usnm is not enable");
		softassert.assertTrue(Usrnm.isDisplayed(), "usnm is not displayed");
		Usrnm.sendKeys("seleniumpanda@rediffmail.com");
		softassert.assertAll();
	}

}
