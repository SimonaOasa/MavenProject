package selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		//FirefoxDriver()
		//EdgeDriver()
		//System.set.property("webdriver.chrome.driver", "path to chromedriver.exe")
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);//bad practice
		//driver.close();//inchide tab-ul curent
		driver.quit();//inchide fereastra de browser 
		
	}
	
}
