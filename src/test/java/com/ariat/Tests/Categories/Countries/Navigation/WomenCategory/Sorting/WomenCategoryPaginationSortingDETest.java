package com.ariat.Tests.Categories.Countries.Navigation.WomenCategory.Sorting;

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
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;


/**
 * Pagination and sorting for Women Category United Kingdom test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenCategoryPaginationSortingDETest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageDE homePageDE;
	private WomenCategoryPage womenCategoryPage;
	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
    public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
			
    @BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test
	public void navigateWomenFootwearCategories() {
		logger.info("Starting sort and navigate pagination test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageDE = (HomePageDE) homePage.chooseEULocation(euCountry.DE, euCountry.DE.getCurrencyISO());
		womenCategoryPage = homePageDE.returnWomenCategoryPage();
		womenCategoryPage.clickSortUp();
		womenCategoryPage.sortProductWomenCategoryRecommended();
		womenCategoryPage.clickSortUp();
		womenCategoryPage.sortProductWomenCategoryBestSellersDE();
		womenCategoryPage.clickSortUp();
		womenCategoryPage.sortProductWomenCategoryPriceHighToLow();
		womenCategoryPage.show72ItemsUpDE();
		womenCategoryPage.show108ItemLinkUpDE();
		womenCategoryPage.show36ItemsUp();
		womenCategoryPage.nextPaginationUp();
		womenCategoryPage.prevPaginationButtonUp();
		womenCategoryPage.show72ItemsDown();
		womenCategoryPage.show108ItemLinkDown();
		womenCategoryPage.nextPaginationDown();
		womenCategoryPage.backToTopClick();
		logger.info("Finishing  sort and navigate pagination test.");
	}
	
	@AfterTest
	public void clearBrowserSession() {
		homePage.quit();
		homePageUK.quit();
		homePageDE.quit();
		womenCategoryPage.quit();
		KillChrome kill = new KillChrome();
		kill.killChrome();
    }
}
