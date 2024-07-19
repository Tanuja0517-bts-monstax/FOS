package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends HomePage{
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement un;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pwd;
	
	@FindBy(id = "buttn")
	private WebElement loginBut;

	public WebElement getUn() {
		return un;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginBut() {
		return loginBut;
	}
	
	
}
