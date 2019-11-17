package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageDE;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Utils.KillChrome;

/**
 * Search product Germany test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchDETest extends BaseTest {

	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageDE homePageDE;
	private EUCountries euCountry;
	private Environments environment;
	private final String OPTION = "boots";
	private final String MESSAGE = "Produktergebnisse für: ";

	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test
	public void searchProductTestDE() {
		logger.info("Starting search products Germany test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageDE = (HomePageDE) homePage.chooseEULocation(euCountry.DE, euCountry.DE.getCurrencyISO());
		homePageDE.search(OPTION);
	    homePageDE.assertProductDisplayed(MESSAGE+OPTION);
		homePageDE.seeAllproducts();
		logger.info("Finishing search products Germany test");
	}
	
	@AfterTest
	public void clearBrowserSession() {
		homePage.quit();
		homePageUK.quit();
		homePageDE.quit();
		KillChrome kill = new KillChrome();
		kill.killChrome();
    }
}