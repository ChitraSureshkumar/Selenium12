package readData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethods {
	
	public String readingDataFromPropertyFile(String Key,String path) throws IOException 
	{
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty(Key);
		return URL;
	}
	
	public String readingDataFromExcelSingleValue(String path, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		return data;
	}
	
	public static String[][] readMultipleData(String path, String sheetName) throws Exception, IOException
	{
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		
		int noOfRows = wb.getSheet(sheetName).getPhysicalNumberOfRows();
		int noOfColumn = wb.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
		System.out.println(noOfRows);
		System.out.println(noOfColumn);
		
		String[][] data1 = new String[noOfRows][noOfColumn];
		
	    for(int i = 0; i < noOfRows; i++)
			{
				for(int j = 0; j < noOfColumn; j++)
				{
					data1[i][j] = wb.getSheet(sheetName).getRow(i).getCell(j).toString();
				}
			}
			
	    return data1;
		}
}
