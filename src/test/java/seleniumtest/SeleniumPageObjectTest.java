package seleniumtest;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import seleniumtest.pages.BaseClass;
import seleniumtest.pages.MitraisAboutPage;
import seleniumtest.pages.MitraisHomePage;

public class SeleniumPageObjectTest extends BaseClass {

	@Test(priority = 1)
	public void validateMitraisHomeTitle() {
		MitraisHomePage homePage = new MitraisHomePage(driver);
		assertEquals("Title is NOT correct => ", homePage.getPageTitle(), driver.getTitle());
		sleep(5000);
	}

	@Test(priority = 2)
	public void validateNavigateToAbout() {
		MitraisHomePage homePage = new MitraisHomePage(driver);
		MitraisAboutPage aboutPage = new MitraisAboutPage(driver);
		homePage.clickOnAbout();
		sleep(2000);
		assertEquals("About Page Title is NOT match => ", aboutPage.getPageTitle(), driver.getTitle());
		sleep(2000);
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
