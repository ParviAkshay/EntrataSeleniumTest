package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest 
{
	@Test(priority=1)
	public void verifyTitle()
		{
		String title = product.getTitleOfPage();
		
		 boolean ispresent = title.contains("Property Management Software");
		 
		 Assert.assertEquals(ispresent, true);
		}

	@Test(priority=2)
	public void Products()
	{
		product.productButton();
	}
	
	
}
