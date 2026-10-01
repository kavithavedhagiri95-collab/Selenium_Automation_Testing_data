package testNgPractice.copy;

import org.testng.annotations.Test;

import testNgPractice.copy.DataUtility;
import testNgPractice.copy.SeleniumTestNGBaseClass;
import testNgPractice.copy.ThreadLocalCon;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
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
	
    @Test(dataProvider = "getExcelData",dataProviderClass = DataUtility.class)
	public void createLead(String userName,String PassWord)  {
    	ThreadLocalCon.getDriver().findElement(By.linkText("Create Lead")).click();
    	ThreadLocalCon.getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
    	ThreadLocalCon.getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(userName);
    	ThreadLocalCon.getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(PassWord);
    	ThreadLocalCon.getDriver().findElement(By.name("submitButton")).click();
    	
}
}






