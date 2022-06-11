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
import pageobjects.Editmyinformation;
import resources.base;
public class Validateeditinformation extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	
	 public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url1"));
		}
	@Test
	
	
	public void editinformation() throws IOException {
		//one is inheritance
				// creating object to that class and invoke methods of it
			 Editmyinformation e=new Editmyinformation(driver);
			 
		     
		     e.getEmail().sendKeys("rakshithhs16@gmail.com");
			 e.getPassword().sendKeys("Error@12345");
			 e.getLogin().click();
			 e.geteditinformation().click();
			 e.getLastname().sendKeys("BR");
		    e.getTelephone().sendKeys("9448871016");
		    e.getContinue().click();
	}
	@AfterTest
	public void teardown()
	{
		    
		    driver.close();
			driver=null; 
		 
			 
				 
			 }
	 
	
		}


	 
	 

