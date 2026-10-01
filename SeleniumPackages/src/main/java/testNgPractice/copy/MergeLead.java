package testNgPractice.copy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testNgPractice.copy.SeleniumTestNGBaseClass;



public class MergeLead extends SeleniumTestNGBaseClass{

	@Test
	public void mergeLead() throws InterruptedException {
		ThreadLocalCon.getDriver().findElement(By.linkText("Merge Leads")).click();
		ThreadLocalCon.getDriver().findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = ThreadLocalCon.getDriver().getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		ThreadLocalCon.getDriver().switchTo().window(allhandles.get(1));
		ThreadLocalCon.getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys("gopi");
		ThreadLocalCon.getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String leadID = ThreadLocalCon.getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		ThreadLocalCon.getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		ThreadLocalCon.getDriver().switchTo().window(allhandles.get(0));
		
		ThreadLocalCon.getDriver().findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = ThreadLocalCon.getDriver().getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		ThreadLocalCon.getDriver().switchTo().window(allhandles2.get(1));
		ThreadLocalCon.getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys("babu");
		ThreadLocalCon.getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		ThreadLocalCon.getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		ThreadLocalCon.getDriver().switchTo().window(allhandles2.get(0));
		ThreadLocalCon.getDriver().findElement(By.xpath("//a[text()='Merge']")).click();
		ThreadLocalCon.getDriver().switchTo().alert().accept();
		
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






