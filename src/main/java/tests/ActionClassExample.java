package tests;

import org.testng.annotations.Test;

import pages.MenuPage;
import seleniumutils.BaseTest;

public class ActionClassExample extends BaseTest {
	
	@Test
	public void hoverExample() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.aboutLink);
		Thread.sleep(3000);
		menu.hoverElement(menu.BlogLink);
	}

}
