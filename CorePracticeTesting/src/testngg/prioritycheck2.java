package testngg;

import org.testng.annotations.Test;

public class prioritycheck2 {
	@Test(priority = 1)
	public void sum()
	{
		System.out.println(" priorityCheck2 Sum");
		
	}
	@Test(priority = 2)
	public void sub()
	{
		System.out.println("priorityCheck2 sub");
		
	}
	@Test(priority = 3)
	public void mul()
	{
		System.out.println("priorityCheck2 mul");
		
	}
}
