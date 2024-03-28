package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnGroups {
	
	@Test(dependsOnGroups = "labtop")
	public void payment() throws InterruptedException
	{
		 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://pay.google.com/about/");
    	 Thread.sleep(3000);
    	// driver.quit();
	}

}
