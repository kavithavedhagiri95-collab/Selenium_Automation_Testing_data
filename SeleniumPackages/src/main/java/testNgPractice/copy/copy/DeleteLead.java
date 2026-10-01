package testNgPractice.copy.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class DeleteLead extends SeleniumTestNGBaseClass{

	@Test
	public void deleteLead()throws InterruptedException{
		
		getDriver().findElement(By.linkText("Find Leads")).click();
		getDriver().findElement(By.xpath("//span[text()='Phone']")).click();
		getDriver().findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		getDriver().findElement(By.linkText("Delete")).click();
		getDriver().findElement(By.linkText("Find Leads")).click();
		getDriver().findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = getDriver().findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
}
}






