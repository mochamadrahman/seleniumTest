package seleniumtest.pages;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void setup() {
//		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.mitrais.com");
		driver.manage().window().maximize();
	}

//	private void sleep(long m) {
//		try {
//			Thread.sleep(m);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
