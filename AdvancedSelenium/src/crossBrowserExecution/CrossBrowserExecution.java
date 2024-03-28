package crossBrowserExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserExecution {
	public WebDriver driver;
	
	
	@Parameters({"browserName" , "url"})
	@Test
	public void browser(@Optional("Edge") String browserName, @Optional("https://demowebshop.tricentis.com/") String url) throws InterruptedException
	{
		if(browserName.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid browe name");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
	    driver.quit();	
	}
	      
		
	}


