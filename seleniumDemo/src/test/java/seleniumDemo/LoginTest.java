package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import utils.loginDataProvider;

public class LoginTest extends BaseClass {

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void usingExcell(String username, String password) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.credentials(username, password);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(loginPage.getBankOperationsText()));

		boolean displayed = loginPage.getBankOperationsText().isDisplayed();

		Assert.assertTrue(displayed, "Bank Operations text is not displayed");
	}

	@Test
	public void adminLogin() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		System.out.println("Admin Login Successful");
	}

	@Test
	public void customerLoginS() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.customerLogin("ananya@sahyogbank.in", "customer123");

		System.out.println("Customer Login Successful");
	}

	@Test
	public void credentialsF() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.failedLogin("puru@123.in", "puru123");

		System.out.println("Invalid Login Failed");
	}

	@Test
	public void overViewStats() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.getOverViewStats();

		System.out.println("Overview Stats displayed");
	}

	@Test
	public void accountsCustomers() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.accountsSection();

		System.out.println("All Customers shown in Admin Accounts Section");
	}

	@Test
	public void transactionsLedger() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.transactionsLedger();

		System.out.println("Transactions Ledger displays all transactions");
	}

	@Test
	public void approveLoan() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.approvalsSection();

		System.out.println("Loan Approved");
	}

	@Test
	public void decline() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.decline();

		System.out.println("Loan Declined");
	}

	@Test
	public void creditSection() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.customerLogin("ananya@sahyogbank.in", "customer123");

		loginPage.creditSection();

		System.out.println("Credit Section Displayed");
	}

	@Test
	public void logOut() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.getLogOutButton().click();

		System.out.println("Logout Successful");
	}

	@Test
	public void overViewSection() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.customerLogin("ananya@sahyogbank.in", "customer123");

		loginPage.getOverView();

		System.out.println("Overview Displays Correct Balance");
	}
}