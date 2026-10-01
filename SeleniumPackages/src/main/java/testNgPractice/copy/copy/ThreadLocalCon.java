package testNgPractice.copy.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

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

	
	public  void setDriver(RemoteWebDriver driverInstance) {
		remoteWebDriver.set(driverInstance);
	}
	
	public RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
	}

	
    
}
