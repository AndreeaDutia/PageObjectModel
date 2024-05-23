package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage {
	
	public WebDriver driver;
	public ShippingAddressPage(WebDriver driver) {
		this.driver = driver;
		}
	
	public By countryField = By.linkText("Select a country / region…");
	public By provinceField = By.linkText("Select an option…");
	public By settingsMenu = By.cssSelector("a[href=\"https://keybooks.ro/wp-admin/profile.php\"]");
	public By address = By.linkText("Addresses");
	public By addButton = By.linkText("Add");
	
	public void editAdress() {
		
		MenuPage menu = new MenuPage(driver); 
		menu.navigateTo(menu.loginLink);
		driver.findElement(settingsMenu).click();
		driver.findElement(address).click();
		driver.findElement(addButton).click();
					
	}
}
