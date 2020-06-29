package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSimpleRun {

	public static void main(String[] args) throws InterruptedException {
		// Initialize webdriver
		// Chrome Browser : webdriver.chrome.driver
		// Opera Browser : webdriver.chrome.driver
		// IE Browser : webdriver.ie.driver
//		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahman_HH912\\Downloads\\chromedriver_79\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// Open browser and enter url
		driver.get("http://www.mitrais.com");

//		maximize browser window
		driver.manage().window().maximize();
		
		sleep(2000);

		// Get an element for About link
//		WebElement aboutLink = driver.findElement(By.linkText("ABOUT"));
		WebElement aboutLink = driver.findElement(By.linkText("ABOUT US"));

		// Click on the element
		aboutLink.click();

		Thread.sleep(2000);

//		System.out.println("Current Url: " + driver.getCurrentUrl());

		// Verify the page opened is About Page
		if (driver.getCurrentUrl().contains("about-us")) {
			System.out.println("About Us page is opened");
		} else {
			System.out.println("Failed to open the page");
		}

		// Close the browser and kill webdriver process
		driver.quit();
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
