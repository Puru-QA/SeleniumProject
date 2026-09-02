package seleniumDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.DashBoardPage;
import Pages.LoginPage;

public class DashBoardTest extends BaseClass {

    @Test
    public void dashboardTest() {
    	
    	LoginPage loginPage = new LoginPage(driver);

		/*
		 * loginPage.clickUseButton();
		 * 
		 * loginPage.clickLoginButton();
		 */

        DashBoardPage dashboard = new DashBoardPage(driver);

        // Verify Customers tab is displayed
        Assert.assertTrue(
                dashboard.getCustomersTab().isDisplayed(),
                "Customers tab is not displayed"
        );

        // Click Customers tab
        dashboard.getCustomersTab().click();

        // Verify Credit Cards button
        Assert.assertTrue(
                dashboard.getCreditCards().isDisplayed(),
                "Credit Cards button is not displayed"
        );

        // Click Credit Cards
        dashboard.getCreditCards().click();

        // Verify Block Card button
        Assert.assertTrue(
                dashboard.getBlockCard().isDisplayed(),
                "Block Card button is not displayed"
        );

        // Click Block Card
        dashboard.getBlockCard().click();

        // Verify Logout button
        Assert.assertTrue(
                dashboard.getLogOut().isDisplayed(),
                "Logout button is not displayed"
        );

        // Click Logout
        dashboard.getLogOut().click();
    }
}