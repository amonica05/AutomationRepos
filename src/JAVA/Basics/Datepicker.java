package JAVA.Basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepicker{

	public static void main(String[] args) throws ParseException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date selDate = sdf.parse("25/09/2019");
		
		String month = new SimpleDateFormat("mm").format(selDate);
		String year = new SimpleDateFormat("yyyy").format(selDate);
		String date = new SimpleDateFormat("dd").format(selDate);	
		
		String monthYeartobeSelected =  (month+" "+year).toUpperCase();
		System.out.println(monthYeartobeSelected);
		
		
		Date sysDate = new Date();
		
		while(true)
		{
			String disDate = driver.findElement(By.xpath("//div[@id='js-filterOptins']/div/div[3]/div/div/div/div")).getText();
			if(monthYeartobeSelected.equals(disDate))
			{
				driver.findElement(By.xpath("//a[text()="+date+"]")).click();
				
				System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).getAttribute("value"));
				break;
			}
			else
			{
				if(selDate.after(sysDate))
				{
					driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/a/span")).click();
					//String actData = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
					//System.out.println(actData);
				}
				else
				{
					driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/div/a/span")).click();
					System.out.println("Cannot accept past dates. Please enter future date");
					break;
				}
			}
			
		}
		
		
	}	
	

}




