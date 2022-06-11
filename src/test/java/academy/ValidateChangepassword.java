package academy;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.Changepassword;
import resources.base;

public class ValidateChangepassword  extends base{
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	 public void initialize() throws IOException
		{
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url1"));
		}
	@Test
	
		 public void changepassword() throws IOException{
		//one is inheritance
				// creating object to that class and invoke methods of it
		 Changepassword C= new Changepassword(driver);
		 C.getEmail().sendKeys("rakshithhs16@gmail.com");
		 C.getPassword().sendKeys("Error@12345");
		 C.getLogin().click();
		 C.changepassword().click();
		 C.getpassword().sendKeys("Error@12345");
		 C.getconfirmpassword().sendKeys("Error@12345");
		 C.getContinue().click();
	}
	@AfterTest
	public void teardown()
	{
		 driver.close();
			driver=null; 
		}
	

}
