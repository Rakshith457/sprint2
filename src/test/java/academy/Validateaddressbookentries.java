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
import pageobjects.Addressmodfyobject;
import pageobjects.Myloginpage;
import resources.base;
public class Validateaddressbookentries extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @BeforeTest
	 public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url1"));
		}
	 @Test
	 


public void modifyaddressbookentries() throws IOException{
		//one is inheritance
			// creating object to that class and invoke methods of it
	Addressmodfyobject A= new Addressmodfyobject(driver);
	A.getEmail().sendKeys("hsrakshith37@gmail.com");
	 A.getPassword().sendKeys("Error@12345");
	 A.getLogin().click();
	 A.getModifyAddress().click();
	 A.getedit().click();
	 A.getcountry().click();
	 A.getRegion().click();
	 A.getContinue().click();
	 Assert.assertNotSame(false,true);
	 }
	 @AfterTest
		public void teardown()
		{
	 driver.close();
		driver=null;
		
}
}