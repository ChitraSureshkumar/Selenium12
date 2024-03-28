package workingWithPom;

import org.testng.annotations.Test;

public class TC_Reg_001 extends BaseClass{
	
	@Test
	public void register()
	{
	   
		RegisterPage rp = new RegisterPage(driver);
	    rp.getRegisterLink().click();
	    rp.getFemaleRadioButton().click();
	    rp.getFirstName().sendKeys("chitra");
	    rp.getLastName().sendKeys("Suresh");
	    rp.getEmailTextBox().sendKeys("chitrasuresh6612@gmail.com");
	}

}
