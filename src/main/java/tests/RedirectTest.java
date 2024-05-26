package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import seleniumutils.BaseTest;
import utils.PropertiesFileProcessor;

public class RedirectTest extends BaseTest{
	
	String expectedURL1 = PropertiesFileProcessor.readPropertiesFile("expectedURL1", "credentials.properties");
	String expectedURL2 = PropertiesFileProcessor.readPropertiesFile("expectedURL2", "credentials.properties");	
	String expectedURL3 = PropertiesFileProcessor.readPropertiesFile("expectedURL3", "credentials.properties");	
	String expectedURL4 = PropertiesFileProcessor.readPropertiesFile("expectedURL4", "credentials.properties");
	String expectedURL5 = PropertiesFileProcessor.readPropertiesFile("expectedURL5", "credentials.properties");
	String expectedURL6 = PropertiesFileProcessor.readPropertiesFile("expectedURL6", "credentials.properties");	
		
	@DataProvider
	public Object[][] redirectTestData(){
		Object[][] data = new Object[6][1];
		
		data[0][0] = expectedURL1;
		data[1][0] = expectedURL2;
		data[2][0] = expectedURL3;
		data[3][0] = expectedURL4;
		data[4][0] = expectedURL5;
		data[5][0] = expectedURL6;
		
		return data;
}

	@Test(dataProvider = "redirectTestData" )
	public void testRedirect (String expectedURL) throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		
		
		WebElement carte1 = driver.findElement(By.xpath("//a[@href='the-forest']"));
		carte1.click();
		String URL1 = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		driver.navigate().back();
		assertEquals(URL1, expectedURL1);
		
		
		WebElement numeCarte2 = driver.findElement(By.xpath("//a[@href='the-son']"));
		numeCarte2.click();
		String URL2 = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		driver.navigate().back();
		assertEquals(URL2, expectedURL2);
		
		WebElement numeCarte3 = driver.findElement(By.xpath("//a[@href='life-in-the-garden']"));
		numeCarte3.click();
		String URL3 = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		driver.navigate().back();
		assertEquals(URL3, expectedURL3);
		
		WebElement numeCarte4 = driver.findElement(By.xpath("//a[@href='the-long-road-to-the-deep-silence']"));
		numeCarte4.click();
		String URL4 = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		driver.navigate().back();
		assertEquals(URL4, expectedURL4);
		
		
		WebElement numeCarte5 = driver.findElement(By.xpath("//a[@href='its-a-really-strange-story']"));
		numeCarte5.click();
		String URL5 = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		driver.navigate().back();
		assertEquals(URL5, expectedURL5);
		
		
		WebElement numeCarte6 = driver.findElement(By.xpath("//a[@href='storm']"));
		numeCarte6.click();
		String URL6 = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		driver.navigate().back();
		assertEquals(URL6, expectedURL6);
		
	}
}