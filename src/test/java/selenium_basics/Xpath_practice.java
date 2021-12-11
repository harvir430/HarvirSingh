package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_practice {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//syntaxes of xpath
		//1. //html[@attribute='value']
		//2. //html[@attribute='value' and @attribute2='value']
		//3. //html[text()='value'];
		//4. //html[contains(text(),value)];
		//5. //html[contains(@attribute,'value')];
		//6. //html[start-with(@attribute,'value')];
		//7. //html[end-with(@attribute,'value')];
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@id='login1' and @name='login']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class='signinbtn' and @name='proceed']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	
	
	}

}
