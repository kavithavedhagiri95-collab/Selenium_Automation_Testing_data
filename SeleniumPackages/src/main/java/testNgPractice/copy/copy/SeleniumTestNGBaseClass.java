package testNgPractice.copy.copy;

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

	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();
	public void setDriver(RemoteWebDriver driver) {
		remoteWebDriver.set(driver);
	}
	public  RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
	}
	
	
	@BeforeMethod
	@Parameters({"browser","url","userName","passWord"})
	 public void preCondition(String browser,String url,String uName,String passWord) {
		if(browser.equalsIgnoreCase("chrome")) {
			remoteWebDriver.set(new ChromeDriver());
		}
		else {
			remoteWebDriver.set(new FirefoxDriver());
			
		}
		
	    getDriver().manage().window().maximize();
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		getDriver().findElement(By.id("username")).sendKeys(uName);
		getDriver().findElement(By.id("password")).sendKeys(passWord);
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		getDriver().findElement(By.linkText("Leads")).click();
		
	}
	@AfterMethod
	public void postCondition() {
		getDriver().quit();
	}

}
