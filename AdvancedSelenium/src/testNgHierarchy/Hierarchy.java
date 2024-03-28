package testNgHierarchy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hierarchy {
       
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite executed");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test executed");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class executed");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method executed");
	}
	@Test
	public void test1()
	{
		System.out.println("Test1 should be executed");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2 should be executed");
	}
    
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite executed");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test executed");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class executed");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method executed");
	}


}
