package curs23;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class NavigationExample extends BaseTest {

	@Test
	public void navigationTest() throws InterruptedException {
		
		driver.navigate().to("https://keyfood.ro/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
}
