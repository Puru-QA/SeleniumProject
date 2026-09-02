package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Customers')]")
	private WebElement customersTab;

	@FindBy(xpath = "//button[contains(text(),'Credit Cards')]")
	private WebElement creditCards;

	@FindBy(xpath = "(//button[contains(text(),'Block card')])[1]")
	private WebElement blockCard;

	@FindBy(xpath = "//button[contains(text(),'Log out')]")
	private WebElement logOut;

	public WebElement getCustomersTab() {
		return customersTab;
	}

	public WebElement getCreditCards() {
		return creditCards;
	}

	public WebElement getBlockCard() {
		return blockCard;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public void setCustomersTab(WebElement customersTab) {
		this.customersTab = customersTab;
	}

	public void setCreditCards(WebElement creditCards) {
		this.creditCards = creditCards;
	}

	public void setBlockCard(WebElement blockCard) {
		this.blockCard = blockCard;
	}

	public void setLogOut(WebElement logOut) {
		this.logOut = logOut;
	}

}
