package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.math.BigDecimal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import pages.MenuPage;
import pages.ShopPage;
import seleniumutils.BaseTest;

public class ShopPageTest extends BaseTest{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	@Test(priority=1)
	public void selectByValueTest() {
		
		MenuPage menuPage = new MenuPage(driver); 
		menuPage.navigateTo(menuPage.shopLink);
		
		ShopPage shopPage = new ShopPage(driver);
		shopPage.filterByValue("price");
		
		assertEquals(shopPage.getCurrentSelectedOption(),"Sort by price: low to high");
		
			
	}
	
	@Test(priority = 2)
	
	public void Price() {
		
		WebElement lowestPrice = driver.findElement(RelativeLocator.with(By.cssSelector("span[class='woocommerce-Price-amount amount']")).below(By.cssSelector("a[href*='ultimate-book-of-receipes']")));
		//WebElement lowestPrice = driver.findElement(By.cssSelector("span[class='woocommerce-Price-amount amount']:first-of-type"));
		System.out.println(lowestPrice.getText());
		assertTrue(lowestPrice.getText().equals("$10.55"));
		

		WebElement highestPrice = driver.findElement(RelativeLocator.with(By.cssSelector("span[class='woocommerce-Price-amount amount']")).below(By.cssSelector("a[href*='storm']")));
		System.out.println(highestPrice.getText());
		assertTrue(highestPrice.getText().equals("$80.20"));
		
		String value1 = lowestPrice.getText(); // "$10.55"
		String value2 = highestPrice.getText(); // "$80.20"
		
		double doubleValue1 = Double.parseDouble(value1.substring(1)); // 10.55
		double doubleValue2 = Double.parseDouble(value2.substring(1)); // 80.20
		
		if (doubleValue1 < doubleValue2) {
		    System.out.println("Smallest value: $" + doubleValue1);
		} else {
		    System.out.println("Smallest value: $" + doubleValue2);
		}

		
	}
	

}
