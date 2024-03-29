package com.ariat.Pages.Main;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * links with Add a credit card page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class PaymentInformationPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(PaymentInformationPage.class);


	private By addACreditCardButton = By.xpath("//a[contains(text(),'Add a Credit Card')]");
	private By addACreditCardButtonDE = By.xpath("//a[text()='Eine Kreditkarte hinzuf�gen']");
	private By addACreditCardText = By.xpath("//*[contains(text(), 'Add a credit card')]");
	WebElement cardTable = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]"));
	private By creditNickname = By.xpath("//div[@id='paymentinfo']/div[2]/div/div/div/div/div/div/h3/span");
	private By deleteLinkDE = By.xpath("//a[@title='L�schen']");
    private By makeDefaultLinkDE = By.xpath("//a[text()='Als Standard festlegen']");
	private By cancelButtonDialogDE = By.xpath("//span[text()='Abbrechen']");
	private By deleteButtonDialogDE = By.xpath("//span[text()='L�schen']");
	
	
	public PaymentInformationPage(WebDriver driver) {
		super(driver);
	}

	public AddACreditCardPage returnAddACreditCardPage() {
		WebDriverUtils.scroll300(driver, addACreditCardButton);
		WebDriverUtils.clickOnElementWithWait(driver, addACreditCardButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addACreditCardText));
		return new AddACreditCardPage(driver);
	}
	
	
	public AddACreditCardPage returnAddACreditCardPageDE() {
		WebDriverUtils.scroll300(driver, addACreditCardButtonDE);
		WebDriverUtils.clickOnElementWithWait(driver, addACreditCardButtonDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addACreditCardText));
		return new AddACreditCardPage(driver);
	}

	
	public void checkCreditCardDE(String cardowner, String cardType, String expireDate) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) cardTable.findElements(By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == cardowner && cell.getText() == cardType && cell.getText() == expireDate) {
					if (WebDriverUtils.findElement(driver, deleteLinkDE) != null
							&& WebDriverUtils.findElement(driver, makeDefaultLinkDE) != null) {
						logger.info(
								"Credit card with:{}" + cardowner + cardType + expireDate + "was created with success");
					} else {
						logger.info("Credit card with{}" + cardowner + cardType + expireDate + "was not created");
					}

				} else {
					logger.info("Credit card was not found in the list of cards");
				}
			}
		}
	}

	
	public void deleteCreditCardNoDE(String cardowner, String cardType, String expireDate) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) cardTable.findElements(By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == cardowner && cell.getText() == cardType && cell.getText() == expireDate) {
					if (WebDriverUtils.findElement(driver, deleteLinkDE) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, deleteLinkDE);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
						WebDriverUtils.clickOnElementWithWait(driver, cancelButtonDialogDE);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
						logger.info(
								"Credit card with:{}" + cardowner + cardType + expireDate + "was cancelled from deletion");
					} else {
						logger.info("Credit card with{}" + cardowner + cardType + expireDate + "was not cancelled from deletion");
					}

				} else {
					logger.info("Credit card was not found in the list of cards");
				}
			}
		}
	}
	
	public void deleteCreditCardYesDE(String cardowner, String cardType, String expireDate) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) cardTable.findElements(By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == cardowner && cell.getText() == cardType && cell.getText() == expireDate) {
					if (WebDriverUtils.findElement(driver, deleteLinkDE) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, deleteLinkDE);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_20_SECONDS);
						WebDriverUtils.clickOnElementWithWait(driver, deleteButtonDialogDE);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_20_SECONDS);
						logger.info(
								"Credit card with:{}" + cardowner + cardType + expireDate + "was deleted with success");
					} else {
						logger.info("Credit card with{}" + cardowner + cardType + expireDate + "was not deleted");
					}

				} else {
					logger.info("Credit card was not found in the list of cards");
				}
			}
		}
	}

	public void makeDefaultCreditCardDE(String cardowner, String cardType, String expireDate) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) cardTable.findElements(By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == cardowner && cell.getText() == cardType && cell.getText() == expireDate) {
					if (WebDriverUtils.findElement(driver, makeDefaultLinkDE) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, makeDefaultLinkDE);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_20_SECONDS);
						logger.info(
								"Credit card with:{}" + cardowner + cardType + expireDate + "was made default with success");
					} else {
						logger.info("Credit card with{}" + cardowner + cardType + expireDate + "was not made default");
					}

				} else {
					logger.info("Credit card was not found in the list of cards");
				}
			}
		}
	}
	
	public void assertMakeDefaultCreditCardDE(String expectedCreditCard) {
		String creditLabel = WebDriverUtils.getElementText(driver, creditNickname);
		String substring = "STANDARDKARTE | ";
		String makeDefault = substring + creditLabel;
		assertEquals(makeDefault , expectedCreditCard, "Credit card made as default is being displayed");
	}
}
