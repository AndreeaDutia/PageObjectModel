package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.BlogPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ShippingAddressPage;
import pages.ShopPage;
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
		
		ShopPage shopPage = new ShopPage(driver);
		driver.navigate().to("https://keybooks.ro/account/edit-address/shipping/");
		
		
	WebElement country = driver.findElement(By.cssSelector("select[name='shipping_country']"));
	Select select = new Select(country); 
	select.selectByIndex(41);
	//Thread.sleep(5000);
	//assertEquals(getCurrentSelectedOption(),"Canada");
	
	WebElement province = driver.findElement(By.cssSelector("select[name='shipping_state']"));
	Select select1 = new Select(province); 
	select1.selectByValue("NL");
	
	
	
	}

	
	
}
