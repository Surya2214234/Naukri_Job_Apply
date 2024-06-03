package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class NaukriLoginpage extends TestBase{

	@FindBy(id="usernameField")
	WebElement Email;
	
	@FindBy(id="passwordField")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")
	WebElement LoginButton;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[2]/span")
	WebElement invalid_Error;
	
	public NaukriLoginpage() {
		PageFactory.initElements(driver, this);
	}
	//Enter the username
	public void Enter_emailid(String user) {
		Email.sendKeys(user);
	}
	//Enter the password
	public void Enter_Password(String key) {
		Password.sendKeys(key);
	}
	//Click the LoginButton
	public void Click_login_Button() {
		LoginButton.click();
	}
	public String catchError() {
		return invalid_Error.getText();
	}
}
