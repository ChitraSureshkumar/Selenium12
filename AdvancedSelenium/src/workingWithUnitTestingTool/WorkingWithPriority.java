package workingWithUnitTestingTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithPriority {
	@Test
	public void register()
	{
        Reporter.log("Registered Successfully",true);
	}
	@Test(priority = -1)
	public void login()
	{
        System.out.println("Logged in Successfully");
	}
	@Test
	public void searchProduct()
	{
        System.out.println("Search Product");
	}
	@Test
	public void addToCart()
	{
        System.out.println("Things Added to cart");
	}
	@Test(priority = 5)
	public void buyProduct()
	{
        System.out.println("Product is buying successfully");
	}
	@Test(priority = 6)
	public void logOut()
	{
        System.out.println("Logged out Successfully");
	}

}
