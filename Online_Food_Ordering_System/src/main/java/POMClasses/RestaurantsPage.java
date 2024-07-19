package POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestaurantsPage extends LoginPage{
	public RestaurantsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({ @FindBy(xpath = "(//div[@class='row'])[3]/../..//div[@class='entry-dscr']")})
	private List<WebElement> restaurants;
	
	@FindBy(xpath = "//a[.='View Menu']")
	private WebElement viewMenu;

	public List<WebElement> getRestaurantsName() {
		return restaurants;
	}

	public WebElement getViewMenu() {
		return viewMenu;
	}
}
