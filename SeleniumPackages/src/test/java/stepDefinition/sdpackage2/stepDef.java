package stepDefinition.sdpackage2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef {
	public RemoteWebDriver driver;
	
	@Given("Open the browser")
	public void openTheBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("Load the application url {string}")
	public void loadTheApplicationUrl(String url) {
		driver.get(url);
	}
	@When("User login the appliction with {string} and {string}")
	public void userLoginTheApplictionWithAnd(String uName, String pass) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	    
	}
	@When("Click login button")
	public void clickLoginButton() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	}
	@Then("Login is sucessful")
	public void loginIsSucessful() {
		System.out.println("Login Successfull");
		driver.quit();
	}	
}
