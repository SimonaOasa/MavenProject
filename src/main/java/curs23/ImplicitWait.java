package curs23;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.utils.BaseTest;

public class ImplicitWait extends BaseTest{

	public void implicitWaitExample() throws InterruptedException {
		//https://the-internet.herokuapp.com/dynamic_loading/2
		//div[id='start']>button
		//div[id='finish']>h4
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		//Thread.sleep(10000); -->bad practice
		
		WebElement finishText = driver.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finishText.getText(), "Hello World!");
	}
	
}
