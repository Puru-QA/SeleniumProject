package seleniumDemo;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class gmailTest extends BaseClass {

	@Test
	public void validate() {

		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.clickUseButton();
		pageLogin.clickLoginButton();
		
		DashBoardPage dashboardpage = new DashBoardPage(driver);
		WebElement ActualName = dashboardpage.getValidateName();
		WebElement ActualAmount = dashboardpage.getValidateAmount();
		
		
		Assert.assertEquals(ActualName, "Ananya Rao");
		Assert.assertEquals(ActualAmount, "- ₹5,000");

		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(ActualName, "Ananya Rao");

		boolean condition = false;
		softAssert.assertTrue(condition);

		softAssert.assertAll();
		/*
		 * public void gMail() throws InterruptedException {
		 * 
		 * 
		 * WebElement useButton =
		 * driver.findElement(By.xpath("(//button[contains(text(),'Use')])[1]"));
		 * useButton.click(); WebElement loginButton =
		 * driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		 * loginButton.click(); WebElement customers =
		 * driver.findElement(By.xpath("//button[contains(text(),'Customers')]"));
		 * customers.click(); WebElement creditCards =
		 * driver.findElement(By.xpath("//button[contains(text(),\"Credit Cards\")]"));
		 * creditCards.click(); WebElement blockCard =
		 * driver.findElement(By.xpath("(//button[contains(text(),'Block card')])[1]"));
		 * blockCard.click(); WebElement logOut =
		 * driver.findElement(By.xpath("//button[contains(text(),\"Log out\")]"));
		 * logOut.click();
		 * 
		 * 
		 * PageLogin pageLogin = new PageLogin(driver); //
		 * pageLogin.loginGmail("daadhya28@gmail.com", "Aadhya22!");
		 * 
		 * 
		 * pageLogin.clickUseButton(); pageLogin.clickLoginButton();
		 * pageLogin.clickCustomers(); pageLogin.clickCreditCards();
		 * pageLogin.clickBlockCard(); pageLogin.clickLogOut();
		 * 
		 * pageLogin.clickUseButton2(); pageLogin.clickLoginButton2();
		 * pageLogin.clickCreditCard2(); pageLogin.clickPayBill();
		 * pageLogin.clickTransferNowButton(); pageLogin.clickMobileRecharge();
		 */

	}
}
