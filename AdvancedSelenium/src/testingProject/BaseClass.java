package testingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public WebDriver driver;
	String mailId = "chitasuresh6612@gmail.com";
	String pwd = "Bhavishna@12";
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
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text() = 'Log in']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("chithirasureshkumar6612@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Bhavishna@12");
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		Reporter.log("user is not able to log in  DWS", true);
		Thread.sleep(6000);
		
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("user is not able to log out from  DWS", true);
		Thread.sleep(6000);
	}
	
}
