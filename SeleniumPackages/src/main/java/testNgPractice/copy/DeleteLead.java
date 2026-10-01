package testNgPractice.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testNgPractice.copy.SeleniumTestNGBaseClass;



public class DeleteLead extends SeleniumTestNGBaseClass{

	@Test
	public void deleteLead()throws InterruptedException{
		
		ThreadLocalCon.getDriver().findElement(By.linkText("Find Leads")).click();
		ThreadLocalCon.getDriver().findElement(By.xpath("//span[text()='Phone']")).click();
		ThreadLocalCon.getDriver().findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		ThreadLocalCon.getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = ThreadLocalCon.getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		ThreadLocalCon.getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		ThreadLocalCon.getDriver().findElement(By.linkText("Delete")).click();
		ThreadLocalCon.getDriver().findElement(By.linkText("Find Leads")).click();
		ThreadLocalCon.getDriver().findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		ThreadLocalCon.getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = ThreadLocalCon.getDriver().findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
}
}






