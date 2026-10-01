package testNgPractice.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//@BeforeMethod inside BaseClass never runs
//Because:
//
//LoginTest does NOT extend BaseClass
//TestNG only executes annotations of current test class hierarchy

//Why does static driver still throw NullPointerException without extends?
//
//Because:
//
//static gives shared access only
//TestNG annotations (@BeforeMethod, @BeforeClass) are executed only for participating/inherited test classes
//Without extends, BaseClass lifecycle methods are skipped
//So driver initialization never happens
//Therefore driver remains null

public class CreateLead extends SeleniumTestNGBaseClass{
	
	public CreateLead(WebDriver driver){
		this.driver = driver;
	}
	
    @Test(dataProvider = "getExcelData",dataProviderClass = DataUtility.class)
	public void createLead(String userName,String PassWord)  {
    	driver.findElement(By.linkText("Create Lead")).click();
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(userName);
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(PassWord);
    	driver.findElement(By.name("submitButton")).click();
}
}






