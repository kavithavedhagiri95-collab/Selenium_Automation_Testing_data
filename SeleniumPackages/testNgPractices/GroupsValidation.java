package testNgPractice;
import org.testng.annotations.Test;

public class GroupsValidation {
	@Test(groups = {"smoke"})
	public void login() {
		System.out.println("Sucessfully Login");
	}
	@Test(groups = {"sanity","smoke"},dependsOnMethods = "login")
//	@Test(priority = 0,dependsOnMethods = "login")
	public void homePage() {
		System.out.println("HomePage");
	}
	@Test(groups = {"reg"})
//	@Test(priority = 1,dependsOnMethods = "homePage")
	public void dashBoard() {
	   System.out.println("DashBoard");
//	   throw new NoSuchElementException("Element Not There");
	}
	@Test(groups = {"sanity"})
//	@Test(priority = 0,dependsOnMethods = "dashBoard",alwaysRun = true)
	public void statusCheck() {
		System.out.println("Status_Check_Valid");
	}
	@Test(groups = {"smoke"})
//	@Test(priority = 0,dependsOnMethods = "statusCheck")
	public void logout() {
		System.out.println("Sucessfully Logout");
	}
}
