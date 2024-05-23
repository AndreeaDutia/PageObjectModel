package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ComandaTest extends BaseTest {
	
	@Test
	public void ComandaTest() throws InterruptedException {
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();
		
		WebElement searchField = driver.findElement(By.xpath(" //input[@class='search_field']"));
		searchField.sendKeys("The story about me");
		
		WebElement moreResults = driver.findElement(By.linkText("More results …"));
		moreResults.click();
		
		WebElement loadMore = driver.findElement(By.linkText("LOAD MORE"));
		loadMore.click();
		Thread.sleep(2000);
		Actions  action = new Actions(driver);
		action.scrollByAmount(0, 1000).perform();
		loadMore.click();
		
		
		action.scrollByAmount(0, 1000).perform();
		
	//	WebElement book = driver.findElement(By.xpath("//h4[@class='post_title']//a[@href= 'https://keybooks.ro/shop/the-story-about-me/']"));
		//book.click();
	}

}
