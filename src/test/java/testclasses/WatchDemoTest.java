package testclasses;

import org.testng.annotations.Test;

public class WatchDemoTest extends BaseTest
{
	@Test(priority=1)
	public void demo()
	{
		watchdemo.watchDemoButton();
	}
	
	@Test(priority=2)
	public void enterData() 
	{
		watchdemo.addData();
	}
	
	@Test(priority=3)
	public void backStep()
	{
		watchdemo.previousPage();
	}
}
