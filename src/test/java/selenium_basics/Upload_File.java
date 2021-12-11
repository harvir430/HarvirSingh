package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File {
    public static WebDriver driver;

	public static void main(String[] args) {

	       WebDriverManager.chromedriver().setup();
	       driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       driver.get("https://demoqa.com/text-box");
	}

}
