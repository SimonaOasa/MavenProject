package curs20;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

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
	@Test
	public void relativeLocatorsExample() {
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 500).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//h5[class*='sc_title_regular']
		//life in the garden
		
		//toLeftOf
		WebElement price = driver.findElement(RelativeLocator.with
				(By.cssSelector("h5[class*='sc_title_regular']")).toLeftOf
				(By.linkText("Life in the garden")));
		
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid green')", 
				price);
		
		//toRightOf
		
		WebElement price2 = driver.findElement(RelativeLocator.with
				(By.cssSelector("h5[class*='sc_title_regular']")).toRightOf
				(By.linkText("Life in the garden")));
		
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid purple')", 
				price2);
		
		//above
		//div[class='wpb_wrapper']
		WebElement author = driver.findElement(RelativeLocator.with
				(By.cssSelector("div[class='wpb_wrapper']")).above(price));
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid blue')", 
				author);
		
		
		//below
		WebElement author2 = driver.findElement(RelativeLocator.with
				(By.cssSelector("div[class='wpb_wrapper']")).below
				(By.linkText("Life in the garden")));	
		
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')", 
				author2);
		
		//near 
       //img[src='https://keybooks.ro/wp-content/uploads/2016/04/book3.jpg']
	   WebElement picture = driver.findElement(RelativeLocator.with
			   (By.cssSelector("img[src='https://keybooks.ro/wp-content/uploads/2016/04/book3.jpg']"))
			   .near(By.linkText("Life in the garden"), 300));	
	   
	   js.executeScript("arguments[0].setAttribute('style', 'border:10px solid black')", 
			   picture);
		
	}
	
}
