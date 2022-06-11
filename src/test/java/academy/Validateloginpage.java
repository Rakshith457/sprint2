package academy;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.Myloginpage;
import resources.base;
public class Validateloginpage extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @BeforeTest
	 public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url1"));
		}
			 
			 
				@Test
				
				public void Myloginpage() throws IOException
				{
					//one is inheritance
					// creating object to that class and invoke methods of it
			 Myloginpage m= new Myloginpage(driver);
			 m.getEmail().sendKeys("rakshithhs16@gmail.com");
			 m.getPassword().sendKeys("Error@12345");
			 
			 m.getLogin().click();
			 
				}
				@AfterTest
				public void teardown()
				{
					
					driver.close();
					driver=null;
					
				}
		}
