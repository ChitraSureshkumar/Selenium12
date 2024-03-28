package listnerspackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerDemo implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " TestCase Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " TestCase Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " TestCase fail");
		
		LocalDateTime sysTime = LocalDateTime.now();
		System.out.println(sysTime);
		String time = sysTime.toString().replace(":", "_");
		
		TakesScreenshot ts = (TakesScreenshot)DemoWS.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/" + time + ".png");
		try
		{
			FileHandler.copy(source, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}


}
