package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebUtilities.WebDriverUtilities;

public class PageLogin extends BaseClass {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	public PageLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//button[contains(text(),'Use')])[1]")
	private WebElement useButton;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement loginButton;

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

	@FindBy(xpath = "//div[contains(text(),\"Email or phone\")]")
	private WebElement emailField;

	public WebElement getTextEmail() {
		return emailField;
	}

	public void setEmail(String Email) {
		emailField.sendKeys(Email);
	}

	@FindBy(xpath = "//span[contains(text(),\"Next\")]")
	WebElement nextButton;

	public WebElement getNextButton() {
		return nextButton;
	}

	public void NextButton() {
		nextButton.click();
	}

	@FindBy(xpath = "//div[contains(text(), \"Enter your password\")]")
	WebElement passWord;

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(String PassWord) {
		passWord.sendKeys(PassWord);

	}

	@FindBy(xpath = "//div[@class='Cp']/descendant::td[@id=':3v']")
	WebElement checkBox;

	public WebElement getCheckBox() {
		return checkBox;
	}

	public void CheckBox() {
		checkBox.click();
	}

	@FindBy(xpath = "//span[@id=\":li\"]")
	WebElement moreLables;

	public WebElement getMoreLabels() {
		return moreLables;
	}

	public void MoreLabels() {
		moreLables.click();
	}

	@FindBy(xpath = "//div[@class=\"aAu arN\" and @jsname=\"dlrqf\"]")
	WebElement createLable;

	public WebElement getCreateLable() {
		return createLable;
	}

	public void CreateLable() {
		createLable.click();
	}

	@FindBy(xpath = "//input[@class=\"qdOxv-K0-wGMbrd\" and @jsname=\"YPqjbf\"]")
	WebElement newLable;

	public WebElement getNewLable() {
		return newLable;
	}

	public void setNewLable() {
		newLable.sendKeys("Puru");
	}

	@FindBy(xpath = "//div[@class=\"aAy aKe-aLe J-KU-KO\" and @aria-label=\"Social\"]")
	WebElement socialTab;

	public WebElement getSocialTab() {
		return socialTab;
	}

	public void setSocialTab() {
		socialTab.click();
	}

	public void loginGmail(String Email, String PassWord) throws InterruptedException {
		Thread.sleep(5000);

		emailField.sendKeys(Email);
		WebDriverUtilities webUtils = new WebDriverUtilities();
		webUtils.expectedConditionClick(nextButton);
		Thread.sleep(5000);
		passWord.sendKeys(PassWord);
		Thread.sleep(5000);
		webUtils.mouseHover(checkBox);
		webUtils.switchToFrame(checkBox);
		webUtils.dragAnddrop(createLable, checkBox);
		webUtils.doubleClick(checkBox);
		webUtils.rightClick(checkBox);
		Select select = new Select(checkBox);
		select.selectByValue(PassWord);
		select.selectByVisibleText(PassWord);

	}
}
