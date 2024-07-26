package TemaCurs19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class KeyBooksLoginTest {

	public static void main(String[] args) {

		boolean isLoginOrEmailVisible;
		boolean isPasswordVisible;
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://keybooks.ro/");

        // Identify the 'Login' element
        WebElement loginButton = driver.findElement(By.linkText("Login"));

        // Check if the 'Login' button is displayed
        if (loginButton.isDisplayed()) {
            System.out.println("'Login' button is visible.");

            // Check if 'Login or Email' and 'Password' fields are not visible before clicking 'Login'
            //boolean isLoginOrEmailVisibleBefore = isElementVisible(driver, By.id("user_login"));
            isLoginOrEmailVisible = isElementVisible(driver, By.id("log"));
            isPasswordVisible = isElementVisible(driver, By.id("password"));

            System.out.println("'Login or Email' field visible before clicking Login: " + isLoginOrEmailVisible);
            System.out.println("'Password' field visible before clicking Login: " + isPasswordVisible);

            // Click the 'Login' button
            loginButton.click();

            
            try {
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Check if 'Login or Email' and 'Password' fields are visible after clicking 'Login'
            isLoginOrEmailVisible = isElementVisible(driver, By.id("log"));
            isPasswordVisible = isElementVisible(driver, By.id("password"));

            System.out.println("'Login or Email' field visible after clicking Login: " + isLoginOrEmailVisible);
            System.out.println("'Password' field visible after clicking Login: " + isPasswordVisible);
        } else {
            System.out.println("'Login' button is not visible.");
        }

//        // Close the browser
        driver.quit();
    }

    public static boolean isElementVisible(WebDriver driver, By locator) {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
    }
}

