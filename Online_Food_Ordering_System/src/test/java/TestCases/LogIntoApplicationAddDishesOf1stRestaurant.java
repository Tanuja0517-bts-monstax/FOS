package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMClasses.RestaurantsPage;
import ReadDataFromExternalFile.ReadFromPropertiesFile;

public class LogIntoApplicationAddDishesOf1stRestaurant {
	public WebDriver driver=null;
	public ReadFromPropertiesFile rpf;
	@Test
	public void addDishes() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		
		rpf=new ReadFromPropertiesFile();
		
		driver.get(rpf.readDataFromPropertyFile("url"));
		RestaurantsPage rp=new RestaurantsPage(driver);
		//System.out.println("Restaurant Page loaded");
		rp.getLogin().click();;
		//System.out.println("Login Page");
		rp.getUn().clear();
		rp.getUn().sendKeys(rpf.readDataFromPropertyFile("un"));
		//System.out.println("Username entered");
		rp.getPwd().clear();
		rp.getPwd().sendKeys(rpf.readDataFromPropertyFile("pwd"));
		//System.out.println("Password entered");
		rp.getLoginBut().click();
		//System.out.println("Clicked on Login button");
		
		List<WebElement> li=rp.getRestaurantsName();
		String restName="Highlands Bar & Grill";
		for(WebElement ele:li) {
			if(ele.getText().equals(restName)) {
				rp.getViewMenu().click();
			}
			break;
		}
		
		//driver.quit();
	}
}
