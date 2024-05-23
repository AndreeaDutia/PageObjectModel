package tests;

import org.testng.annotations.Test;

import pages.AudioPostPage;
import pages.MenuPage;
import seleniumutils.BaseTest;

public class AudioPostTest extends BaseTest {
	
	@Test
	public void timeSlider() {
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.BlogLink);
		menu.navigateTo(menu.postLink);
		menu.navigateTo(menu.audioLink);
		AudioPostPage audio = new AudioPostPage(driver);
		audio.timeDragAndDrop(audio.timeSliderPosition,200,0);
		
		
	}
	
	@Test
	public void volumeSlider() {
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.BlogLink);
		menu.navigateTo(menu.postLink);
		menu.navigateTo(menu.audioLink);
		AudioPostPage audio = new AudioPostPage(driver);
		audio.VolumeDragAndDrop(audio.volumeSliderPosition,50,0);
		
		
	}

}
