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


import pageobjects.Registerpage;
import resources.base;


public class Validateregisterpage extends base {
	 
	 public static Logger log =LogManager.getLogger(base.class.getName());
		
	 @BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 
		}
	 @Test
	 
		public void Registerpage() throws IOException{
			//one is inheritance
			// creating object to that class and invoke methods of it
				 
				 driver.get(prop.getProperty("url"));
				 Registerpage r=new Registerpage(driver);
				 r.getFirstName().sendKeys("Raju");
			    	r.getLastName().sendKeys("B R");
			    	r.getEmail().sendKeys("rakshithhs16@gmail.com");
			    	r.getTelephone().sendKeys("8088774497");
			    	r.getAddress1().sendKeys("Sri chowdeshwari nilaya,no56");
			    	r.getAddress2().sendKeys("basveshwara nagara, banglore");
			    	r.getCity().sendKeys("Banglore");
			    	r.getPostcode().sendKeys("563002");
			    	r.getRegionstate().click();
			    	r.getCountry().click();
			    	r.getpassowrd().sendKeys("Error@12345");
			    	r.getconfirmpassword().sendKeys("Error@12345");
			    	r.getYes().click();
			    	r.getPrivacyPolicy().click();
			    	r.getContinue().click();
			    	
		}
		@AfterTest
		public void teardown()
		{
		
			 driver.close();
				driver=null;
		}
}


		

