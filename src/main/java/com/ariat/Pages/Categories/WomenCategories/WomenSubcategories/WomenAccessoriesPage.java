package com.ariat.Pages.Categories.WomenCategories.WomenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesBagsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesHeadwearPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesScarfAndPonchosPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesSocksPage;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Accessories Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenAccessoriesPage extends BasePage{
	
	private By womenAccessoriesHeadwearCategoryDE = By.linkText("Mützen & Caps");
	private By womenAccessoriesHeadwearText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccessoriesGlovesCategoryDE = By.linkText("Handschuhe");
	private By womenAccessoriesGlovesText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccessoriesBagsCategoryDE = By.linkText("Oberbekleidung");
	private By womenAccessoriesBagsText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccessoriesScarfAndPonchosCategoryDE = By.linkText("Schals & Ponchos");
	private By womenAccessoriesScarfAndPonchosText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccessoriesSocksCategoryDE = By.linkText("Socken");
	private By womenAccessoriesSocksText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccessoriesGlovesLeftNavDE = By.linkText("Handschuhe");
    
   		public WomenAccessoriesPage(WebDriver driver) {
		super(driver);
	}
	
		
	public WomenAccessoriesHeadwearPage returnWomenAccessoriesHeadwearCategoryPageDE() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesHeadwearCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesHeadwearText));
		return new WomenAccessoriesHeadwearPage(driver);
	}
	
	public WomenAccessoriesGlovesPage returnWomenAccessoriesGlovesCategoryPageDE() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesGlovesCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
		ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesGlovesText));
		return new WomenAccessoriesGlovesPage(driver);
	}
	
	public WomenAccessoriesGlovesPage returnWomenAccessoriesGlovesCategoryleftNavPageDE() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesGlovesLeftNavDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesGlovesText));
		return new WomenAccessoriesGlovesPage(driver);
	}
	
	public WomenAccessoriesBagsPage returnWomenAccessoriesBagsCategoryPageDE() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesBagsCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesBagsText));
		return new WomenAccessoriesBagsPage(driver);
	}
	
	public WomenAccessoriesScarfAndPonchosPage returnWomenAccessoriesScarfAndPonchosCategoryPageDE() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesScarfAndPonchosCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesScarfAndPonchosText));
		return new WomenAccessoriesScarfAndPonchosPage(driver);
	}
	
	public WomenAccessoriesSocksPage returnWomenAccessoriesSocksCategoryPageDE() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesSocksCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesSocksText));
		return new WomenAccessoriesSocksPage(driver);
	}
}
