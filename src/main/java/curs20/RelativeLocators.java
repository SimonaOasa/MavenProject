package curs20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import selenium.utils.BaseTest;

public class RelativeLocators extends BaseTest{

	/*
	 * toLeftOf
	 * toRightOf
	 * above
	 * below
	 * near
	 * 
	 */
	
	public void relativeLocatorsExample() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//h5[class*='sc_title_regular']
		//life in the garden
		
		//toLeftOf
		WebElement price = driver.findElement(RelativeLocator.with
				(By.cssSelector("h5[class*='sc_title_regular']")).toLeftOf
				(By.linkText("Life in the garden")));
		
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid purple')", 
				price);
		
		//toRightOf
		
		WebElement price2 = driver.findElement(RelativeLocator.with
				(By.cssSelector("h5[class*='sc_title_regular']")).toLeftOf
				(By.linkText("Life in the garden")));
		
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid purple')", 
				price2);
		
		//div[class='wpb_wrapper']
		WebElement author = driver.findElement(RelativeLocator.with
				(By.cssSelector("div[class='wpb_wrapper']")).above(price));
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid blue')", 
				author);
		
		
	}
	
}
