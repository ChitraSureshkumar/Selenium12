package readData;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromExcelSingleData {

	@Test
	public void toOpenDWS() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		UtilityMethods  um = new UtilityMethods();
		
		String url = um.readingDataFromPropertyFile("url", "./testData/testData.properties");
		driver.get(url);
		
		driver.findElement(By.linkText("Log in")).click();
		
		String email = um.readingDataFromExcelSingleValue("./testData/DemoWebShopRegister.xlsx", "loginData", 0, 1);
		driver.findElement(By.id("Email")).sendKeys(email);
		String pwd = um.readingDataFromExcelSingleValue("./testData/DemoWebShopRegister.xlsx", "loginData", 0, 2);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
}
