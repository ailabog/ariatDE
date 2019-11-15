package com.ariat.Pages.Main;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ariat.Utils.WebDriverUtils;

/**
 * Contains Addresses page utility with locators, methods and links with pages:
 * Add Address page
 * 
 * @author aila.bogasieru@ariat.com
 */

public class AddressesPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(AddressesPage.class);

	private By addressesLink = By.xpath("//a[text()='Addresses']");
	private By addressesText = By.xpath("//h1[text()='Addresses']");
	private By addressTextDE = By.xpath("//h1[text()='Adressen']");
	private By editLink = By.xpath("//a[@class='address-action address-action--edit']");
	private By deleteLink = By.xpath("//a[@title='Delete']");
	private By deleteLinkDE = By.xpath("//a[@title='Löschen']");
    private By makeDefaultLink = By.xpath("//u[text()='Make default']");
	private By makeDefaultLinkDE = By.xpath("//a[text()='Als Standard festlegen']");
	private By deleteButton = By.name("dwfrm_profile_address_remove");
	private By cancelButtonDialog = By.xpath("//span[text()='Cancel']");
	private By cancelButtonDialogDE = By.xpath("//span[text()='Abbrechen']");
	private By deleteButtonDialogDE = By.xpath("//span[text()='Löschen']");
	private By deleteButtonDialog = By.xpath("//span[text()='Delete']");
	private By AddAddressButton = By.xpath("//*[@id=\"addresses\"]/div[29]/a");
	private By addressNickname = By.xpath("//*[@id=\"addresses\"]/div[3]/div[1]/div[1]/h3/span");
	private By loadMoreButtonDE = By.xpath("//button[@title='Weitere laden']");
	
	private boolean checkAddress;

	public AddressesPage(WebDriver driver) {
		super(driver);
	}

	public void deleteFromEdit() {
		logger.info("Deleting the address...");
		WebDriverUtils.clickOnElementWithWait(driver, deleteButton);
	}

	public void clickDeleteYes() {
		logger.info("Deleting the address...");
		WebDriverUtils.clickOnElementWithWait(driver, deleteButtonDialog);
	}

	public void clickDeleteNo() {
		logger.info("Canceling delete the address...");
		WebDriverUtils.clickOnElementWithWait(driver, cancelButtonDialog);
	
	}

	public void makeDefaultAddress() {
		logger.info("Making default the address...");
		WebDriverUtils.clickOnElementWithWait(driver, makeDefaultLink);
	}

	public boolean checkAddress(String addressValue) {
		if (WebDriverUtils.findElement(driver, editLink) != null
				&& WebDriverUtils.findElement(driver, deleteLink) != null) {
			logger.info("Address {}" + addressValue
					+ "was created with success and actions as Edit and Delete can de done");

		}
		return checkAddress;
	}

	
	public boolean checkAddressDE(String addressValue) {

		if (WebDriverUtils.findElement(driver, editLink) != null
				&& WebDriverUtils.findElement(driver, deleteLinkDE) != null) {
			logger.info("Address {}" + addressValue
					+ "was created with success and actions as Edit and Delete can de done");

					if (WebDriverUtils.findElement(driver, editLink) != null
							&& WebDriverUtils.findElement(driver, deleteLinkDE) != null) {
						logger.info("Address {}" + addressValue
								+ "was created with success and actions as Edit and Delete can de done");
			}
		   }
		return checkAddress;
	}

	public void deleteAddressCreatedNo(String addressValue) {
		if (WebDriverUtils.findElement(driver, deleteLink) != null) {

			WebDriverUtils.clickOnElementWithWait(driver, deleteLink);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, cancelButtonDialog);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
			logger.info("Cancel deleting {}" + addressValue + "was done with success");

		} else {

			logger.info("Cancel deleting {}" + addressValue + "was not possible");
		}
	}

	public void deleteAddressCreatedNoDE(String addressValue) {
		if (WebDriverUtils.findElement(driver, deleteLinkDE) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, deleteLinkDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, cancelButtonDialogDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
			logger.info("Cancel deleting {}" + addressValue + "was done with success");

		} else {

			logger.info("Cancel deleting {}" + addressValue + "was not possible");
		}

	}


	public void deleteAddressCreatedYesDE(String addressValue) {
		if (WebDriverUtils.findElement(driver, deleteLinkDE) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, deleteLinkDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, deleteButtonDialogDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
			logger.info("Delete {}" + addressValue + "was done with success");

		} else {

			logger.info("Delete {}" + addressValue + "was not possible");
		}
	}

	public void editAddressCreatedDE(String addressValue) {
		if (WebDriverUtils.findElement(driver, editLink) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, editLink);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
			logger.info("Edit address {}" + addressValue + "was done with success");

		} else {

			logger.info("Edit address {}" + addressValue + "was not possible");
		}
	}


	public void makeDefaultAddressCreatedDE(String addressValue) {
		if (WebDriverUtils.findElement(driver, makeDefaultLinkDE) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, makeDefaultLinkDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
			logger.info("Make default address {}" + addressValue + "was done with success");

		} else {

			logger.info("Make default {}" + addressValue + "was not possible");
		}
	}

	public void assertMakeDefaultDE(String expectedAddress) {
		String addressLabel = WebDriverUtils.getElementText(driver, addressNickname);
		String substring = "STANDARD | ";
		String makeDefault = substring + addressLabel;
		assertEquals(makeDefault, expectedAddress, "Address made as default is being displayed");
	}

	
	public void loadMoreAddessesDE() {
		do {
			logger.info("Loading more addresses...");
			WebDriverUtils.scrollMiddlePage(driver, loadMoreButtonDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_60_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, loadMoreButtonDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_60_SECONDS);
		} while (WebDriverUtils.findElement(driver, loadMoreButtonDE) == null);
		while (!WebDriverUtils.isElementDisplayed(driver, addressTextDE)) {
			WebDriverUtils.scrollUp(driver, addressTextDE);
		}
	}

	public void addAddress() {
		logger.info("Adding new address...");
		WebDriverUtils.scrolltoElement(driver, AddAddressButton);
		WebDriverUtils.clickOnElementWithWait(driver, AddAddressButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
	}

	public AddAddressesPage returnAddAddresses() {
		WebDriverUtils.clickOnElementWithWait(driver, addressesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddAddressesPage(driver);
	}

	public AddAddressesPage returnAddressesEdit() {
		WebDriverUtils.clickOnElementWithWait(driver, editLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddAddressesPage(driver);
	}
}
