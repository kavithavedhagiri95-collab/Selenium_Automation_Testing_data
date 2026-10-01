package testNgPractice.copy.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class EditLead extends SeleniumTestNGBaseClass{

	@Test
	public void editLead() throws InterruptedException {
		getDriver().findElement(By.linkText("Find Leads")).click();
		getDriver().findElement(By.xpath("//span[text()='Phone']")).click();
		getDriver().findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		getDriver().findElement(By.linkText("Edit")).click();
		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		getDriver().findElement(By.name("submitButton")).click();
		
}
}






