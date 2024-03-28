package workingWithPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public WebDriver driver;
	
	String actualUrl = "https://demowebshop.tricentis.com/";
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I am Before Suite");
		Reporter.log("Database connection Start", true);
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I am  After Suite");
		Reporter.log("Database connection Stop", true);
	}
	
	//@BeforeTest
	
	@BeforeClass
	public void browserSetup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("user is able to open the browser", true);
		driver.get("https://demowebshop.tricentis.com/");
		String url = driver.getCurrentUrl();
		if(url.equals(actualUrl))
		{
			Reporter.log("user is able to land on DWS", true);	
		}
		else
		{
			Reporter.log("user is not able to open the DWS", true);
		}
		
		Thread.sleep(6000);
		
	}
	
	// AfterTest
	
	@AfterClass
	public void toQuitBrowser()
	{
		driver.quit();
		Reporter.log("user is able to cose the DWS", true);
	}
	
	
	
}
