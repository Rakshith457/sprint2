package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import resources.base;
import pageobjects.Addressmodfyobject;

@RunWith(Cucumber.class)
public class AddressbookStep extends base {
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
	    	driver =initializeDriver();
	        throw new PendingException();
	    }
	    @And("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	        throw new PendingException();
	    }
	    @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
	    	Addressmodfyobject A= new Addressmodfyobject(driver);
	    	A.getEmail().sendKeys("hsrakshith37@gmail.com");
			 A.getPassword().sendKeys("Error@12345");
	        throw new PendingException();
	    }
	
	    @And("^click on login$")
	    public void click_on_login() throws Throwable {
	    	Addressmodfyobject A= new Addressmodfyobject(driver);
	    	A.getLogin().click();
	        throw new PendingException();
	    }
	    @Then("^Click on Modify adresses book entries$")
	    public void click_on_modify_adresses_book_entries() throws Throwable {
	    	Addressmodfyobject A= new Addressmodfyobject(driver);
	    	A.getModifyAddress().click();
	        throw new PendingException();
	    }

	    @And("^Click on edit$")
	    public void click_on_edit() throws Throwable {
	    	Addressmodfyobject A= new Addressmodfyobject(driver);
	    	A.getedit().click();
	        throw new PendingException();
	    }
	    @And("^select Country$")
	    public void select_country() throws Throwable {
	    	Addressmodfyobject A= new Addressmodfyobject(driver);
	    	A.getcountry().click();
	        throw new PendingException();
	    }
	    @And("^Select Region/State$")
	    public void select_regionstate() throws Throwable {
	    	Addressmodfyobject A= new Addressmodfyobject(driver);
	    	A.getRegion().click();
	    	
	        throw new PendingException();
	    }

	    @And("^click on continue$")
	    public void click_on_continue() throws Throwable {
	    	Addressmodfyobject A= new Addressmodfyobject(driver);
	    	A.getContinue().click();
	        throw new PendingException();
	    }
	
	

}
