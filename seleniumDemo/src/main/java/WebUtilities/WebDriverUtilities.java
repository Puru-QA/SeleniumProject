package WebUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.devtools.latest.page.model.Screenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {

	WebDriverWait wait;
	WebDriver driver;
	Actions actions;
	Select select;
	WindowType window;
	Screenshot screenshot;
	

	public void explicitWait(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void expectedConditionClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void switchToFrame(WebElement element) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}

	public void mouseHover(WebElement element) {
		actions.moveToElement(element).perform();
	}

	public void doubleClick(WebElement element) {
		actions.doubleClick(element).perform();
	}

	public void rightClick(WebElement element) {
		actions.contextClick(element).perform();
	}

	public void dragAnddrop(WebElement source, WebElement target) {
		actions.dragAndDrop(source, target).perform();
	}

	private Select getSelect(By locator) {

		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		return new Select(dropdown);
	}

	public void selectByText(By locator, String text) {
		getSelect(locator).selectByVisibleText(text);
	}
	
	public void selectByValue(By locator, String value) {
		getSelect(locator).selectByValue(value);
	}

	public void switchToWindow(String windowHandle) {
		driver.switchTo().window(windowHandle);
	}
}
