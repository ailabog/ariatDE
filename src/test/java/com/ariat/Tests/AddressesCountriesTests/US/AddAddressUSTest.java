package com.ariat.Tests.AddressesCountriesTests.US;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.PhoneUS;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Pages.Main.AddAddressesPage;
import com.ariat.Pages.Main.AddressesPage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Tests.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Adds a new address and checks the address was created for US
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class AddAddressUSTest extends BaseTest {

	private HomePage homePage;
	private HomePageUS homePageUS;
	private HomePageUK homePageUK;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddAddressesPage addAddressPage;
	private AddressesPage addressesPage;
	private Environments environment;
	private PhoneUS phoneUS;
	private EUCountries euCountry;

	public static final String ADDRESS = GenerateRandomDataUtils.generateRandomString(5);
	public static final String CITY = GenerateRandomDataUtils.generateRandomString(5);
	public static final String POST_CODE = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String ADDRESS_ID = GenerateRandomDataUtils.generateRandomAlphaNumeric(5);
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void addAddressUSTest() {
		logger.info("Starting add address US test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		signInPage = homePageUS.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addAddressPage = myAccountPage.returnAddAddressesPageMiddleNav();
		addAddressPage.enterFName("A");
		addAddressPage.enterLName("B");
		addAddressPage.enterAddress1("Avenue, 5th");
		addAddressPage.enterCity(CITY);
		addAddressPage.selectState("New York");
		addAddressPage.enterPostCode(POST_CODE);
		addAddressPage.enterPhone(phoneUS.phone1.getNumber());
		addAddressPage.enterAddressId(ADDRESS_ID);
		addressesPage = addAddressPage.returnAddressesPage();
		addressesPage.checkAddress(ADDRESS_ID);
		logger.info("Finishing add address US test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUS.quit();
		homePageUK.quit();
		signInPage.quit();
		myAccountPage.quit();
		addAddressPage.quit();
		addressesPage.quit();
	}
}