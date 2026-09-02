package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login-email")
	private WebElement username;

	@FindBy(id = "login-password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@id=\"admin-overview\"]/div[2]")
	private WebElement overViewStats;

	@FindBy(xpath = "//*[@id=\"sidebar\"]/button[2]")
	private WebElement accountSection;

	@FindBy(xpath = "//*[@id=\"sidebar\"]/button[3]")
	private WebElement transactionsLedger;

	@FindBy(id = "topbar-role")
	private WebElement bankOperationsText;

	@FindBy(xpath = "//*[@id=\"admin-overview\"]/div[3]/div/h3")
	private WebElement recentLedgerText;

	@FindBy(xpath = "//*[@id=\"sidebar\"]/button[4]")
	private WebElement approvalsSection;

	@FindBy(xpath = "//*[@id=\"approval-row-0\"]/td[4]/button[1]")
	private WebElement approvalsButton;

	@FindBy(xpath = "//*[@id=\"approval-row-0\"]/td[4]/button[2]")
	private WebElement declineButton;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/button[3]")
	private WebElement creditSection;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/button[1]")
	private WebElement overView;

	@FindBy(xpath = "//*[@id=\"admin-overview\"]/div[3]/table/tbody/tr[1]/td[4]")
	private WebElement salaryCredited;

	@FindBy(xpath = "//*[@id=\"admin-overview\"]/div[3]/table/tbody/tr[1]/td[2]")
	private WebElement accountNumber;

	@FindBy(id = "logout-btn")
	private WebElement logOutButton;

	public void credentials(String userName, String passWord) {

		username.sendKeys(userName);

		password.sendKeys(passWord);

		loginButton.click();

	}

	public void adminLogin(String adminUserName, String adminPassWord) {

		username.sendKeys(adminUserName);

		password.sendKeys(adminPassWord);

		loginButton.click();
	}

	public void customerLogin(String customerUsrNanme, String customerPassWrd) {

		username.sendKeys(customerUsrNanme);

		password.sendKeys(customerPassWrd);

		loginButton.click();
	}

	public void failedLogin(String userNameF, String passWordF) {

		username.sendKeys(userNameF);

		password.sendKeys(passWordF);

		loginButton.click();
	}

	public void transactionsLedger() {
		transactionsLedger.click();
	}

	public WebElement getOverViewStats() {
		return overViewStats;
	}

	public void accountsSection() {
		accountSection.click();
	}

	public void approvalsSection() {
		approvalsSection.click();
		approvalsButton.click();
	}

	public void decline() {
		approvalsSection.click();
		declineButton.click();
	}
	
	public void creditSection() {
		creditSection.click();
	}
	
	public WebElement getOverView() {
		return overView;
	}
		
	public WebElement getBankOperationsText() {
		return bankOperationsText;
	}

	public WebElement getRecentLedgerText() {
		return recentLedgerText;
	}

	public WebElement getSalaryCredited() {
		return salaryCredited;
	}

	public WebElement getAccountNumber() {
		return accountNumber;
	}

	public void getLogOutButton() {
		logOutButton.click();
	}

}