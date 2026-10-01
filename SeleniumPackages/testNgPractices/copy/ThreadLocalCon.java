package testNgPractice.copy;

import org.openqa.selenium.WebDriver;

public class ThreadLocalCon extends SeleniumTestNGBaseClass {
	ThreadLocalCon(WebDriver driver){
		this.driver = driver;
	}
	
    private  ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    
    public static void setDriver(WebDriver driverInstance) {
		driver.set(driverInstance);
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	
    
}
