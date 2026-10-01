package testNgPractice.copy;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import testNgPractice.copy.ThreadLocalCon;

public class SeleniumTestNGBaseClass extends AbstractTestNGCucumberTests{

//	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();
//	public void setDriver(RemoteWebDriver driver) {
//		remoteWebDriver.set(driver);
//	}
//	public  RemoteWebDriver getDriver() {
//		return remoteWebDriver.get();
//	}
	
	
	@BeforeMethod
	@Parameters({"browser","url","userName","passWord"})
	 public void preCondition(String browser,String url,String uName,String passWord) {
		if(browser.equalsIgnoreCase("chrome")) {
			ThreadLocalCon.setDriver(new ChromeDriver());
		}
		else {
			ThreadLocalCon.setDriver(new FirefoxDriver());
			
		}
		
		ThreadLocalCon.getDriver().manage().window().maximize();
		ThreadLocalCon.getDriver().get(url);
		ThreadLocalCon.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ThreadLocalCon.getDriver().findElement(By.id("username")).sendKeys(uName);
		ThreadLocalCon.getDriver().findElement(By.id("password")).sendKeys(passWord);
		ThreadLocalCon.getDriver().findElement(By.className("decorativeSubmit")).click();
		ThreadLocalCon.getDriver().findElement(By.linkText("CRM/SFA")).click();
		ThreadLocalCon.getDriver().findElement(By.linkText("Leads")).click();
		
	}
	@AfterMethod
	public void postCondition() {
		ThreadLocalCon.getDriver().quit();
	}

}
