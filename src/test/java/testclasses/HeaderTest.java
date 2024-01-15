package testclasses;

import org.testng.annotations.Test;

public class HeaderTest extends BaseTest
{
	@Test(priority=1)
	public void entaratext()
	{
		header.entearatext();
	}
	@Test(priority=2)
	public void cookiesbannar()
	{
		header.cookieswindow();
	}
	@Test(priority=3)
	public void videobutton()
	{
		
		header.videoButton();
	}
	
	@Test(priority=4)
	public void closebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		header.closeButton();
	}

}
