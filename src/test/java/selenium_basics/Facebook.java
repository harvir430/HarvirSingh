package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static WebDriver driver;
	public static ChromeOptions options=new ChromeOptions();
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("https://www.facebook.com/")).click();
		driver.findElement(By.xpath("//input[@id='u_k_b_R5']")).sendKeys("harry");
		
		//Select select
		
		
	}

}
