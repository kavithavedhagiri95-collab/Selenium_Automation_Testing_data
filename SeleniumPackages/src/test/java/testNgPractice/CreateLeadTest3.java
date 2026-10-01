package testNgPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadTest3 {
	
//	@DataProvider(/* indices = {1, 2}, */ parallel = !true)
//	public String[][] getData() {
//		String[][] data = new String[2][2];
//		data[0][0] = "Kavitha";
//		data[0][1] = "V";
//		
//		data[1][0] = "Devesh";
//		data[1][1] = "M";
//		return data;
//	}

//  @Test(dataProvider = "login")
	
//	@Test(dataProvider = "getData",dataProviderClass = DataUtility.class)
	@Test(dataProvider = "getExcelData",dataProviderClass = DataUtil.class)
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
