package testNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Twitter {
	 @Test
     public void browserOpen() throws InterruptedException
     {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://twitter.com/ajii005/status/1582780696900546560");
    	 Thread.sleep(3000);
    	 driver.quit();		 
     }
}
