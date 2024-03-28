package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group {
	
     @Test(groups = "mobile")
     public void motorola() throws InterruptedException
     {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.motorola.in/");
    	 Thread.sleep(3000);
    	// driver.quit();
     }
     @Test(groups = "mobile")
     public void samsung() throws InterruptedException
     {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.samsung.com/in");
    	 Thread.sleep(3000);
    	// driver.quit();
    	 
     }
     @Test(groups = "labtop")
     public void iphone() throws InterruptedException
     {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.apple.com/");
    	 Thread.sleep(3000);
    	// driver.quit();
     }
}
