package TestNg_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_dependsOnMethods 
{
	@Test(dependsOnMethods= "sub")
	public void sum()
	{
		System.out.println("Sum");
		
	}
	@Test(priority = 0)
	public void sub()
	{
		System.out.println("sub");
		
	}
	@Test(priority = 6)
	public void mul()
	{
		System.out.println("mul");
		
	}
	@Test(dependsOnMethods= "sub")
	public void divide()
	{
		System.out.println("divide");
		
	}
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
		
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
		
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
		
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
		
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
		
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
		
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
		
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
		
	}
	@BeforeGroups
	public void BeforeGroup()
	{
		System.out.println("BeforeGroup");
		
	}
	@AfterGroups
	public void AfterGroup()
	{
		System.out.println("AfterGroup");
		
	}
}




//==================================================================
//OUTPUT
//
//BeforeSuite
//BeforeTest
//BeforeClass
//BeforeMethod
//sub
//AfterMethod
//BeforeMethod
//mul
//AfterMethod
//BeforeMethod
//divide
//AfterMethod
//BeforeMethod
//Sum
//AfterMethod
//AfterClass
//AfterTest
//PASSED: sub
//PASSED: mul
//PASSED: divide
//PASSED: sum
//
//===================================================================