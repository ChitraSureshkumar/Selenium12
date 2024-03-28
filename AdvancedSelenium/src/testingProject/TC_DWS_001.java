package testingProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 {
	
	public class TC_Demo_001 extends BaseClass{
		
		@Test
		public void wishList()
		{
			driver.findElement(By.xpath("//span[text() = 'Wishlist']")).click();
		    Reporter.log("user is able to click on WishList");
		}
	}


}
