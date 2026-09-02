package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllTransactionsPage {

	WebDriver driver;

	public AllTransactionsPage(WebDriver driver) {
     	this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//button[contains(text(), 'All Transactions')]")
	private WebElement allTransactionsTab;
	
	public WebElement getAllTransactionsTab() {
		return allTransactionsTab;
	}
	
	public void clickAllTransactionsTab() {
		allTransactionsTab.click();
	}

}
