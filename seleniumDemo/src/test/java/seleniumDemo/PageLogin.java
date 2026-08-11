package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLogin extends BaseClass {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	/*
	 * public PageLogin() { this.driver = driver; PageFactory.initElements(driver,
	 * this);
	 * 
	 * }
	 */

	@FindBy(xpath = "(//button[contains(text(),'Use')])[1]")
	private WebElement useButton;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement loginButton;

	@FindBy(xpath = "//button[contains(text(),'Customers')]")
	private WebElement customersTab;

	@FindBy(xpath = "//button[contains(text(),'Credit Cards')]")
	private WebElement creditCards;

	@FindBy(xpath = "(//button[contains(text(),'Block card')])[1]")
	private WebElement blockCard;

	@FindBy(xpath = "//button[contains(text(),'Log out')]")
	private WebElement logOut;

	@FindBy(xpath = "//button[@data-demo='c1']")
	private WebElement useButton2;

	@FindBy(xpath = "//button[@class = 'btn-primary']")
	private WebElement loginButton2;

	@FindBy(xpath = "//button[@data-tab='card']")
	private WebElement creditCard2;

	@FindBy(xpath = "//button[@class='btn-gold']")
	private WebElement payBill;

	@FindBy(xpath = "//input[@id='cardPayAmount']")
	private WebElement amountToPay;

	@FindBy(xpath = "//input[@id='toAccount']")
	private WebElement receipantAcntNmbr;

	@FindBy(xpath = "//input[@id='txAmount']")
	private WebElement txAmount;

	@FindBy(xpath = "//input[@id='txRemarks']")
	private WebElement txRemarks;

	@FindBy(xpath = "//button[contains(text(),'Transfer now')]")
	private WebElement transferNow;

	@FindBy(xpath = "//button[@class='nav-item active']")
	private WebElement mobileRecharge;

	WebElement dropdown = driver.findElement(By.xpath("//select[@id='rcOperator']"));

	Select select = new Select(dropdown);

	/* select.selectByVisibleText("Jio"); */

	public PageLogin(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public WebElement getUseButton() {
		return useButton;
	}

	public void clickUseButton() {
		useButton.click();
	}

	public WebElement getloginButton() {
		return loginButton;
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public WebElement getCustomers() {
		return customersTab;
	}

	public void clickCustomers() {
		customersTab.click();
	}

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

	public WebElement getLogOut() {
		return logOut;
	}

	public void clickLogOut() {
		logOut.click();
	}

	public WebElement getUseButton2() {
		return useButton2;
	}

	public void clickUseButton2() {
		useButton2.click();
	}

	public WebElement getloginButton2() {
		return loginButton2;
	}

	public void clickLoginButton2() {
		loginButton2.click();
	}

	public WebElement getCreditCard2() {
		return creditCard2;
	}

	public void clickCreditCard2() {
		creditCard2.click();
	}

	public WebElement getAmountToPay() {
		return amountToPay;
	}

	public void setAmountToPay() {
		amountToPay.sendKeys("10000");
	}

	public WebElement getPayBill() {
		return payBill;
	}

	public void clickPayBill() {
		payBill.click();
	}

	public WebElement getReceipantAcntNmbr() {
		return receipantAcntNmbr;
	}

	public void setReceipantAcntNmbr() {
		receipantAcntNmbr.sendKeys("50100234561234");
	}

	public WebElement getTxAmount() {
		return txAmount;
	}

	public void setTxAmount() {
		txAmount.sendKeys("1000");
	}

	public WebElement getTxRemarks() {
		return txRemarks;
	}

	public void setTxRemarks() {
		txRemarks.sendKeys("Rent");
	}

	public WebElement getTransferNow() {
		return transferNow;
	}

	public void clickTransferNowButton() {
		transferNow.click();
	}

	public WebElement getMobileRecharge() {
		return mobileRecharge;
	}

	public void clickMobileRecharge() {
		mobileRecharge.click();
	}

	/*
	 * @FindBy(xpath = "//div[contains(text(),\"Email or phone\")]") private
	 * WebElement emailField;
	 * 
	 * public WebElement getTextEmail() { return emailField; }
	 * 
	 * public void setEmail(String Email) { emailField.sendKeys(Email); }
	 * 
	 * @FindBy(xpath = "//span[contains(text(),\"Next\")]") WebElement nextButton;
	 * 
	 * public WebElement getNextButton() { return nextButton; }
	 * 
	 * public void NextButton() { nextButton.click(); }
	 * 
	 * @FindBy(xpath = "//div[contains(text(), \"Enter your password\")]")
	 * WebElement passWord;
	 * 
	 * public WebElement getPassWord() { return passWord; }
	 * 
	 * public void setPassWord(String PassWord) { passWord.sendKeys(PassWord);
	 * 
	 * }
	 * 
	 * @FindBy(xpath = "//div[@class='Cp']/descendant::td[@id=':3v']") WebElement
	 * checkBox;
	 * 
	 * public WebElement getCheckBox() { return checkBox; }
	 * 
	 * public void CheckBox() { checkBox.click(); }
	 * 
	 * @FindBy(xpath = "//span[@id=\":li\"]") WebElement moreLables;
	 * 
	 * public WebElement getMoreLabels() { return moreLables; }
	 * 
	 * public void MoreLabels() { moreLables.click(); }
	 * 
	 * @FindBy(xpath = "//div[@class=\"aAu arN\" and @jsname=\"dlrqf\"]") WebElement
	 * createLable;
	 * 
	 * public WebElement getCreateLable() { return createLable; }
	 * 
	 * public void CreateLable() { createLable.click(); }
	 * 
	 * @FindBy(xpath = "//input[@class=\"qdOxv-K0-wGMbrd\" and @jsname=\"YPqjbf\"]")
	 * WebElement newLable;
	 * 
	 * public WebElement getNewLable() { return newLable; }
	 * 
	 * public void setNewLable() { newLable.sendKeys("Puru"); }
	 * 
	 * @FindBy(xpath =
	 * "//div[@class=\"aAy aKe-aLe J-KU-KO\" and @aria-label=\"Social\"]")
	 * WebElement socialTab;
	 * 
	 * public WebElement getSocialTab() { return socialTab; }
	 * 
	 * public void setSocialTab() { socialTab.click(); }
	 * 
	 * public void loginGmail(String Email, String PassWord) throws
	 * InterruptedException { Thread.sleep(5000);
	 * 
	 * emailField.sendKeys(Email); WebDriverUtilities webUtils = new
	 * WebDriverUtilities(); webUtils.expectedConditionClick(nextButton);
	 * Thread.sleep(5000); passWord.sendKeys(PassWord); Thread.sleep(5000);
	 * webUtils.mouseHover(checkBox); webUtils.switchToFrame(checkBox);
	 * webUtils.dragAnddrop(createLable, checkBox); webUtils.doubleClick(checkBox);
	 * webUtils.rightClick(checkBox); Select select = new Select(checkBox);
	 * select.selectByValue(PassWord); select.selectByVisibleText(PassWord);
	 */
}
