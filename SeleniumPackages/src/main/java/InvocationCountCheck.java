import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class InvocationCountCheck {

	//priority is have low presidency compare to dependsOnMethods different test have same priority it will execute alphabetic order
	//invocationTimeOut works only if we have invocationCount
	//enabled default value is true if we set false it won't consider as a test case
	//if we provide always run and enabled attribute in the same test method enabled get higher presidency
	
	
	
	@Test(threadPoolSize = 2)
//	@Test(description = "This Method used to check login functionality")
//	@Test(invocationCount = 2,invocationTimeOut = 10000)
	public void login() {
		System.out.println("Sucessfully Login");
	}
	@Test(priority = 0,dependsOnMethods = "login")
	public void homePage() {
		System.out.println("HomePage");
	}
	@Test(priority = 1,dependsOnMethods = "homePage")
//	@Test(priority = 1,dependsOnMethods = "homePage",enabled = false,alwaysRun = true)
	public void dashBoard() {
	   System.out.println("DashBoard");
//	   throw new NoSuchElementException("Element Not There");
	}
	@Test(priority = 0,dependsOnMethods = "dashBoard",alwaysRun = true)
	public void statusCheck() {
		System.out.println("Status_Check_Valid");
	}
	@Test(priority = 0,dependsOnMethods = "statusCheck")
	public void logout() {
		System.out.println("Sucessfully Logout");
	}
}
