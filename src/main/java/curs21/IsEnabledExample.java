package curs21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class IsEnabledExample extends BaseTest {

	@Test
	public void isEnabledTest() {
		//li[class='menu_user_login']
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.findElement(By.cssSelector("li[class='menu_user_login']")).click();
		
		WebElement passField = driver.findElement(By.id("password"));
				
		System.out.println(passField.isEnabled());
		
		js.executeScript("arguments[0].setAttribute('disabled,'')", passField);
		
		System.out.println("Disabled " + passField.isDisplayed());
		
		passField.sendKeys("parola");
	}
	
}
