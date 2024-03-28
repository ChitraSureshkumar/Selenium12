package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void login() throws InterruptedException
	{
		String expUrl = "https://www.b.in/en/index.html";
		String modelUrl = "https://www.bmw.in/en/all-models.html";
		SoftAssert sf = new SoftAssert();
		
		WebDriver driver = new ChromeDriver();
		Reporter.log("user is able to open empty Browser", true);
		
		driver.manage().window().maximize();
		Reporter.log("user is able to open empty Browser", true);
		
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("user is able to launch bmw",true);
		
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		sf.assertEquals(expUrl, url);
		
		driver.findElement(By.xpath("//span[text() = 'Models']")).click();
		String actualModelUrl = driver.getCurrentUrl();
		Reporter.log("user is able to click on models",true);
		System.out.println(actualModelUrl);
		
		sf.assertEquals(actualModelUrl, modelUrl);		
		Thread.sleep(3000);
		driver.quit();
		sf.assertAll();
		
		}

}

	

