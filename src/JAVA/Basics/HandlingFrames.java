package JAVA.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver(); 
	    driver.get("https://stackoverflow.com/questions/36770347/how-to-switch-in-tabs-of-popup"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	       driver.switchTo().frame(0);
	       
	      
	}

}
