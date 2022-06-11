package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import resources.base;
import pageobjects.Changepassword;

public class ChangepasswordStep extends base {
	@Given("^initilize browser with chrome$")
    public void initilize_browser_with_chrome() throws Throwable {
		driver =initializeDriver();
        throw new PendingException();
    }
	 @And("^navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
		 driver.get(strArg1);
	 
	        throw new PendingException();
	 }
	 @Then("^enter (.+) and (.+)$")
	    public void enter_and(String email, String password) throws Throwable {
		 Changepassword C=new Changepassword(driver);
		 C.getEmail().sendKeys("rakshithhs16@gmail.com");
		 C.getPassword().sendKeys("Error@12345");
		 
	        throw new PendingException();
	    }
	 @And("^click on login$")
	    public void click_on_login() throws Throwable {
		 Changepassword C=new Changepassword(driver);
		 C.getLogin().click();
	        throw new PendingException();
	    }
	 @Then("^Click on Change password$")
	    public void click_on_change_password() throws Throwable {
		 Changepassword C=new Changepassword(driver);
		 
		 C.changepassword().click();
	        throw new PendingException();
	    }
	 @And("^enter (.+) and (.+)$")
	    public void enter(String password, String changepassword) throws Throwable {
		 Changepassword C=new Changepassword(driver);
		 C.getpassword().sendKeys("Error@12345");
		 C.getconfirmpassword().sendKeys("Error@12345");
	        throw new PendingException();
	    }

	    @And("^click on continue$")
	    public void click_on_continue() throws Throwable {
	    	Changepassword C=new Changepassword(driver);
	    	C.getContinue().click();
	        throw new PendingException();
	    }
	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }
	

}
