package JAVA.Basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Angular {

	public static void main(String[] args) throws ParseException {

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://material.angular.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='Components']")).click();

		driver.findElement(By.xpath("//*[text()=' Autocomplete ']")).click();
		driver.findElement(By.xpath("//*[text()=' Adding a custom filter']/preceding-sibling::div//div/div/following-sibling::div//form//div//input")).sendKeys("ONE");
		//driver.findElement(By.xpath("//input[@id='mat-input-0']")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[text()=' Checkbox ']")).click();
		WebElement color = driver.findElement(By.xpath("//*[text()='Check me!']/preceding-sibling::div"));
		color.click();
		String value = color.getCssValue("color");
		System.out.println(value);
		
		driver.findElement(By.xpath("//*[text()=' Datepicker ']")).click();
		driver.findElement(By.xpath("//div[text()='Basic datepicker']/parent::div/following-sibling::div//div/div/div//button")).click();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date selDate = sdf.parse("04/11/2022");
		
		String month = new SimpleDateFormat("MMM").format(selDate).toUpperCase();
		String year = new SimpleDateFormat("yyyy").format(selDate);
		String date = new SimpleDateFormat("dd").format(selDate);
		String monthYeartobeSelected =  (month+" "+year).toUpperCase();
		System.out.println(monthYeartobeSelected);
		
		Date sysDate = new Date();
		
		while(true)
		{
			String disDate = driver.findElement(By.xpath("//div[@class='mat-calendar-controls']")).getText();
			System.out.println(disDate);
			if(monthYeartobeSelected.equals(disDate))
			{
				driver.findElement(By.xpath("//div[text()="+date+"]")).click();
				break;
			}
			else
			{
				if(selDate.after(sysDate))
				{
					driver.findElement(By.xpath("//div[@class='mat-calendar-arrow']")).click();
					driver.findElement(By.xpath("//div[text()="+year+"]")).click();
					System.out.println(month);
					driver.findElement(By.xpath("//div[text()='"+month+"']")).click();
					
				}
		}
		
		
		
		}
	}

}
