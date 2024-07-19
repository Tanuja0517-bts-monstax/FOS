package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Home")
	private WebElement home;
	
	@FindBy(partialLinkText = "Restaurants")
	private WebElement restaurants;
	
	@FindBy(linkText = "Login")
	private WebElement login;
	
	@FindBy(linkText = "Register")
	private WebElement register;

	public WebElement getHome() {
		return home;
	}

	public WebElement getRestaurants() {
		return restaurants;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getRegister() {
		return register;
	}
}
