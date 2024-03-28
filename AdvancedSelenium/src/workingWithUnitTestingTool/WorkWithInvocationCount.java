package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkWithInvocationCount {
	@Test(invocationCount = 4, threadPoolSize = 3)
	public void run() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercedes-benz.co.in/");
		driver.close();
	}
	@Test(enabled = false)
	public  void demo() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/in/iphone/");
		Thread.sleep(3000);
		driver.close();
	}

}
