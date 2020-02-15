package com.ariat.Pages.Categories.WomenCategories.WomenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingBreechesAndTightsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingOuterwearPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingShowPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingSweatTshirtAndWoodiesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingTopsAndTshirtsPage;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Pages.Products.BreechProductPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Clothing Category Page and return methods for
 * Women Clothing Outerwear Page
 * Women Clothing Sweat Tshirt And Woodies Page
 * Women Clothing Tops And Tshirts Page
 * Women Clothing Show Page
 * Women Clothing Breeches And Tights Page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenClothingPage extends BasePage{
	
	private By womenClothingOuterwearCategoryDE = By.linkText("Oberbekleidung");
	private By womenClothingOuterwearText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
    private By womenClothingSweatTshirtAndWoodiesCatagory = By.xpath("//a[@class='global-nav-level-3-label ' and text()='Sweatshirts & Hoodies']");
    private By womenClothingSweatTshirtAndWoodiesText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenClothingTopsAndTshirtsCategory = By.xpath("//a[@class='global-nav-level-3-label ' and text()='Oberteile & T-Shirts']");
	private By womenClothingTopsAndTshirtsText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By womenClothingShowCategory = By.xpath("//a[@class='global-nav-level-3-label ' and text()='Turnierbekleidung']");
	private By womenClothingShowText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenClothingBreechesAndTightsCategory = By.xpath("//a[@class='global-nav-level-3-label ' and text()='Reithosen- & leggings']");
	private By womenClothingBreechesAndTightsText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By breechText = By.xpath("//*contains[text(),'Whipstitch Knee Patch Breech']");
	private By breechProduct = By.cssSelector("#d4131ac676fae12f026a30c6aa .psd-4-full-width-video-module-1__image");
	private By breechesAndTightsCategoryDE = By.linkText("Schränken Sie Ihre Suche ein");
	 
	public WomenClothingPage(WebDriver driver) {
		super(driver);
	}
	
	
	public WomenClothingOuterwearPage returnWomenClothingOuterwearCategoryPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingOuterwearCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingOuterwearText));
		return new WomenClothingOuterwearPage(driver);
	}
	
	public WomenClothingSweatTshirtAndWoodiesPage returnWomenClothingSweatTshirtAndWoodiesCategoryPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingSweatTshirtAndWoodiesCatagory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingSweatTshirtAndWoodiesText));
		return new WomenClothingSweatTshirtAndWoodiesPage(driver);
	}
	
	public WomenClothingTopsAndTshirtsPage returnWomenClothingTopsAndTshirtsCategoryPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingTopsAndTshirtsCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingTopsAndTshirtsText));
		return new WomenClothingTopsAndTshirtsPage(driver);
	}
	
	public WomenClothingShowPage returnWomenClothingShowCategoryPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingShowCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingShowText));
		return new WomenClothingShowPage(driver);
	}
	
	public WomenClothingBreechesAndTightsPage returnWomenClothingBreechesAndTightsCategoryPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingBreechesAndTightsCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingBreechesAndTightsText));
		return new WomenClothingBreechesAndTightsPage(driver);
	}

	
	public BreechProductPage returnBreechProductPageDE() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, breechesAndTightsCategoryDE);
		WebDriverUtils.clickOnElementWithWait(driver, breechProduct);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(breechText));
		return new BreechProductPage(driver);
	}
}
