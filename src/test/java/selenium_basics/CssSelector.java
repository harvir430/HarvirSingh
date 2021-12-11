package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input[name=passwd][id=password]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#password+input[name=proceed]")).click();
		driver.findElement(By.cssSelector("a.rd_logout")).click();
		driver.findElement(By.cssSelector("div.header a:nth-child(2) b")).click();

		
	}

}
