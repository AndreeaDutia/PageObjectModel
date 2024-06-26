package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class ShadowDomeExample extends BaseTest {

	@Test
	public void shadowDomeExample() {
		
		driver.navigate().to("https://keybooks.ro/events_calendar/");
		//driver.findElement(By.cssSelector("div[class='shadow-element']>button")).click();
		WebElement button = driver.findElement(By.cssSelector("div[id='shadow-host']")).getShadowRoot().findElement(By.cssSelector("div[class='shadow-element']>button"));
		button.click();
		
		WebElement bookDayPicture = driver.findElement(By.cssSelector("div[id='shadow-host']")).getShadowRoot().findElement(By.cssSelector("img[src*='www.keybooks.ro_.png']"));
		assertTrue(bookDayPicture.isDisplayed());
		System.err.println("TEST CEVA CEVA");// system.err Printeaza cu rosu
		}
}
