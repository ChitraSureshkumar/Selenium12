package workingWithPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
       
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id = "Email")
	private WebElement mail;
	
	@FindBy(id = "Password")
	private WebElement pwd;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
}
