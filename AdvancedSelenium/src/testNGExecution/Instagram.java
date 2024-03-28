package testNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Instagram {
	  @Test
	     public void browserOpen() throws InterruptedException
	     {
	    	 WebDriver driver = new ChromeDriver();
	    	 driver.manage().window().maximize();
	    	 driver.get("https://www.instagram.com/");
	    	 Thread.sleep(3000);
	    	 driver.quit();		 
	     }


}
