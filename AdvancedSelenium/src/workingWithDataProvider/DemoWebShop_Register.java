package workingWithDataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShop_Register {
	
	
    @DataProvider(name = "registerData")
	public  String[][] registerData() throws EncryptedDocumentException, IOException
	{
		File file = new File("./testData/DemoWebShopRegister.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		int numOfRows = wb.getSheet("regData").getPhysicalNumberOfRows();
		int numOfColumn = wb.getSheet("regData").getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("Rows = " + numOfRows);
		System.out.println("Column = " + numOfColumn);
		
		String[][] data = new String[numOfRows][numOfColumn];
		
		for(int i =0; i < numOfRows; i++)
		{
			for(int j = 0; j<numOfColumn; j++)
			{
				data[i][j] = wb.getSheet("regData").getRow(i).getCell(j).toString();
			}
		}
				
		return data;

	}
	
	@Test(dataProvider = "registerData")	 
	public void registerUser(String[] dataReg)
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      driver.findElement(By.xpath("//a[text()='Register']")).click();
      if(dataReg[0].equalsIgnoreCase("male"))
      {
    	  driver.findElement(By.xpath("//input[@id = 'gender-male']")).click();
      }
      if(dataReg[0].equalsIgnoreCase("female"))
      {
    	  driver.findElement(By.xpath("//input[@id = 'gender-female']")).click();
      }
      driver.findElement(By.id("FirstName")).sendKeys(dataReg[1]);
      driver.findElement(By.id("LastName")).sendKeys(dataReg[2]);
      driver.findElement(By.id("Email")).sendKeys(dataReg[3]);  
      driver.findElement(By.id("Password")).sendKeys(dataReg[4]);  
      driver.findElement(By.id("ConfirmPassword")).sendKeys(dataReg[5]);  
      driver.findElement(By.id("register-button")).click() ;
    	  
    	  
   }
}
