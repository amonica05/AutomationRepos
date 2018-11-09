package JAVA.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		 
		//FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys("amonica05@yahoo.com");
		//driver.findElement(By.id("pass")).sendKeys("ank@202");
		//driver.findElement(By.id("loginbutton")).click();

		//driver.quit();
		
	
		ChromeDriver driverr = new ChromeDriver();
		driverr.get("https://www.facebook.com/");
		driverr.manage().window().maximize();
		

	}

}
