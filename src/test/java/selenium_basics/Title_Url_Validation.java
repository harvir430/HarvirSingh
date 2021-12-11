package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title_Url_Validation {


	static WebDriver driver;
	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://www.rediff.com");
			driver.manage().window().maximize();
			String  Actual_Titl=driver.getTitle();
			System.out.println(Actual_Titl);
		    String Est_Titl="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		   
		    if(Actual_Titl.equals(Est_Titl)) {
		    	System.out.println("Title is correct");
		    }
		    else {
		    	System.out.println("Its spam");
		    }
		    
		    String Act_Url=driver.getCurrentUrl();
		    System.out.println(Act_Url);
		    String Est_Url="https://www.rediff.com/";
		    
		    if(Act_Url.equals(Est_Url)) {
		    	System.out.println("Congrats its correct Url");
		    	
		    }
		    else {
		    	System.out.println("RUN you are in danger!!");
		    }

		    	
			WebElement SignIn=driver.findElement(By.xpath("//a[@class='signin']"));
			if(SignIn.isEnabled()&& SignIn.isDisplayed()) {
				SignIn.click();
			}
			else {
				System.out.println("SignIn link not working");
			}
			
			WebElement Username=driver.findElement(By.xpath("//input[@id='login1' and @name='login']"));
			if(Username.isEnabled()&&Username.isDisplayed()) {
				Username.sendKeys("seleniumpanda@rediffmail.com");
			}
			else {
				System.out.println("Username is not working");
			}
			WebElement Password=driver.findElement(By.xpath("//input[contains(@id,'password')]"));
			if(Password.isEnabled()&&Password.isDisplayed()) {
				Password.sendKeys("Selenium@123");
				System.out.println("Logout is clicked");
			}
			else {
				System.out.println("Password input is not working");
			}
			WebElement Signbtn=driver.findElement(By.xpath("//input[@class='signinbtn' and @name='proceed']"));
			if(Signbtn.isEnabled()&&Signbtn.isDisplayed()) {
				Signbtn.click();
			}
			else {
				System.out.println("Sign In button not working");
			}
			WebElement LogOut=driver.findElement(By.xpath("//a[text()='Logout']"));
			if(LogOut.isEnabled()&&LogOut.isDisplayed()) {
				LogOut.click();
				
			}
			else {
				System.out.println("LogOut button not working");
			}
			WebElement RediffHome = driver.findElement(By.cssSelector("div.header a:nth-child(2) b"));
			//WebElement RediffHome1 = driver.findElement(By.xpath("//a[@class='logo']/following-sibling::span[1]/descendant::b[1]"));
			if(RediffHome.isDisplayed()&& RediffHome.isEnabled()) {
				RediffHome.click();
			}
			else {
				System.out.println("RediffHome is not working");
			}
			
		
		
			
		
		
		
	}

}
