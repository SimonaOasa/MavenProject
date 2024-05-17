package curs22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CssSelectorExample extends BaseTest{
    
	@Test
	public void cssExample1() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//direct child
		//li[class='menu_user_login']>a[href='#popup_login']
		driver.findElement(
				By.cssSelector("li[class='menu_user_login']>a[href='#popup_login']"))
		.click();	
		
		//ul[id='menu_user'] input[name='log']
		//descendant --> adica intre elem parinte si cel copil punem un caracter spatiu 
		WebElement username = driver.findElement
				(By.cssSelector("ul[id='menu_user'] input[name='log']"));
		
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
						username);
		
		
		//ul#menu_user form.login_form>div>input[name='pwd']
		WebElement pass = driver.findElement
				(By.cssSelector("ul#menu_user form.login_form>div>input[name='pwd']"));
		
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				pass);
		
		
		//NOT
		WebElement submitButton = driver.findElement(
				By.cssSelector("ul form[name='login_form'] input:not([type='text'],[type='password'],[type='hidden'],[type='checkbox'])"));
		
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				submitButton);
		
	}
	
}
