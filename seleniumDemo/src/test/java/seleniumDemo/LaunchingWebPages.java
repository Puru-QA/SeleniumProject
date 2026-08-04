/*
 * package seleniumDemoTest;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * import seleniumDemo.BaseClass;
 * 
 * public class LaunchingWebPages {
 * 
 * public void launchingPage() {
 * 
 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 * 
 * WebElement closeButton = wait
 * .until(ExpectedConditions.elementToBeClickable(By.xpath(
 * "//span[@class=\"b3wTlE\"]")));
 * 
 * closeButton.click();
 * 
 * WebElement searchBox =
 * driver.findElement(By.xpath("(//div[text()=\"Furniture\"]"));
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
 * searchBox.click(); } }
 */
package seleniumDemo;

