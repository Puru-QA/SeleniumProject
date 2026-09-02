package seleniumDemo;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import utils.loginDataProvider;

public class LoginTest extends BaseClass {

	Properties prop;

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void usingExcell(String username, String password) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.credentials(username, password);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(loginPage.getBankOperationsText()));

		boolean displayed = loginPage.getBankOperationsText().isDisplayed();

		Assert.assertTrue(displayed, "Bank Operations text is not displayed");

	}

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void adminLogin(String adminLogin, String adminPassWord) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");
		System.out.println("Admin Login Successfull");
		
	}

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void customerLoginS(String customerUsrNanme, String customerPassWrd) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.customerLogin("ananya@sahyogbank.in", "customer123");

		System.out.println("Customer Login Successfull");
		
	}

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void credentialsF(String userNameF, String passWordF) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.failedLogin("puru@123.in", "puru123");

		System.out.println("Invalid Login Failed");
		
	}

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void overViewStats(String adminLogin, String adminPassWord) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.getOverViewStats();

		System.out.println("Admin Login Successfull");
		
	}

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void accountsCustomers(String adminLogin, String adminPassWord) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.accountsSection();

		System.out.println("All Customers shown in Admin Accounts Section");
		
	}

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void transactionsLedger(String adminLogin, String adminPassWord) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.transactionsLedger();

		System.out.println("Transactions Ledger Displays all transactions");
		
	}

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void approveLoan(String adminLogin, String adminPassWord) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.approvalsSection();

		System.out.println("Loan Approved");

	}

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void decline(String adminLogin, String adminPassWord) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.decline();

		System.out.println("Loan Declined");

	}

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void creditSection(String customerUsrNanme, String customerPassWrd) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.customerLogin("ananya@sahyogbank.in", "customer123");

		loginPage.creditSection();

		System.out.println("Credit Section Displayed");

	}

	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void logOut(String adminLogin, String adminPassWord) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.adminLogin("admin@sahyogbank.in", "admin123");

		loginPage.getLogOutButton();

		System.out.println("LogOut Successfull");

	}
	
	@Test(dataProvider = "loginData", dataProviderClass = loginDataProvider.class)
	public void overViewSection(String customerUsrNanme, String customerPassWrd) {
		
		LoginPage loginPage = new LoginPage(driver);

		loginPage.customerLogin("ananya@sahyogbank.in", "customer123");
		
		loginPage.getOverView();
		
		System.out.println("OverView Displays Correct Balance");
		
		
	}

}