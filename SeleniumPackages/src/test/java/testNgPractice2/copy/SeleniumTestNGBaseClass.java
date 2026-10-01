package testNgPractice2.copy;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class SeleniumTestNGBaseClass extends AbstractTestNGCucumberTests{
	
	public static RemoteWebDriver driver;
//	
//	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();
//	public void setDriver(RemoteWebDriver driver) {
//		remoteWebDriver.set(driver);
//	}
//	
//	public  RemoteWebDriver getDriver() {
//		return remoteWebDriver.get();
//	}
//	
	
	@BeforeMethod
	@Parameters({"browser","url","userName","passWord"})
	 public void preCondition(String browser,String url,String uName,String passWord) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
	}
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
