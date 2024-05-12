package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.BlogPage;
import pages.MenuPage;
import utils.BaseTest;

public class BlogTest  extends BaseTest  {
	
	@Test
	public void postCommentTest() {
		
		
		MenuPage menu = new MenuPage(driver);
		BlogPage post = new BlogPage(driver);
		
		menu.navigateTo(menu.BlogLink);
		post.postComment("comentariu","nume","test@test.ro","website");
		
		assertTrue(post.checkMsgIsDisplayed(post.successMessage));
		
		

}
}
