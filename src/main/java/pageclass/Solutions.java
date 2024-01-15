package pageclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Solutions 
{
	WebDriver driver;
	
	By solutiontext= By.xpath("//*[@class='header-nav-item'][2]");
	
	By allsolutiontext = By.xpath("//*[@class='header-drop-nav']");
		

	public Solutions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void solutionButton()
	{
		driver.findElement(solutiontext).click();
	}
	
	public void allSolutionText()
	{
		List<WebElement> allvalue = driver.findElements(allsolutiontext);
		
		for(WebElement result:allvalue)
		{
			String values = result.getText();
			System.out.println(values);
		}
	}
	
}
