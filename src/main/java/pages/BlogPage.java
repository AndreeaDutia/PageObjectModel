package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BlogPage {

	public WebDriver driver;
	public BlogPage(WebDriver driver) {
		this.driver = driver;
		}
	
	public By commentField = By.id("comment");
	public By nameField = By.id("author");
	public By emailField = By.id("email");
	public By websiteField = By.id("url");
	public By blogMenu = By.id("menu-item-76");
	public By classicMenu = By.id("menu-item-114");
	public By blogItem = By.cssSelector("a[href=\"https://keybooks.ro/2016/02/02/15-amazing-things-about-reading-in-the-fall/\"][class*=sc_button]");
	public By successMessage = By.cssSelector("div[class*=comment_not_approved");
	public By postButton = By.id("send_comment");
	
	
	
	public void postComment(String comment, String name, String email, String website) {
		
		driver.findElement(blogMenu).click();
		driver.findElement(classicMenu).click();
		driver.findElement(blogItem).click();
		
		Actions  action = new Actions(driver);
		action.scrollByAmount(0, 1000).perform();
		
		driver.findElement(commentField).sendKeys(comment);
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(websiteField).sendKeys(website);
		driver.findElement(postButton).click();
		
	}
	
	public boolean checkMsgIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed(); 
	}
	
	
}
