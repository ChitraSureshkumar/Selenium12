package testNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SteamGames {
	 @Test(groups = "Games")
     public void browserOpen() throws InterruptedException
     {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://store.steampowered.com/genre/Free%20to%20Play/");
    	 Thread.sleep(3000);
    	 driver.quit();		 
     }

}
