package curs21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class IsSelected extends BaseTest {

	/*
	 * isDisplayed() --> se aplica pe toate tipurile de elemente 
	 * isSelected () --. se aplica doar pe elemente care au atribute type =checkbox sau radio button
	 * isEnabled () -->  se aplica pe elemente de tip input (de la utilizator : de la tastatura)
	 * 
	 */
	
	@Test
	public void isSelectedTest() throws InterruptedException {
		
		//li[class='menu_user_login']
		driver.findElement(By.cssSelector("li[class='menu_user_login']")).click();
		
		WebElement userField = driver.findElement(By.id("log"));
		
		userField.click();
		
		Thread.sleep(5000);
		System.out.println(userField.isSelected());
		
		System.out.println("--------------------------------------");
		
		WebElement checkbox = driver.findElement(By.id("rememberme"));
		
		System.out.println(checkbox.isSelected());
		
		checkbox.click();
		
		System.out.println(checkbox.isSelected());
		
	
		
	}
}
