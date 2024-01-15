package pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WatchDemo 
{
	WebDriver driver;
	
	By watchbutton = By.xpath("//*[@class='button-default solid-dark-button'][1]");
	
	By firstname = By.xpath("//*[@id='FirstName']");
	
	By lastname = By.xpath("//*[@id='LastName']");
	
	By email = By.xpath("//*[@id='Email']");
	
	By companyname = By.xpath("//*[@id='Company']");
	
	By phoneno = By.xpath("//*[@id='Phone']");
	
	By unitcount = By.xpath("//*[@id='Unit_Count__c']");
	
	By unitvalue = By.xpath("//*[text()='11 - 100']");
	
	By title = By.xpath("//*[@id='Title']");
	
	public WatchDemo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void watchDemoButton()
	{
		driver.findElement(watchbutton).click();
	}
	
	public void addData()
	{
		driver.findElement(firstname).sendKeys("Ron");
		driver.findElement(lastname).sendKeys("Smith");
		driver.findElement(email).sendKeys("ronsmith0@abc.com");
		driver.findElement(companyname).sendKeys("TCS");
		driver.findElement(phoneno).sendKeys("8765656565");
		driver.findElement(unitcount).click();
		driver.findElement(unitvalue).click();
		driver.findElement(title).sendKeys("Assistance");
	}
	
	public void previousPage()
	{
		driver.navigate().back();
	}

}
