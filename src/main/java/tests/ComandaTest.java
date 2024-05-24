package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
		
		WebElement moreResults = driver.findElement(By.xpath("//a[@class='post_more search_more']"));
		moreResults.click();
		
		WebElement loadMore = driver.findElement(By.xpath("//span[@class='viewmore_text_1']"));
		loadMore.click();
		Thread.sleep(3000);
		Actions  action = new Actions(driver);
		action.scrollByAmount(0, 1000).perform();
		Thread.sleep(3000);
		loadMore.click();
		Thread.sleep(3000);
		
		WebElement theStory = driver.findElement(By.xpath("//a[@href='https://keybooks.ro/shop/the-story-about-me/']"));
		theStory.click();
		
		String URL = driver.getCurrentUrl();
		assertEquals(URL, "https://keybooks.ro/shop/the-story-about-me/");
		
		WebElement addToCart = driver.findElement(By.xpath("//button[@name='add-to-cart']"));
		addToCart.click();
		
		WebElement viewCart = driver.findElement(By.xpath("//a[@class='button wc-forward']"));
		viewCart.click();
		
		String URLcart = driver.getCurrentUrl();
		assertEquals(URLcart, "https://keybooks.ro/cart/");
	}
		
		@Test
		public void cantitate() {
			
			WebElement cantitate = driver.findElement(By.xpath("//span[@class='q_inc']"));
			cantitate.click();
			
			WebElement updateCart = driver.findElement(By.xpath("//button[@name='update_cart']"));
			updateCart.click();
			
			WebElement message = driver.findElement(By.xpath("//div[contains(text(), 'Cart')]"));
			
			assertTrue(message.isDisplayed());
			
			WebElement proceedToCheckout = driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
			proceedToCheckout.click();
			
			String URLcheckout = driver.getCurrentUrl();
			assertEquals(URLcheckout, "https://keybooks.ro/checkout/");
			
			WebElement billingDetails = driver.findElement(By.xpath("//h3[contains(text(), 'Billing')]"));
			assertTrue(billingDetails.isDisplayed());
			
			WebElement additionalInfo = driver.findElement(By.xpath("//h3[contains(text(), 'Additional')]"));
			assertTrue(additionalInfo.isDisplayed());
			
			
			
			
			
		}
		
		
	
	}


