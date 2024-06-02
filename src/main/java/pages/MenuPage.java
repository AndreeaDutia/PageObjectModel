package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuPage {
	
	public WebDriver driver;
	public MenuPage(WebDriver driver) {
		this.driver = driver;
		
	}
	

	//driver.findElement(By.locator);
	
	public By loginLink = By.linkText("Login");
	public By contactsLink = By.linkText("CONTACTS");
	public By shopLink = By.linkText("BOOKS");
	public By BlogLink = By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	public By postLink = By.linkText("Post Formats");
	public By audioLink = By.linkText("Audio post");
	public By eventsLink= By.linkText("EVENTS");
	
	/* public void navigateToLogin() {
		driver.findElement(By.linkText("Login")).click();
		
	}
	public void navigateToContacts() {
		driver.findElement(By.linkText("CONTACTS")).click();
	}*/
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
		
	}
	
	//navigateTo(loginLink)
	//navigateTo(contactsLink)
	//navigateTo(shopLink)
	
	public void hoverElement(By locator) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		
	}
}
