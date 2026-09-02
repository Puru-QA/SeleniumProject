package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegrationTest extends BaseClass {

	@Test
	public void verifyMoneySentAndReceived() {

		driver.findElement(By.id("login-email")).sendKeys("ananya@sahyogbank.in");

		driver.findElement(By.id("login-password")).sendKeys("customer123");

		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		WebElement sentTransaction = driver.findElement(By.xpath("//td[contains(text(),'Transfer to Vikram Shah')]"));

		Assert.assertTrue(sentTransaction.isDisplayed(), "Transfer to Vikram Shah is not displayed");

		WebElement sentAmount = driver
				.findElement(By.xpath("//td[contains(text(),'Transfer to Vikram Shah')]" + "/following-sibling::td"));

		String sentAmountText = sentAmount.getText();

		System.out.println("Amount sent by Ananya: " + sentAmountText);

		Assert.assertTrue(sentAmountText.contains("5,000"), "₹5000 sent transaction is not displayed");

		driver.findElement(By.id("logout-btn")).click();

		driver.findElement(By.id("login-email")).sendKeys("vikram@sahyogbank.in");

		driver.findElement(By.id("login-password")).sendKeys("customer123");

		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		WebElement receivedTransaction = driver
				.findElement(By.xpath("//td[contains(text(),'Received from Ananya Rao')]"));

		Assert.assertTrue(receivedTransaction.isDisplayed(), "Received from Ananya Rao is not displayed");

		WebElement receivedAmount = driver
				.findElement(By.xpath("//td[contains(text(),'Received from Ananya Rao')]" + "/following-sibling::td"));

		String receivedAmountText = receivedAmount.getText();

		System.out.println("Amount received by Vikram: " + receivedAmountText);

		Assert.assertTrue(receivedAmountText.contains("5,000"), "₹5000 received transaction is not displayed");

		System.out.println("Integration Test Passed: " + "₹5000 sent by Ananya and received by Vikram");
	}
}