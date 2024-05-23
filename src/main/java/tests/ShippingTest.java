package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.BlogPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ShippingAddressPage;
import seleniumutils.BaseTest;
import utils.PropertiesFileProcessor;

public class ShippingTest extends BaseTest{
	
	String user = PropertiesFileProcessor.readPropertiesFile("username", "credentials.properties");
	String pass = PropertiesFileProcessor.readPropertiesFile("password", "credentials.properties");
	
	@Test(priority=1)
	public void validLoginTest() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		LoginPage login = new LoginPage(driver);
		
		menu.navigateTo(menu.loginLink);
		login.loginInApp(user, pass);
		Thread.sleep(5000);
		
	}
	
	@Test(priority=2)
	public void staleExample() throws InterruptedException {
		MenuPage menu = new MenuPage(driver); 
		ShippingAddressPage shipping = new ShippingAddressPage(driver);
		
		
	WebElement element = driver.findElement(By.linkText("Addresses"));
	Select select = new Select(element); 
	select.selectByIndex(41);
	
	}
}
