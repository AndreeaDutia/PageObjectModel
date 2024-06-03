package tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import pages.MenuPage;
import seleniumutils.BaseTest;
import utils.Screenshots;

public class ScreenshotTest extends BaseTest {
	
	@Test
	public void screenshotTest () {
	
		try {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		Screenshots sc = new Screenshots (); 
		sc.takeScreenShot(driver);
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop-2/");
		}catch (Exception e) {
			Screenshots sc = new Screenshots (); 
			sc.takeScreenShot(driver);
		}

	}

}
