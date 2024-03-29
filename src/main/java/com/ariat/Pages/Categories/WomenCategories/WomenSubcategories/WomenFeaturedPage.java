package com.ariat.Pages.Categories.WomenCategories.WomenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Categories.WomenCategories.WomenFeatured.WomenFeaturedSubcategories.WomenFeaturedHeritageCollectionPage;
import com.ariat.Pages.Categories.WomenCategories.WomenFeatured.WomenFeaturedSubcategories.WomenFeaturedTriFactorBreechPage;
import com.ariat.Pages.Categories.WomenCategories.WomenFeatured.WomenFeaturedSubcategories.WomenFeaturedWarmWeatherRidingPage;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Featured Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenFeaturedPage extends BasePage{
	
	private By womenFeaturedTriFactorBreechCategory = By.linkText("Tri Factor Breech");
	private By womenFeaturedTriFactorBreechText = By.xpath("");
	private By womenFeaturedHeritageCollectionCategory = By.linkText("Heritage Collection");
	private By womenFeaturedHeritageCollectionText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenWarmWeatherRidingCategory = By.linkText("Warm Weather Riding");
	private By womenWarmWeatherRidingCategoryText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
		 
			
	public WomenFeaturedPage(WebDriver driver) {
		super(driver);
	}
	
	public WomenFeaturedTriFactorBreechPage returWomenFeaturedTriFactorBreechCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenFeaturedTriFactorBreechCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenFeaturedTriFactorBreechText));
		return new WomenFeaturedTriFactorBreechPage(driver);
	}
	
	public WomenFeaturedHeritageCollectionPage returnWomenFeaturedHeritageCollectionCategoryPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenFeaturedHeritageCollectionCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenFeaturedHeritageCollectionText));
		return new WomenFeaturedHeritageCollectionPage(driver);
	}
	
	public WomenFeaturedWarmWeatherRidingPage returnWomenFeaturedWarmWeatherRidingCategoryPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenWarmWeatherRidingCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenWarmWeatherRidingCategoryText));
		return new WomenFeaturedWarmWeatherRidingPage(driver);
	}
	
}
