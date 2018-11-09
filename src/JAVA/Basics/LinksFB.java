package JAVA.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LinksFB {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("u_0_j")).sendKeys("amonica");
        driver.findElement(By.id("u_0_o")).sendKeys("amonica@yahoo.com");
        driver.findElement(By.id("u_0_v")).sendKeys("9908566668");
        
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select day_sel = new Select(day);
		day_sel.selectByVisibleText("23");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select mon_sel = new Select(month);
		mon_sel.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select year_sel = new Select(year);
		year_sel.selectByVisibleText("1992");
		
		driver.findElement(By.id("u_0_9")).click();
		driver.findElement(By.partialLinkText("Why do I need to provide")).click();
		
		
		
		

		
		
	}

}
