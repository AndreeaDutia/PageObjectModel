package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.MenuPage;
import seleniumutils.BaseTest;

public class RedirectSocialMediaTest extends BaseTest {
	
	
	 @DataProvider

     public Object[][] redirectSocialMediaTestData(){

          Object[][] data = new Object[3][2];

         

          data[0][0] = "facebook.com";
          data[0][1] = "https://www.facebook.com/keytraining.ro";
         
          data[1][0] = "twitter.com";
          data[1][1] = "https://x.com/";

          data[2][0] = "instagram.com";
          data[2][1] = "https://www.instagram.com/";

          return data;
          
	}


    @Test(dataProvider = "redirectSocialMediaTestData" )

          public void redirectSocialMediaTestData (String pageTitle, String pageURl) throws InterruptedException {

              
               WebElement page = driver.findElement(By.xpath("//a[contains(@href, '"+pageTitle+"')]"));              
               page.click();
               ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
               driver.switchTo().window(tabs.get(1)); 
               Thread.sleep(5000);
               String URL = driver.getCurrentUrl();
               assertEquals(URL, pageURl);
               System.out.println("URL of the new tab: " + URL);
               driver.close();
               driver.switchTo().window(tabs.get(0));
               

          }
         

	/*
@Test
public void RedirectSocialMediaTest() throws InterruptedException {
	

WebElement facebook_button = driver.findElement(By.xpath("//a[contains(@href, 'facebook.com')]"));
facebook_button.click();

ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs.get(1)); 
Thread.sleep(5000);
String URL1 = driver.getCurrentUrl();
assertEquals(URL1, "https://www.facebook.com/keytraining.ro");
System.out.println("URL of the new tab: " + URL1);
driver.switchTo().window(tabs.get(0)); 

Thread.sleep(5000);
WebElement twitter_button = driver.findElement(By.xpath("//a[contains(@href, 'twitter.com')]"));
twitter_button.click();

ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs1.get(2)); 
Thread.sleep(5000);
String URL2 = driver.getCurrentUrl();
assertEquals(URL2, "https://x.com/");
System.out.println("URL of the new tab: " + URL2);
driver.switchTo().window(tabs1.get(0));

Thread.sleep(5000);
WebElement instagram_button = driver.findElement(By.xpath("//a[contains(@href, 'instagram.com')]"));
instagram_button.click();
Thread.sleep(5000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(3));

String URL3 = driver.getCurrentUrl();
assertEquals(URL3, "https://www.instagram.com/");
System.out.println("URL of the new tab: " + URL3);
driver.switchTo().window(tabs2.get(0));
     	
     	}
     	
*/
}

