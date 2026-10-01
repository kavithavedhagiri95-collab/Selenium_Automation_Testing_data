import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	   @BeforeMethod
	    public void setUp() {
	        WebDriver driver = new ChromeDriver();
	        ThreadLocalConcepts.setDriver(driver);

	        ThreadLocalConcepts.getDriver().manage().window().maximize();
	        ThreadLocalConcepts.getDriver().get("https://example.com");
	        
	        System.out.println("Thread ID: " + Thread.currentThread().getId());
	    }
	   
	   @AfterMethod
	    public void tearDown() {
		   ThreadLocalConcepts.getDriver().quit();
		   ThreadLocalConcepts.unload();
	    }
}
