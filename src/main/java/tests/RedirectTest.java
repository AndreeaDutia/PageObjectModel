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
	
	 @DataProvider

     public Object[][] redirectTestData(){

          Object[][] data = new Object[6][2];

         

          data[0][0] = "the-forest";

          data[0][1] = "https://keybooks.ro/shop/the-forest/";

         

          data[1][0] = "the-son";

          data[1][1] = "https://keybooks.ro/shop/the-son/";

         

          data[2][0] = "life-in-the-garden";

          data[2][1] = "https://keybooks.ro/shop/life-in-the-garden/";

         

          data[3][0] = "the-long-road-to-the-deep-silence";

          data[3][1] = "https://keybooks.ro/shop/the-long-road-to-the-deep-silence/";

         

          data[4][0] = "its-a-really-strange-story";

          data[4][1] = "https://keybooks.ro/shop/its-a-really-strange-story/";

         

          data[5][0] = "storm";

          data[5][1] = "https://keybooks.ro/shop/storm/";

         

          return data;

}

 

     @Test(dataProvider = "redirectTestData" )

     public void testRedirect (String bookTitle, String bookURl) throws InterruptedException {

         

          WebElement carte = driver.findElement(By.xpath("//a[@href='"+bookTitle+"']"));

          carte.click();

          String URL = driver.getCurrentUrl();

          assertEquals(URL, bookURl);

          driver.navigate().back();

     }


		
	}
