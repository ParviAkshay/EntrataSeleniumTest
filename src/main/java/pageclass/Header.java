package pageclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header 
{
	WebDriver driver;
	WebDriverWait wait;
	
	By text = By.xpath("//*[@class='landing-logo']");
	
	By cookies = By.xpath("//*[@id='rcc-confirm-button']");
	
	By button = By.xpath("//*[@id='0murpe5hrg'][1]");
	
	By closetab = By.xpath("//*[@id='wistia-0murpe5hrg-1_popover_popover_close_button']");
	
	
	public Header(WebDriver driver)
	{
		this.driver=driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void entearatext()
	{
		driver.findElement(text).click();
	}
	
	public void cookieswindow()
	{
		driver.findElement(cookies).click();
	}
	
	public void videoButton()
	{
		WebElement vbutton = driver.findElement(button);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", vbutton);
		
	}
	
	public void closeButton()
	{
		driver.findElement(closetab).click();
	}
	
}
