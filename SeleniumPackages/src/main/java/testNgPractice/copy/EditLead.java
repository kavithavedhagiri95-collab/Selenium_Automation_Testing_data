package testNgPractice.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testNgPractice.copy.SeleniumTestNGBaseClass;



public class EditLead extends SeleniumTestNGBaseClass{

	@Test
	public void editLead() throws InterruptedException {
		ThreadLocalCon.getDriver().findElement(By.linkText("Find Leads")).click();
		ThreadLocalCon.getDriver().findElement(By.xpath("//span[text()='Phone']")).click();
		ThreadLocalCon.getDriver().findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		ThreadLocalCon.getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		ThreadLocalCon.getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		ThreadLocalCon.getDriver().findElement(By.linkText("Edit")).click();
		ThreadLocalCon.getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		ThreadLocalCon.getDriver().findElement(By.name("submitButton")).click();
		
}
}






