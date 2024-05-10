package curs20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.utils.BaseTest;
import org.openqa.selenium.JavascriptExecutor;

public class FindElementsExample extends BaseTest {
	
	//public void testFindElements() {
		
		@Test
		public void testFindElements() {
			//figure[class='sc_image  sc_image_shape_square']
			List<WebElement> bookPictures = driver.findElements(By.cssSelector("figure[class='sc_image  sc_image_shape_square']"));
			System.out.println(bookPictures.size());
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style', 'border:10px solid green')", 
					bookPictures.get(2));
		}
//	}

}
