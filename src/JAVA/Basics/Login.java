package JAVA.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		
          FirefoxDriver Driver = new FirefoxDriver();
          Driver.get("https://www.facebook.com/");
          Driver.manage().window().maximize();
      	  //Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
      	  
          
          Driver.findElement(By.id("u_0_j")).sendKeys("amonica");
          Driver.findElement(By.id("u_0_o")).sendKeys("amonica@yahoo.com");
          Driver.findElement(By.id("u_0_v")).sendKeys("9908566668");

          
          
          Driver.findElement(By.id("u_0_11")).click();
          
          Driver.findElement(By.linkText("Why do I need to provide my date of birth?")).click();
	}

}
