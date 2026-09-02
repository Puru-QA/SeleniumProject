package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCardPage {

	WebDriver driver;

	public CreditCardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/button[5]")
	private WebElement creditCards;

	/*
	 * @FindBy(xpath = "//button[@class='btn-gold']") private WebElement payBill;
	 * 
	 * @FindBy(xpath = "//input[@id='cardPayAmount']") private WebElement
	 * amountToPay;
	 */
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[6]/button")
	private WebElement blockCard;

	public WebElement getCreditCards() {
		return creditCards;
	}

	public void clickCreditCards() {
		creditCards.click();
	}
	
	public WebElement getBlockCard() {
		return blockCard;
	}
	
	public void clickBlockCard() {
		blockCard.click();
	}

	/*
	 * public WebElement getPayBill() { return payBill; }
	 * 
	 * public void clickPayBill() { payBill.click(); }
	 * 
	 * public WebElement getAmountToPay() { return amountToPay; }
	 * 
	 * public void enterAmount(String amount) { amountToPay.sendKeys(amount); }
	 */
}