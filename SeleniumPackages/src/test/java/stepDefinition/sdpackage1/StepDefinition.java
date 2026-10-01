package stepDefinition.sdpackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//ctrl+A,ctrl+i to do intendation

public class StepDefinition {
	public RemoteWebDriver driver;

	@Given("Open the browser")
	public void openTheBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("Load the application url {string}")
	public void loadTheApplicationUrl(String url) {
		driver.get(url);
	}
	@When("Enter userName as {string}")
	public void enterUserNameAs(String uName) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
	}
	@When("Enter passWord as {string}")
	public void enterPassWordAs(String passWord) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passWord);
	}
	@And("Click on login button")
	public void clickOnLoginButton() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	}
	@Then("Login should be success")
	public void loginShouldBeSuccess() {
		System.out.println("Login Successfull");
		driver.quit();
	}
	
	@But("Login should be fail")
	public void loginShouldBeFail() {
		String text =  driver.findElement(By.xpath("//p[contains(text(),'Password incorrect.')]")).getText();
	    System.out.println(text);
	    Assert.assertEquals(text.trim(),"following error occurred during login: Password incorrect.");
	    driver.quit();
	}
}


/*
 * @Given("Enter username as {string} and password as {string}") public void
 * enterCredential(String uName, String pWord) {
 * driver.findElement(By.id("username")).sendKeys(uName);
 * driver.findElement(By.id("password")).sendKeys(pWord); }
 */

