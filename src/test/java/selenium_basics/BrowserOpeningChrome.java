package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpeningChrome {
    public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("https://demoqa.com/text-box");
       driver.findElement(By.id("userName")).sendKeys("Harvir");
       driver.findElement(By.id("userEmail")).sendKeys("hsingh1234@gmail.com");
       driver.findElement(By.id("currentAddress")).sendKeys("2153 CANADA STREET");
       driver.findElement(By.id("permanentAddress")).sendKeys("2153 CANADA STREET");
       driver.findElement(By.id("confirm_passwd9f6f842d")).sendKeys("12374877428f");
       driver.findElement(By.className("btn btn-primary")).click();

	
	}

}
