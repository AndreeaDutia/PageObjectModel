package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import seleniumutils.BaseTest;

public class RedirectTest extends BaseTest{
	
	private LoginPage testRedirect;

	public boolean checkMsgIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed(); 
	}
		
	@DataProvider
	public Object[][] redirectTestData(){
		Object[][] data = new Object[6][3];
		
		data[0][0] = "The forest";
		data[0][1] = "https://keybooks.ro/shop/the-forest/";
		data[0][2] = true;
		
		data[1][0] = "The son";
		data[1][1] = "https://keybooks.ro/shop/the-son/";
		data[1][2] = true;
		
		data[2][0] = "Life in the garden";
		data[2][1] = "https://keybooks.ro/shop/life-in-the-garden/";
		data[2][2] = true;
		
		data[3][0] = "The long road to the deep Silence";
		data[3][1] = "https://keybooks.ro/shop/the-long-road-to-the-deep-silence/";
		data[3][2] = true;
		
		data[4][0] = "It’s a really strange story";
		data[4][1] = "https://keybooks.ro/shop/its-a-really-strange-story/";
		data[4][2] = true;
		
		data[5][0] = "Storm";
		data[5][1] = "https://keybooks.ro/shop/storm/";
		data[5][2] = true;
		
		return data;

}

	@Test(dataProvider = "redirectTestData" )
	public void testRedirect (String numeCarte, String expectedURL, boolean success) {
		
		MenuPage menu = new MenuPage(driver);
		
		WebElement numeCarte1 = driver.findElement(By.xpath("//a[@href='the-forest']"));
		numeCarte1.click();
		String URL = driver.getCurrentUrl();
		
		if(success) {
			assertTrue(testRedirect.checkMsgIsDisplayed(login.successLoginMessage));
			
		}else if(!success) {
			assertTrue(testRedirect.checkMsgIsDisplayed(login.errorLoginMessage));
			
		}
		
		
	}
}