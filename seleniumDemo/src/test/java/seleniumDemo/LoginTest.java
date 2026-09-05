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

	@Test(groups = "smoke")
	public void adminLogin() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		System.out.println("Admin Login Successful");
	}

	@Test(groups = "regression")
	public void customerLoginS() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.customerLogin("ananya@sahyogbank.in", "customer123");

		System.out.println("Customer Login Successful");
	}

	@Test(groups = "smoke")
	public void credentialsF() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.failedLogin("puru@123.in", "puru123");

		System.out.println("Invalid Login Failed");
	}

	@Test(groups = "regression")
	public void overViewStats() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.getOverViewStats();

		System.out.println("Overview Stats displayed");
	}

	@Test(groups = {"smoke", "regression"})
	public void accountsCustomers() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.accountsSection();

		System.out.println("All Customers shown in Admin Accounts Section");
	}

	@Test(groups = "smoke")
	public void transactionsLedger() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.transactionsLedger();

		System.out.println("Transactions Ledger displays all transactions");
	}

	@Test(groups = "regression")
	public void approveLoan() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.approvalsSection();

		System.out.println("Loan Approved");
	}

	@Test(groups = "regression")
	public void decline() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.decline();

		System.out.println("Loan Declined");
	}

	@Test(groups = "smoke")
	public void creditSection() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.customerLogin("ananya@sahyogbank.in", "customer123");

		loginPage.creditSection();

		System.out.println("Credit Section Displayed");
	}

	@Test(groups = "regression")
	public void logOut() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.getLogOutButton().click();

		System.out.println("Logout Successful");
	}

	@Test(groups = "regression")
	public void overViewSection() {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.customerLogin("ananya@sahyogbank.in", "customer123");

		loginPage.getOverView();

		System.out.println("Overview Displays Correct Balance");
	}
}