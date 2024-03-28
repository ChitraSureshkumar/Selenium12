package listnerspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	@Listeners(ListnerDemo.class)
	public class DemoWS {
		public static WebDriver  driver;
		String expUrl = "https://demo.tricentis.com/";
		
		@Test
		public void login() throws InterruptedException
		{
			
			driver = new ChromeDriver();			
			driver.manage().window().maximize();			
			driver.get("https://demowebshop.tricentis.com/");			
			Thread.sleep(3000);
			String url = driver.getCurrentUrl();
			
			Assert.assertEquals(expUrl, url);
			driver.quit();
			
			
			
		}

	}

