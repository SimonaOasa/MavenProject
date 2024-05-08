package curs17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	
	@Test
	public void openBrowser() {
		//FirefoxDriver()
		//EdgeDriver()
		WebDriver browser =  new ChromeDriver();
		browser.get("https://keyfood.ro/");
		
		
	}
	
	
	

}
