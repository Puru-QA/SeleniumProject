package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class BaseClass {

	ConfigReader configReader;

	protected WebDriver driver;

	protected WebDriverWait wait;
	
	 private static ThreadLocal<WebDriver> driver1 =
	            new ThreadLocal<>();

	    public WebDriver getDriver() {
	        return driver1.get();
	    }

	@BeforeMethod(alwaysRun = true)
	public void browserSetUp() throws InterruptedException {

		configReader = new ConfigReader();

		String url = configReader.getUrl();

		String browser = configReader.getBrowser();

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();

		driver.get(url);

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
