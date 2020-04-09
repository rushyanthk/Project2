package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SortByPriceLowToHighPage {
	public WebDriver driver;

	public SortByPriceLowToHighPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/producttag/16/digital']")
	WebElement digital;

	public void digitalButtonClick() {
		digital.click();
	}
	
	@FindBy(id = "products-orderby")
	WebElement sortByDropDown;
	
	public void SortByDropDownAndSelectLowtoHigh() {
		//sortByDropDown.click();
		Select price = new Select(sortByDropDown);
		price.selectByVisibleText("Price: Low to High");		
	}
	
	public String getUrl()
	{
		
		return driver.getTitle();
		
	}
	


}
