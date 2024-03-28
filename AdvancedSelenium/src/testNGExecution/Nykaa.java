package testNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nykaa {
	 @Test(groups = "fashion")
     public void browserOpen() throws InterruptedException
     {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.nykaa.com/");
    	 Thread.sleep(3000);
    	 driver.quit();
    		 
     }
}
