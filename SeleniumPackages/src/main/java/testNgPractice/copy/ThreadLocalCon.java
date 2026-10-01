package testNgPractice.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import testNgPractice.copy.SeleniumTestNGBaseClass;

public class ThreadLocalCon extends SeleniumTestNGBaseClass{

	
//    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//    
//    public static void setDriver(WebDriver driverInstance) {
//		driver.set(driverInstance);
//	}
//
//	public static WebDriver getDriver() {
//		return driver.get();
//	}
	
	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();

	
	public static  void setDriver(RemoteWebDriver driverInstance) {
		remoteWebDriver.set(driverInstance);
	}
	
	public static RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
	}

	
    
}
