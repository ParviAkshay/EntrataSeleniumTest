package testclasses;

import org.testng.annotations.Test;

public class SolutionTest extends BaseTest
{
	@Test(priority=1)
	public void solutionButton()
	{
		solution.solutionButton();
	}
	
	@Test(priority=2)
	public void allSolutions()
	{
		solution.allSolutionText();
	}
	
}
