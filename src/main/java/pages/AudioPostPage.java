package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AudioPostPage {
	
	public WebDriver driver;
	public AudioPostPage (WebDriver driver) {
		this.driver = driver; 

}
	public By playButton = By.cssSelector("div[class*=mejs-play]");
	public By timeSliderPosition = By.xpath("//*[@id=\"mep_0\"]");
	public By volumeSliderPosition = By.xpath("//*[@id=\"mep_0\"]/div/div[3]/a");

	
	
	public void timeDragAndDrop(By locator, int x, int y) {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.postLink);
		menu.navigateTo(menu.audioLink);
		driver.findElement(playButton).click();
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).clickAndHold(element).moveByOffset(x, y).release().perform();
	
}
	
	public void VolumeDragAndDrop(By locator, int x, int y) {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.postLink);
		menu.navigateTo(menu.audioLink);
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).clickAndHold(element).moveByOffset(x, y).release().perform();
	
}

}


