package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PostFormatPage {
	
	public WebDriver driver;
	public PostFormatPage (WebDriver driver) {
		this.driver = driver; 
	}
	
	public By blogMenu = By.id("menu-item-76");
	public By postLinkMenu = By.id("menu-item-232");
	
	public void navigateToPostFormat() {
		MenuPage menu = new MenuPage(driver);
		driver.findElement(blogMenu).click();
		driver.findElement(postLinkMenu).click();
		
	}
	
		
	}
	


