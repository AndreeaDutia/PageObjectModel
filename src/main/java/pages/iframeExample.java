package pages;

import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class iframeExample extends BaseTest {
	
	@Test
	public void iFrameExampleTest() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		ContactsPage contacts = new ContactsPage(driver);
		
		menu.navigateTo(menu.contactsLink);
		//Thread.sleep(5000);
		
		//facem switch catre domul din interiorul iframe
		driver.switchTo().frame(driver.findElement(contacts.iframe));
		contacts.zoomMap(contacts.zoomInBtn);
		contacts.zoomMap(contacts.zoomInBtn);
		contacts.zoomMap(contacts.zoomInBtn);
		
		//facem switch inapoi catre domul principal
		driver.switchTo().defaultContent();
		driver.findElement(contacts.name).sendKeys("Harry Potter");
		
		//nu mai merge pt ca am iesit din iframe. trebuie facut switch inapoi daca vreau sa apas din nou pe butoane
		contacts.zoomMap(contacts.zoomOutBtn);
	}

}
