
package seleniumDemo;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class xPath extends BaseClass {

	@Test
	public void xpath() throws InterruptedException, AWTException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// driver.findElement(By.xpath("table[@class=\"F cf
		// zt\"]/tbody/tr[7]/td[2]")).click();

		driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys("daadhya28@gmail.com", Keys.ENTER);

	}
}

/*
 * driver.get("https://www.flipkart.com/");
 * driver.get("https://vinothqaacademy.com/multiple-windows/");
 */
// driver.get("https://vinothqaacademy.com/webtable/");

/*
 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 * 
 * WebElement closeButton = wait
 * .until(ExpectedConditions.elementToBeClickable(By.xpath(
 * "//span[@class=\"b3wTlE\"]")));
 * 
 * closeButton.click();
 * 
 * // WebElement closeButton = wait.until(ExpectedConditions.)
 * 
 * WebElement searchBox =
 * driver.findElement(By.xpath("(//input[@class=\"nw1UBF v1zwn25\"])[1]"));
 * 
 * searchBox.sendKeys("Pants");
 * 
 * searchBox.sendKeys(Keys.ENTER);
 * 
 * Actions actions = new Actions(driver);
 * 
 * WebElement menu = driver.findElement( By.
 * xpath("//div[@class=\"xDeJa6 _53gVo\"]/descendant::span[text()=\"Sports, Books & More\"]"
 * ));
 * 
 * actions.moveToElement(menu).perform();
 * 
 * WebElement click = wait.until(ExpectedConditions.elementToBeClickable( By.
 * xpath("//div[@class=\"nCHhUt\"]/descendant::a[@title=\"Vehicle Lubricants\"]"
 * )));
 * 
 * click.click();
 * 
 * WebElement maximumSlider =
 * wait.until(ExpectedConditions.elementToBeClickable( By.
 * xpath("//section[@class=\"XC54e7 vRd1kF\"]/descendant::select[@class=\"hbnjE2\"][2]"
 * )));
 * 
 * Select maxPrice = new Select(maximumSlider);
 * 
 * maxPrice.selectByVisibleText("₹5000");
 */

// driver.findElement(By.xpath("//button[@name=\"newbrowserwindow123\"]")).click();

// String parentWindow = driver.getWindowHandle();

/*
 * Set<String> windows = driver.getWindowHandles();
 * 
 * for( String window:windows) {
 * 
 * System.out.println(window); } }}
 */

/*
 * WebElement cart =
 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
 * "//span[text()=\"Cart\"]")));
 * 
 * cart.click();
 * 
 * Thread.sleep(10000); WebElement login =
 * wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.ol1oIH")
 * ));
 * 
 * login.click();
 */

// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

/*
 * WebElement emailField = wait.until(
 * ExpectedConditions.visibilityOfElementLocated( By.cssSelector("label > span")
 * ) );
 * 
 * emailField.clear(); emailField.sendKeys("daadhya28@gmail.com");
 */

/*
 * Robot robot = new Robot();
 * 
 * robot.keyPress(KeyEvent.VK_ENTER);
 */

//// table[@class="F cf zt"]/tbody/tr[7]/td[2]
/// //table/tbody/tr/td/span[@id=":1ag"]/span
/// //table[@class="F cf zt"]/tbody/tr[3]/td[3]/span[@class="aXw T-KT"]
/// //div[@id="qJTzr"]
/// //span[@class="nU n1"]/a[text()="Spam"]
/// //div[@fdprocessedid="ingij"]
/// //div[@fdprocessedid="gd7w5"]

/*
 * email.sendKeys("daadhya28@gmail.com");
 * 
 * driver.findElement(By.cssSelector("label > span")).sendKeys(
 * "daadhya28@gmail.com");
 * 
 * email.sendKeys("daadhya28@gmail.com");
 * 
 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 * 
 * Actions act = new Actions(driver);
 * 
 * Thread.sleep(10000);
 * 
 * WebElement drag =
 * driver.findElement(By.xpath("//h5[contains(text(), \"High // Tatras 3\")]"));
 * 
 * driver.switchTo().frame(driver.findElement(By.xpath(
 * "//iframe[@class=\"demo-frame\"][1]")));
 * 
 * WebElement drag =
 * driver.findElement(By.cssSelector("#gallery > li:first-child"));
 * 
 * WebElement drop = driver.findElement(By.cssSelector("#trash > h4 > span"));
 * 
 * //act.dragAndDrop(drag, drop).perform(); div[contains(@id, "username")
 * and @type="text"]
 * 
 * driver.switchTo(); driver.switchTo().alert().accept();
 * 
 * driver.switchTo().frame(0);
 * 
 * String s = driver.getWindowHandle();
 * 
 * Set<String> s1 = driver.getWindowHandles();
 * 
 */
