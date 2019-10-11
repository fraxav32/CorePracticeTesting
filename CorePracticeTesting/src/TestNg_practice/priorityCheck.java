package TestNg_practice;

import org.testng.annotations.Test;

public class priorityCheck {

	@Test(priority = 1)
	public void sum()
	{
		System.out.println(" priorityCheck Sum");
		
	}
	@Test(priority = 2)
	public void sub()
	{
		System.out.println("priorityCheck sub");
		
	}
	@Test(priority = 3)
	public void mul()
	{
		System.out.println("priorityCheck mul");
		
	}
}
