package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class DashBoardPage extends BaseClass {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'- ₹5,000')]")
	private WebElement validateAmount;
	
	@FindBy(xpath = "(//b[contains(text(),'Ananya Rao')])[1]")
	private WebElement validateName;

	public WebElement getValidateAmount() {
		return validateAmount;
	}

	public WebElement getValidateName() {
		return validateName;
	}
}
