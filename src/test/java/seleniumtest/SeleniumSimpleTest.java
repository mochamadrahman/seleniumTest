package seleniumtest;

import static org.junit.Assert.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumSimpleTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
//		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.mitrais.com");
		driver.manage().window().maximize();
	}

	@Test
	public void clickOnAboutLink() {
		// Get About Link
//		WebElement aboutLink = driver.findElement(By.linkText("ABOUT"));
		WebElement aboutLink = driver.findElement(By.linkText("ABOUT US"));
		assertNotNull("About link is exist", aboutLink);

		// Click the link
		aboutLink.click();
		
		sleep(2000);

		assertTrue("URL Contains about-us", driver.getCurrentUrl().contains("about-us"));
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
