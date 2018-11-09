package JAVA.Basics;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Actions move = new Actions(driver);
		move.moveToElement(driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"))).build().perform();
		driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();
		
		String ExpTitle = "Apply Leave";
		String ActTitle = driver.findElement(By.xpath("//*[@id='apply-leave']/div[1]/h1")).getText();
		System.out.println(ActTitle);
		if(ExpTitle.equals(ActTitle))
		{
			System.out.println("Apply Leave Page Launched successfully");
		}
		
		List <WebElement> count = driver.findElements(By.id("applyleave_txtLeaveType"));
		Iterator <WebElement> itr = count.iterator();
		
		for(int i = 0; i<count.size(); i++)
		{
			String levType = "Personal Leave";
			String   Type = itr.next().getText();
			System.out.println(Type);
			System.out.println(i);
			if(levType.equals(count.get(i).getText()))
			{
				
				count.get(i).click();
				System.out.println(" levae match");
			}
		}
		
		
		
	}
}
