package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class gmailTest extends BaseClass {


	@Test
	public void gMail() throws InterruptedException {
		
		
		
		/*
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
		 */
		 
		 
		
		PageLogin pageLogin = new PageLogin(driver);
		//pageLogin.loginGmail("daadhya28@gmail.com", "Aadhya22!");
		pageLogin.clickUseButton();
		pageLogin.clickLoginButton();
	}
}
