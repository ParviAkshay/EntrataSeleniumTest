package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pageclass.Header;
import pageclass.Products;
import pageclass.Solutions;
import pageclass.WatchDemo;
import utility.ReadProp;

public class BaseTest 
{
	public static WebDriver driver;
	
	Products product;
	
	Solutions solution;
	
	WatchDemo watchdemo;
	
	Header header;
	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		driver = new EdgeDriver();	
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.entrata.com");
	
		driver.get(ReadProp.getProp("url"));
		
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}
	
	@BeforeClass
	public void createObject()
	{
		product = new Products(driver);
		
		solution = new Solutions(driver);
		
		watchdemo = new WatchDemo(driver);
		
		header = new Header(driver);
	}

}
