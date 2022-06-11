package academy;
import java.io.IOException;
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
import pageobjects.Mywishlistpageobject;
import pageobjects.Myloginpage;
import resources.base;
public class ValidatePinCode extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @BeforeTest
	 public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url1"));
		}
	 @Test
		
		public void MyWishlistpincode() throws IOException
		{
			//one is inheritance
			// creating object to that class and invoke methods of it
	
	 Mywishlistpageobject M= new Mywishlistpageobject(driver);
 	M.getEmail().sendKeys("hsrakshith37@gmail.com");
		 M.getPassword().sendKeys("Error@12345");
	 M.getLogin().click();
	 M.getModifyWishlist().click();
	 M.getImage().click();
	 M.getpincode().sendKeys("572201");
	 Assert.assertTrue(M.getcheck().isDisplayed());
	 log.info("check button is  not displayed");
	 System.out.println("Test completed");
    Assert.assertTrue(false);
	 
		}
		@AfterTest
		public void teardown()
		{
			
			driver.close();
			driver=null;
			
		}
}
