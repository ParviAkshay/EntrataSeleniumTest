package pageclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Products {

	WebDriver driver;
	
	By product=By.xpath("//*[@class='header-nav-item'][1]");
	
	public Products(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void productButton() 
	{
		driver.findElement(product).click();
	}
	
	public String getTitleOfPage() {
		
		String titleofpage = driver.getTitle();

		return titleofpage;
	}
}
