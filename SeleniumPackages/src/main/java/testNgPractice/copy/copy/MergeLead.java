package testNgPractice.copy.copy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class MergeLead extends SeleniumTestNGBaseClass{

	@Test
	public void mergeLead() throws InterruptedException {
		getDriver().findElement(By.linkText("Merge Leads")).click();
		getDriver().findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = getDriver().getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		getDriver().switchTo().window(allhandles.get(1));
		getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys("gopi");
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String leadID = getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		getDriver().switchTo().window(allhandles.get(0));
		
		getDriver().findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = getDriver().getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		getDriver().switchTo().window(allhandles2.get(1));
		getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys("babu");
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		getDriver().switchTo().window(allhandles2.get(0));
		getDriver().findElement(By.xpath("//a[text()='Merge']")).click();
		getDriver().switchTo().alert().accept();
		
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






