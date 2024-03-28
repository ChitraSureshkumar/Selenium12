package workingWithPom;

import org.testng.annotations.Test;

public class TC_Login_002 extends BaseClass{
	
	@Test
	public void login() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getMail().sendKeys("chitrasuresh6612@gmail.com");
		Thread.sleep(3000);
		lp.getPwd().sendKeys("Bhavishna@12");
		Thread.sleep(3000);
		lp.getLoginbutton().click();
	}

}
