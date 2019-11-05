package com.ariat.Pages.Categories.MenCategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Categories.MenCategories.MenAccessoriesSubcategories.MenAccessoriesBagsPage;
import com.ariat.Pages.Categories.MenCategories.MenAccessoriesSubcategories.MenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.MenCategories.MenAccessoriesSubcategories.MenAccessoriesHeadwearPage;
import com.ariat.Pages.Categories.MenCategories.MenAccessoriesSubcategories.MenAccessoriesSocksPage;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Men Accessories Category Page top and left navigations
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenAccessoriesPage extends BasePage{
	
	private By menAccessoriesHeadwearCategory = By.linkText("Headwear");
	private By menAccessoriesHeadwearCategoryDE = By.linkText("Mützen & Caps");
	private By menAccessoriesHeadwearText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menAccessoriesGlovesCategory = By.linkText("Gloves");
	private By menAccessoriesGlovesCategoryDE = By.linkText("Handschuhe");
	private By menAccessoriesGlovesText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menAccessoriesBagsCategory = By.linkText("Bags");
	private By menAccessoriesBagsCategoryDE = By.linkText("Taschen");
	private By menAccessoriesBagsText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menAccessoriesSocksCategory = By.linkText("Socks");
	private By menAccessoriesSocksCategoryDE = By.linkText("Socken");
	private By menAccessoriesSocksText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By accessoriesHeadwearCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[1]/a");
	private By accessoriesGlovesCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[2]/a");
	private By accessoriesBagsCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[3]/a");
	private By accessoriesSocksCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[4]/a");

	public MenAccessoriesPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Top navigation
	
	public MenAccessoriesHeadwearPage returnMenAccessoriesHeadwearCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesHeadwearCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesHeadwearText));
		return new MenAccessoriesHeadwearPage(driver);
	}
	
	public MenAccessoriesHeadwearPage returnMenAccessoriesHeadwearCategoryPageDE() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesHeadwearCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesHeadwearText));
		return new MenAccessoriesHeadwearPage(driver);
	}
	
	public MenAccessoriesGlovesPage returnMenAccessoriesGlovesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesGlovesCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesGlovesText));
		return new MenAccessoriesGlovesPage(driver);
	}
	
	public MenAccessoriesGlovesPage returnMenAccessoriesGlovesCategoryPageDE() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesGlovesCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesGlovesText));
		return new MenAccessoriesGlovesPage(driver);
	}
	
	public MenAccessoriesBagsPage returnMenAccessoriesBagsCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesBagsCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesBagsText));
		return new MenAccessoriesBagsPage(driver);
	}
	
	public MenAccessoriesBagsPage returnMenAccessoriesBagsCategoryPageDE() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesBagsCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesBagsText));
		return new MenAccessoriesBagsPage(driver);
	}
	
	public MenAccessoriesSocksPage returnMenAccessoriesSocksCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesSocksCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesSocksText));
		return new MenAccessoriesSocksPage(driver);
	}
	
	public MenAccessoriesSocksPage returnMenAccessoriesSocksCategoryPageDE() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesSocksCategoryDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesSocksText));
		return new MenAccessoriesSocksPage(driver);
	}
	
	//Left navigation
	
	public MenAccessoriesHeadwearPage returnMenAccessoriesHeadwearCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, accessoriesHeadwearCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesHeadwearText));
		return new MenAccessoriesHeadwearPage(driver);
	}
	
	public MenAccessoriesGlovesPage returnMenAccessoriesGlovesCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, accessoriesGlovesCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesGlovesText));
		return new MenAccessoriesGlovesPage(driver);
	}
	
	public MenAccessoriesBagsPage returnMenAccessoriesBagsCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, accessoriesBagsCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesBagsText));
		return new MenAccessoriesBagsPage(driver);
	}
	
	public MenAccessoriesSocksPage returnMenAccessoriesSocksCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, accessoriesSocksCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesSocksText));
		return new MenAccessoriesSocksPage(driver);
	}
}
