package curs23;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ShadowDomExample  extends BaseTest{

	@Test
	public void shadowDomExample() throws InterruptedException {
		driver.navigate().to("https://keybooks.ro/events_calendar/");	
		Thread.sleep(3000);
		//div[class='shadow-element']>button
		
		WebElement button = driver.findElement(By.id("shadow-host"))
				.getShadowRoot()
				.findElement(By.cssSelector("div[class='shadow-element']>button"));
				
		
		button.click();
		
		WebElement bookPictureDay = driver.findElement(By.id("shadow-host"))
				.getShadowRoot()
				.findElement(By.cssSelector("img[src*='www.keybooks.ro_.png']"));
		assertTrue(bookPictureDay.isDisplayed());
	}
}
