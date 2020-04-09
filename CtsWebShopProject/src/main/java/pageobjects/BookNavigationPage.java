package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookNavigationPage { 

	public BookNavigationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='list']//a[@href='/books']")
	WebElement book;

	public void navigatetobookpageClick() {
		book.click();
	}

}
