package seleniumtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MitraisAboutPage extends BaseClass {

	public MitraisAboutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	private String pageTitle = "Mitrais Software Development Services | About Us";

	public String getPageTitle() {
		return pageTitle;
	}

}
