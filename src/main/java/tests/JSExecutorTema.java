package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.MenuPage;
import seleniumutils.BaseTest;

public class JSExecutorTema extends BaseTest {
	
	@Test
	public void example1() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		String javaScriptHover = "var objObject = document.createEvent('MouseEvents');" +  "objObject.initMouseEvent('mouseover',true);" + "arguments[0].dispatchEvent(objObject);";
		
		WebElement Blog = driver.findElement(By.id("menu-item-76"));
		WebElement PostFormats = driver.findElement(By.cssSelector("a[href*='post-formats']"));
		 
        jse.executeScript(javaScriptHover, Blog);
        
        jse.executeScript("arguments[0].click()", PostFormats);
        Thread.sleep(3000);
       
        /*
        WebElement galleryFormat = driver.findElement(By.cssSelector("a[href*='gallery-format']"));
        jse.executeScript("arguments[0].scrollIntoView()", galleryFormat);
		jse.executeScript("arguments[0].click()", galleryFormat);
		
		WebElement comment = driver.findElement(By.cssSelector("textarea[id=comment]"));
        jse.executeScript("arguments[0].scrollIntoView()", comment);
        jse.executeScript("arguments[0].value='comentariu'", comment);
        
        WebElement nume = driver.findElement(By.cssSelector("input[id=author]"));
        jse.executeScript("arguments[0].value='nume'", nume);
        
        WebElement email = driver.findElement(By.cssSelector("input[id=email]"));
        jse.executeScript("arguments[0].value='test@test.ro'", email);
        
        WebElement website = driver.findElement(By.cssSelector("input[id=url]"));
        jse.executeScript("arguments[0].value='www.test.ro'", website);
        
        WebElement postCommentButton = driver.findElement(By.cssSelector("input[id=send_comment]"));
		jse.executeScript("arguments[0].click()", postCommentButton);
        */
        
        jse.executeScript("document.getElementsByClassName('gallery-format')[0].scrollIntoView()");
		
		
		
	}


	
}