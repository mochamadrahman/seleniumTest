package seleniumtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MitraisHomePage extends BaseClass {

	public MitraisHomePage() {

	}

	public MitraisHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(linkText = "HOME")
	private WebElement homeLink;

	@FindBy(linkText = "About Us")
//	@FindBy(xpath = "//*[@id=\"menu-item-28331\"]/a")
	private WebElement aboutLink;
	// *[@id="menu-item-28331"]/a
	// *[@id="menu-item-28332"]/a[1]

	@FindBy(linkText = "TEAM")
	private WebElement teamLink;

	@FindBy(linkText = "CSR")
	private WebElement csrLink;

	@FindBy(linkText = "CAREERS")
	private WebElement careersLink;

	@FindBy(linkText = "CONTACT")
	private WebElement contactLink;

//	@FindBy(name = "About Us")
//	private WebElement aboutLink;

//	private WebDriver mWebDriver;

//	private String pageTitle = "Software Development, Mining & Medical Solutions | Mitrais";

	public String pageTitle = "Mitrais: A World Class Software Development Company";

	public String getPageTitle() {
		return pageTitle;
	}

	public void clickOnAbout() {
		aboutLink.click();
	}
}
