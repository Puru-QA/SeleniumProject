package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	protected WebDriver driver;
	protected WebDriverWait wait;

	@BeforeMethod
	public void browserSetUp() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("https://accounts.google.com/");
		driver.get("file:///C:/Users/purus/Downloads/sahyog-bank.html");

	}

	@AfterMethod
	public void tearDown() {

	}

}
