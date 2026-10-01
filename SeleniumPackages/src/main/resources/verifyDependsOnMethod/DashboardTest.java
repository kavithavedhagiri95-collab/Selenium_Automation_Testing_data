package verifyDependsOnMethod;


import org.testng.annotations.Test;

public class DashboardTest {
	@Test(dependsOnMethods = {"verifyDependsOnMethod.LoginTest.login"})
    public void viewDashboard() {
        System.out.println("Dashboard loaded");
    }
}
