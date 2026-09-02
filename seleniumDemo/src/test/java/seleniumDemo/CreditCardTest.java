/*
 * package seleniumDemo;
 * 
 * import org.testng.Assert; import org.testng.annotations.Test;
 * 
 * import Pages.CreditCardPage; import Pages.LoginPage;
 * 
 * public class CreditCardTest extends BaseClass {
 * 
 * @Test public void creditCardTest() {
 * 
 * LoginPage loginPage = new LoginPage(driver);
 * 
 * loginPage.clickUseButton();
 * 
 * loginPage.clickLoginButton();
 * 
 * CreditCardPage creditCardPage = new CreditCardPage(driver);
 * 
 * // Verify Credit Cards button is displayed
 * Assert.assertTrue(creditCardPage.getCreditCards().isDisplayed(),
 * "Credit Cards button is not displayed");
 * 
 * // Click Credit Cards creditCardPage.clickCreditCards();
 * 
 * // Verify amount field is displayed
 * //Assert.assertTrue(creditCardPage.getAmountToPay().isDisplayed(),
 * "Amount field is not displayed");
 * 
 * // Enter amount //creditCardPage.enterAmount("500");
 * 
 * // Verify Pay Bill button
 * //Assert.assertTrue(creditCardPage.getPayBill().isDisplayed(),
 * "Pay Bill button is not displayed");
 * 
 * // Click Pay Bill //creditCardPage.clickPayBill();
 * 
 * creditCardPage.clickBlockCard(); } }
 */