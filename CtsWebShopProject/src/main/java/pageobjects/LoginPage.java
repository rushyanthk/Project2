package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit' and @class='button-1 login-button']")
	WebElement login;
	
	public void enterEmail(String username) {
		email.sendKeys(username);
	}
		
	public void enterPassword(String Password) {
		password.sendKeys(Password);		
	}
	
	public void submitLogin() {
		login.click();
	}

}
