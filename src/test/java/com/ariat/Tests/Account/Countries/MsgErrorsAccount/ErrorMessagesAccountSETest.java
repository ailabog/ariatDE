package com.ariat.Tests.Account.Countries.MsgErrorsAccount;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageSE;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Main.CreateAccountPage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Utils.GenerateRandomDataUtils;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Negative tests for Sweeden account
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class ErrorMessagesAccountSETest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private CreateAccountPage createAccountPage;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageSE homePageSE;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	public static final String FIRST_NAME = GenerateRandomDataUtils.generateRandomNumber(7);
	public static final String LAST_NAME = GenerateRandomDataUtils.generateRandomNumber(7);
	public static final String BIRTH_MONTH = "March";
	public static final String BIRTH_DAY = "02";

	public static final String EMAIL = GenerateRandomDataUtils.generateRandomAlphaNumeric(7);
	
	public static final String PASSWORD = GenerateRandomDataUtils.generateRandomNumber(3);

	public static final String ORDER_NO = GenerateRandomDataUtils.generateRandomAlphaNumeric(4);
	public static final String BILLING_ZIP_CODE = GenerateRandomDataUtils.generateRandomString(3);

	public static final String ERROR_MESSAGE = "Sorry this order number or postcode does not match our records. Check your records and try again.";
	public static final String INVALID_EMAIL_MSG = "The email address is invalid.";
	public static final String INVALID_PASS_MSG = "(8 - 255 characters)";
	public static final String MISMATCH_PASS_MSG = "Sorry, this does not match our records. Check your spelling and try again.";
	
	public static final String WRONG_EMAIL = "aaaa@yahoo.com";
	public static final String OK_EMAIL = "aila.bogasieru@yahoo.com";
	public static final String WRONG_PASSWORD = "Password";
	public static final String OK_PASSWORD = "Parola12345!";
			
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void errorsAccountTest() {
		logger.info("Starting error message in creating new account test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageSE = (HomePageSE) homePage.chooseEULocation(euCountry.SE, euCountry.SE.getCurrencyISO());
		signInPage = homePageSE.returnSignInPage();
		createAccountPage = signInPage.returnCreateAccountPage();
		createAccountPage.firstName(FIRST_NAME);
		createAccountPage.lastNameInfo(LAST_NAME);
		createAccountPage.selectBirthMonth(BIRTH_MONTH);
		createAccountPage.selectBirthDay(BIRTH_DAY);
		createAccountPage.GenderFemale();
		createAccountPage.enterEmail(EMAIL);
		createAccountPage.assertWrongEmailCreateAccount(INVALID_EMAIL_MSG);
		createAccountPage.clearEmail();
		createAccountPage.enterEmail("aila.bogasieru@ariat.com");
		createAccountPage.confirmEmail(EMAIL);
		createAccountPage.assertWrongConfirmEmailCreateAccount(INVALID_EMAIL_MSG);
		createAccountPage.clearEmail();
		createAccountPage.enterEmail("aila.bogasieru@ariat.com");
		createAccountPage.enterPassword(PASSWORD);
		createAccountPage.confirmPassword(PASSWORD);
		createAccountPage.createAccountClick();
		createAccountPage.assertWrongPassCreateAccount(INVALID_PASS_MSG, INVALID_PASS_MSG);
		logger.info("Finishing error messages in creating new account test...");
	}

	@Test(priority = 1)
	public void returningCustomerWrongPasswordTest() {
		logger.info("Starting returning customer wrong password test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageSE = (HomePageSE) homePage.chooseEULocation(euCountry.SE, euCountry.SE.getCurrencyISO());
		signInPage = homePageSE.returnSignInPage();
		signInPage.returningCustomer(OK_EMAIL, "EnglishUK");
		signInPage.returningPassword(WRONG_PASSWORD);
		signInPage.loginClick();
		signInPage.assertWrongPasswordMessage(MISMATCH_PASS_MSG);
		logger.info("Finishing returning customer wrong password test...");
	}
	
	@Test(priority = 2)
	public void returningCustomerWrongEmailTest() {
		logger.info("Starting returning customer wrong email test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageSE = (HomePageSE) homePage.chooseEULocation(euCountry.SE, euCountry.SE.getCurrencyISO());
		signInPage = homePageSE.returnSignInPage();
		signInPage.returningCustomer(WRONG_EMAIL, "EnglishUK");
		signInPage.returningPassword(OK_PASSWORD);
		signInPage.loginClick();
		signInPage.assertWrongEmailMessage(MISMATCH_PASS_MSG);
		logger.info("Finishing returning customer wrong email test...");
	}

	@Test(priority = 3)
	public void checkInvalidOrderTest() {
		logger.info("Starting checking invalid order test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageSE = (HomePageSE) homePage.chooseEULocation(euCountry.SE, euCountry.SE.getCurrencyISO());
		signInPage = homePageSE.returnSignInPage();
		signInPage.checkOrder(ORDER_NO, OK_EMAIL, BILLING_ZIP_CODE);
		signInPage.checkStatusClick();
		signInPage.assertErrorMessageInexistingOrderNo(ERROR_MESSAGE);
		logger.info("Finishing checking invalid order test...");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageSE.quit();
		signInPage.quit();
		createAccountPage.quit();
		myAccountPage.quit();
	}
}
