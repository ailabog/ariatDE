package com.ariat.Pages.HomePagesCountries;

import static org.testng.Assert.assertEquals;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Pages.Categories.MenCategories.MenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingTopsAndTshirtsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Pages.Products.CasualShoeProductPage;
import com.ariat.Pages.Products.GlovesProductPage;
import com.ariat.Utils.WebDriverUtils;

public class HomePageDE extends BasePage implements List<HomePage> {
	
	private static final Logger logger = LoggerFactory.getLogger(HomePageDE.class);
	
	private By womenCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/a");
	private By womenText = By.xpath("//*contains(text(),'Women']");
	private By menCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/a");
	private By menText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By returningCustomerText = By.xpath("//*text()='Returning customer']");
	private By checkOrderText = By.xpath("//*text()='Check an order / request return']");
	private By newcustomerText = By.xpath("//*text()='New Customer']");
	private By signIn = By.xpath("//a[text()= 'Einloggen']");
	private By search = By.xpath("//*[@id=\"header-main-content\"]/div/div[5]/div/div[1]/span[2]");
	private By searchTextBox = By.xpath("//input[@placeholder='Produktsuche']");
	private By textMsgProduct = By.xpath("//*[@id=\"search-suggestions-results\"]/div/div[1]/div[1]");
	private By seeAllproductsLink = By.xpath("//*[@id=\"search-suggestions-results\"]/div/div[1]/div[2]/a");
	private By closeSearch = By.xpath("//*[@id=\"header-main-content\"]/div/div[6]/div[2]/form/div/div[1]/span/span");
	
	private By ariatLogo = By.className("global-nav-logo-svg");
	private By kidsCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[3]/a");
	private By clearanceCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[4]/a");
	private By ariatLifeCategory = By.linkText("Ariat Life");
	private By exploreCategory = By.linkText("Explore");
	private By giftGuideMenu = By.xpath("//img[contains(@src, 'gift-guide-category-image.png')]");
	private By searchIcon = By.xpath("//*[@id=\"header-main-content\"]/div/div[5]/div/div[1]/span[1]");
	private By basket = By.xpath("//*[@id=\"header-main-content\"]/div/div[5]/div/div[2]/a/span[1]");
	private By bannerDeliveryText = By.xpath("//*[@id=\"ar-global-utility-promo\"]/div/div");
	private By closeSearchIcon = By
			.xpath("//*[@id=\"header-main-content\"]/div/div[6]/div[2]/form/div/div[1]/span/span");
	private By findARetailerHeader = By.linkText("Find a Retailer");
	private By aboutUsHeader = By.linkText("About Us");
	private By chooseLocationArrow = By.xpath("//*[@id=\"chooserTriggerHeader\"]/span/span");
	private By saveAndContinueLocationButton = By.id("btnSaveContext");
	private By countrySelectorWindow = By.xpath("//*[@id=\"ext-gen44\"]/body/div[10]");

	private By emailSubscriptionTextBoxFooter = By.name("email");
	private By subscribeButtonFooter = By.name("submit");
	private By facebookIcon = By
			.xpath("//*[@id=\"ar-footer-wrapper\"]/div[1]/div[1]/div/div[2]/div[2]/div/div/p/a[1]/span");
	private By twitterIcon = By
			.xpath("//*[@id=\"ar-footer-wrapper\"]/div[1]/div[1]/div/div[2]/div[2]/div/div/p/a[2]/span");
	private By instagramIcon = By
			.xpath("//*[@id=\"ar-footer-wrapper\"]/div[1]/div[1]/div/div[2]/div[2]/div/div/p/a[3]/span");
	private By orderStatusFooter = By.linkText("Order Status");
	private By returnsFooter = By.linkText("Returns");
	private By trackYourOrderFooter = By.linkText("Track Your Order");
	private By warrantyFooter = By.linkText("Warranty");
	private By deliveryFooter = By.linkText("Delivery");
	private By faqsFooter = By.linkText("FAQs");
	private By sizeChartsFooter = By.linkText("Size Charts");
	private By findARetailerFooter = By.linkText("Find a Retailer");
	private By divinoStockListFooter = By.linkText("Divino Stockists");
	private By contactUsFooter = By.linkText("Contact Us");
	private By emailSignUpFooter = By.linkText("Email Sign Up");
	private By internationalFooter = By.linkText("International");
	private By pressRoomFooter = By.linkText("Press Room");
	private By aboutUsFooter = By.linkText("About Us");
	private By careersFooter = By.linkText("Careers");
	private By privacyFooter = By.linkText("Privacy");
	private By cookiePolicyFooter = By.linkText("CCookie Policy");
	private By termsAndConditionsFooter = By.linkText("Terms & Conditions");
	private By modernSlaveryActFooter = By.linkText("Modern Slavery Act");
	private By athletesFooter = By.linkText("Athletes");
	private By myAccountsFooter = By.linkText("My Accounts");
	private By wishListFooter = By.linkText("Wishlist");
	private By partnersFeiFooter = By.xpath("//*[@id=\"footer-accordion\"]/ul[5]/li[1]/a/span");
	
	private By womenFootwearCasualShoesCategory = By.xpath("//a[text()='Casual Shoes']");
    private By womenAccessoriesText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
    private By accessoriesCategoryDE = By.xpath("//a[text()=' Accessoires']");
   
   private By topsAndTshirtsText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
   private By topsAndTshirtsCategoryDE = By.xpath("//a[text()='Oberteile & T-Shirts']");
   private By glovesCategory = By.xpath("//a[text()='Gloves']");
   private By tekGrip = By.xpath("//img[@class='psd-4-full-width-video-module-1__image ms-image-responsive ms-full-width lazyloaded' and @title='Insulated Tek Grip']");
  	private By tekGripText = By.xpath("//*contains[text()='Tek Grip']");
   
	protected HomePageDE(WebDriver driver) {
		super(driver);
	}
	
	public GlovesProductPage returnGlovesProductPage() {
		WebDriverUtils.moveToElement(driver, womenCategory);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, glovesCategory);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, tekGrip);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(tekGripText));
		return new GlovesProductPage(driver);
	}
	
	public void checkElementsHeader() {
		if (WebDriverUtils.isElementDisplayed(driver, ariatLogo)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, ariatLogo);
		
		} else {
			logger.info("This element {}" + ariatLogo + "was not found");
		}

		if (WebDriverUtils.isElementDisplayed(driver, womenCategory)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, womenCategory);
		} else {
			logger.info("This element {}" + womenCategory + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, menCategory)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, menCategory);
	
		} else {
			logger.info("This element {}" + menCategory + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, kidsCategory)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, kidsCategory);
		} else {
			logger.info("This element {}" + kidsCategory + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, clearanceCategory)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, clearanceCategory);
		
		} else {
			logger.info("This element {}" + clearanceCategory + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, giftGuideMenu)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, giftGuideMenu);
		} else {
			logger.info("This element {}" + giftGuideMenu + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, ariatLifeCategory)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, ariatLifeCategory);
		} else {
			logger.info("This element {}" + ariatLifeCategory + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, exploreCategory)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, exploreCategory);
		} else {
			logger.info("This element {}" + exploreCategory + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, basket)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, basket);
		} else {
			logger.info("This element {}" + basket + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, signIn)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, signIn);
		} else {
			logger.info("This element {}" + signIn + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, bannerDeliveryText)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, bannerDeliveryText);
		} else {
			logger.info("This element {}" + bannerDeliveryText + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, findARetailerHeader)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, findARetailerHeader);
		} else {
			logger.info("This element {}" + findARetailerHeader + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, aboutUsHeader)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, aboutUsHeader);
		} else {
			logger.info("This element {}" + aboutUsHeader + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, chooseLocationArrow)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.isElementDisplayed(driver, countrySelectorWindow)) {
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
		} else {
				logger.info("Country selector window did not show up");
			}
		} else {
			logger.info("This element {}" + chooseLocationArrow + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, searchIcon)) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, searchIcon);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, closeSearchIcon);
		} else {
			logger.info("This element {}" + searchIcon + "was not found");
		}
	}

	public void checkElementsFooter() {
		if (WebDriverUtils.isElementDisplayed(driver, emailSubscriptionTextBoxFooter)
				&& WebDriverUtils.isElementDisplayed(driver, subscribeButtonFooter)) {
			logger.info("These elements {}" + emailSubscriptionTextBoxFooter + subscribeButtonFooter + "were found");
		} else {
			logger.info(
					"These elements {}" + emailSubscriptionTextBoxFooter + subscribeButtonFooter + "were not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, facebookIcon)
				&& WebDriverUtils.isElementDisplayed(driver, twitterIcon)
				&& WebDriverUtils.isElementDisplayed(driver, instagramIcon)) {
			logger.info("Elements {}" + facebookIcon + twitterIcon + instagramIcon + "were found");
		} else {
			logger.info("Elements {}" + facebookIcon + twitterIcon + instagramIcon + "were not found");
		}

		if (WebDriverUtils.isElementDisplayed(driver, orderStatusFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, orderStatusFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			WebDriverUtils.scrollDown(driver, orderStatusFooter);
		} else {
			logger.info("This element {}" + orderStatusFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, returnsFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, returnsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + returnsFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, trackYourOrderFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, trackYourOrderFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + trackYourOrderFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, warrantyFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, warrantyFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + warrantyFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, deliveryFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, deliveryFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + deliveryFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, faqsFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, faqsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + faqsFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, sizeChartsFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, sizeChartsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + sizeChartsFooter + "was not found");
		}

		if (WebDriverUtils.isElementDisplayed(driver, findARetailerFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, findARetailerFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + findARetailerFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, divinoStockListFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, divinoStockListFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + divinoStockListFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, contactUsFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, contactUsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + contactUsFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, emailSignUpFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, emailSignUpFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + emailSignUpFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, internationalFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, internationalFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + internationalFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, pressRoomFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, pressRoomFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + pressRoomFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, aboutUsFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, aboutUsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + aboutUsFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, careersFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, careersFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + careersFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, cookiePolicyFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, cookiePolicyFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + cookiePolicyFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, privacyFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, privacyFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + privacyFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, termsAndConditionsFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, termsAndConditionsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + termsAndConditionsFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, modernSlaveryActFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, modernSlaveryActFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + modernSlaveryActFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, athletesFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, athletesFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + athletesFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, myAccountsFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, myAccountsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + myAccountsFooter + "was not found");
		}

		if (WebDriverUtils.isElementDisplayed(driver, wishListFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, wishListFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + wishListFooter + "was not found");
		}
		if (WebDriverUtils.isElementDisplayed(driver, partnersFeiFooter)) {
			WebDriverUtils.clickOnElementWithWait(driver, partnersFeiFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + partnersFeiFooter + "was not found");
		}
	}
	
	public void search(String option) {
		logger.info("Searching for a product...");
		WebDriverUtils.clickOnElementWithWait(driver, search);
		WebDriverUtils.enterTextBox(driver, searchTextBox, option);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void assertProductDisplayed(String expectedText) {
		String text = WebDriverUtils.getElementText(driver, textMsgProduct);
		assertEquals(text, expectedText, "Produktergebnisse fur:" + text);
	}
	
	public void assertProductDisplayedDE(String expectedText) {
		String text = WebDriverUtils.getElementText(driver, textMsgProduct);
		assertEquals(text, expectedText, "Produktergebnisse f�r" + text);
	}

	public void seeAllproducts() {
		logger.info("Display all the products...");
		WebDriverUtils.clickOnElementWithWait(driver, seeAllproductsLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void closeSearch() {
		logger.info("Close serach products...");
		WebDriverUtils.clickOnElementWithWait(driver, closeSearch);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public SignInPage returnSignInPage() {
		WebDriverUtils.clickOnElementWithWait(driver, signIn);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(returningCustomerText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(checkOrderText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(newcustomerText));
		return new SignInPage(driver);
	}
	
	public WomenCategoryPage returnWomenCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenText));
		return new WomenCategoryPage(driver);
	}

	public MenCategoryPage returnMenCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menText));
		return new MenCategoryPage(driver);
	}
	
	public CasualShoeProductPage returnCasualShoeProductPage() {
		WebDriverUtils.moveToElement(driver, womenCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenFootwearCasualShoesCategory));
		return new CasualShoeProductPage(driver);
	}
		
	public WomenAccessoriesPage returnAccessoriesCategoryPageDE() {
		WebDriverUtils.moveToElement(driver, womenCategory);
		WebDriverUtils.clickOnElement(driver, accessoriesCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesText));
		return new WomenAccessoriesPage(driver);
	}
	
	public WomenClothingTopsAndTshirtsPage returnWomenClothingTopsAndTshirtsPageDE() {
		WebDriverUtils.moveToElement(driver, womenCategory);
		WebDriverUtils.clickOnElement(driver, topsAndTshirtsCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(topsAndTshirtsText));
		return new WomenClothingTopsAndTshirtsPage(driver);
	}

	@Override
	public boolean add(HomePage e) {
		
		return false;
	}

	@Override
	public void add(int index, HomePage element) {
		

	}

	@Override
	public boolean addAll(Collection<? extends HomePage> c) {
		
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends HomePage> c) {
		
		return false;
	}

	@Override
	public void clear() {
		

	}

	@Override
	public boolean contains(Object o) {
		
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public HomePage get(int index) {
		
		return null;
	}

	@Override
	public int indexOf(Object o) {
		
		return 0;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public Iterator<HomePage> iterator() {
		
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		
		return 0;
	}

	@Override
	public ListIterator<HomePage> listIterator() {
		
		return null;
	}

	@Override
	public ListIterator<HomePage> listIterator(int index) {
		
		return null;
	}

	@Override
	public boolean remove(Object o) {
		
		return false;
	}

	@Override
	public HomePage remove(int index) {
		
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public HomePage set(int index, HomePage element) {
		
		return null;
	}

	@Override
	public int size() {
		
		return 0;
	}

	@Override
	public List<HomePage> subList(int fromIndex, int toIndex) {
		
		return null;
	}

	@Override
	public Object[] toArray() {
		
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		return null;
	}
}
