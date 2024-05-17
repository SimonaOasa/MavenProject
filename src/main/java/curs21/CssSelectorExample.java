package curs21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CssSelectorExample extends BaseTest{
    
	@Test
	public void cssSelectorExample() {
		
		/*
		 * Element html : <li class="menu_user_login">
		 * 
		 * sintaxa : tagname atribut = valoare_atribut
		 * tagname : li
		 * atribut : class
		 * valoare atribut : menu_user_login
		 * 
		 * css -> <li class="menu_user_login">
		 * 
		 * Css selector pt atribut ID --> .
		 * 
		 * 
		 * Css selector pt atribut ID --> #
		 * .menu_user_login --> [class="menu_user_login"]
		 * li.menu_user_login --> li[class ="menu_user_login"]
		 * 
		 * 
		 * 
		 * exemplul 2 : ul[id="menu_user"] 
		 * 
		 * #menu_user --> ul[id="menu_user"]
		 * 
		 */
		
		driver.findElement(By.cssSelector("li[class=\"menu_user_login")).click();
		//AND
		//input[name='log'][placeholder='Login or Email']
		driver.findElement(By.cssSelector("input[name='log'][placeholder='Login or Email']")).sendKeys("Test");
		
		//OR
		//input[type='password'],[name='pwd']
		driver.findElement(By.cssSelector("input[type='password'],[name='pwd']")).sendKeys("Test");
		
		
	}
	
	@Test
	public void cssSelectorExample2() {
		
		// * --> contains 
		//Ex : a[href='its-a-really-strange-story']
		//     a[href*='really]
		
		WebElement book1 = driver.findElement(By.cssSelector("a[href*='really']"));
		System.out.println(book1.getText());
		
		// ^ --. starts with 
		// a[href^='life']
		WebElement book2 = driver.findElement(By.cssSelector("a[href^='life']"));
		System.out.println(book2.getText());
		//a[href$='orest']
		
		// $ --. ends with 
		//a[href$='orest']
		WebElement book3 = driver.findElement(By.cssSelector("a[href$='orest']"));
		System.out.println(book3.getText());
		
		// ~ -->  contains word (se duce din spatiu pana in spatiu)
		//h3[class~='sc_title']
		WebElement book4 = driver.findElement(By.cssSelector("h3[class~='sc_title']"));
		System.out.println(book4.getText());
		
		//test pentru git
		
	}
}
