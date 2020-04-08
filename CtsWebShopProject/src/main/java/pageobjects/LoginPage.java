package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;


	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	public WebElement email() {
		return email;
	}
	
	@FindBy(id="Password")
	WebElement password;
	public WebElement password() {
		return password;
		
	}
	@FindBy(xpath = "//input[@type='submit' and @class='button-1 login-button']")
	WebElement login;
	public WebElement login() {
		// TODO Auto-generated method stub
		return login;
	}

}
