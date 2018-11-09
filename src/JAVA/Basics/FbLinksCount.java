package JAVA.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLinksCount {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		List <WebElement> AllLinks = driver.findElements(By.tagName("a"));
         
		int  n = AllLinks.size();
		
		
		System.out.println("Links count is " +n);
		
		driver.quit();
	}

}
