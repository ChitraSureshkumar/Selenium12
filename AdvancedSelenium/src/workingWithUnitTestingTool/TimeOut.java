package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut 
{
     @Test(timeOut = 3000)
      public void run()
    	 {
    		 WebDriver driver = new ChromeDriver();
        	 driver.manage().window().maximize();
        	 driver.get("https://www.youtube.com/");
        	 driver.close();
        	
    	 }
     
}
