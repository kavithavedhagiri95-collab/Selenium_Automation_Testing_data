import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	 @Test
	    public void test1() {
		 ThreadLocalConcepts.getDriver().get("https://example.com/login");
	        System.out.println("Test1 Thread: " + Thread.currentThread().getId());
	    }

	    @Test
	    public void test2() {
	    	ThreadLocalConcepts.getDriver().get("https://example.com/dashboard");
	        System.out.println("Test2 Thread: " + Thread.currentThread().getId());
	    }

}
