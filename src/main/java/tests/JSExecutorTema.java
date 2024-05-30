package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class JSExecutorTema extends BaseTest {
	
	@Test
	public void example1() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement Blog = driver.findElement(By.id("menu-item-76"));
		WebElement PostFormats = driver.findElement(By.id("menu-item-114"));
		 
        jse.executeScript("arguments[0].click()", Blog);
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click()", PostFormats);

        String javaScriptHover = "var objObject = document.createEvent('MouseEvents');" + "objObject.initMouseEvent('mouseover',true);" + "arguments[0].dispatchEvent(objObject);";
        
		/*jse.executeScript("document.getElementsByClassName('sf-with-ul').click()");
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('menu-item-114').click()");
		Thread.sleep(3000);
		*/
        
		String pageURl = jse.executeScript("return document.URL").toString();
		System.out.println(pageURl);
		System.out.println(driver.getCurrentUrl());
		
	}


	
}