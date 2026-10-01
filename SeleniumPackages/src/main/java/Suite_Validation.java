import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suite_Validation {
	  @BeforeSuite
	   public void launchBrowser() {
		  System.out.println("Before_Suite");
	  }
	  @BeforeTest
	   public void launchUrl() {
		  System.out.println("Before_Test");
	  }
	  @BeforeClass
	    public void maxiMizePage() {
		  System.out.println("Before_Class");
	  }
	  @BeforeMethod
	    public void timeOutMethod() {
		  System.out.println("Before_Method");
		 
	  }
      @Test
       public void login() {
    	  System.out.println("Successfully Login");
    	  System.out.println("Test1");
      }
      @Test
       public void login1() {
   	    System.out.println("Successfully Login");
   	    System.out.println("Test2");
     }
      
      @AfterMethod
       public void dashBoard() {
    	  System.out.println("After_Method");
      }
      @AfterClass
       public void verifyData() {
    	  System.out.println("After_Class");
      }
      @AfterTest
       public void enterValues() {
    	  System.out.println("After_Test");
      }
      @AfterSuite
       public void tearDown() {
    	  System.out.println("After_Suite");
      }
}
