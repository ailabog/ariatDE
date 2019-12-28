package com.ariat.Tests.Orders_View;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageDE;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Main.MyOrdersPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Utils.KillChrome;

/**
 * Test order status from different type of navigation
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class OrderStatusDETest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageDE homePageDE;
	private SignInPage signInPage;
	private com.ariat.Pages.Main.MyAccountPage myAccountPage;
	private MyOrdersPage myOrdersPage;


	public static final String EMAIL = "aila.bogasieru@ariat.com";
	public static final String PASSWORD = "Parola12345!";
	
	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test
	public void orderStatusTestDE() {
		logger.info("Starting  order status test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageDE = (HomePageDE) homePage.chooseEULocation(euCountry.DE, euCountry.DE.getCurrencyISO());
		signInPage = homePageDE.returnSignInPage();
		signInPage.setLoginDetails(EMAIL, "Deutsch", PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myOrdersPage = myAccountPage.returnMyOrdersPageOrderStatusMiddleNavDE();
		logger.info("Finishing order status test...");
	}
	
	@AfterTest
	public void clearBrowserSession() {
		homePage.quit();
		homePageUK.quit();
		homePageDE.quit();
		signInPage.quit();
		myAccountPage.quit();
		myOrdersPage.quit();
		KillChrome kill = new KillChrome();
		kill.killChrome();
    }
}