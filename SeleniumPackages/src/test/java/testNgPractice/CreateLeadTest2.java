package testNgPractice;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*Because:

@DataProvider method
and @Test method

are inside the same class.

So TestNG automatically finds the provider method.

🔷 When dataProviderClass Is Required

When @DataProvider is in another class.
*/

public class CreateLeadTest2 {
	@DataProvider(name = "loginData")
	
//	public Object[][] getData(){
//		return new Object[][] {
//			{"Hari","R"},
//			{"Devesh","M"},
//			{"Kavitha","V"},
//		};
//	}
	
  @Test(dataProvider = "loginData",dataProviderClass = DataUtility.class)
  public void createLeadTest(String uName,String lName) {
	  ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(uName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
}
