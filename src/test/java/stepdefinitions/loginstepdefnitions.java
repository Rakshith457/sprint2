package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import resources.base;
import pageobjects.Myloginpage;
@RunWith(Cucumber.class)
public class loginstepdefnitions extends base  {

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
    	Myloginpage m= new Myloginpage(driver);
    	m.getEmail().sendKeys("rakshithhs16@gmail.com");
		 m.getPassword().sendKeys("Error@12345");
        throw new PendingException();
    }
    @Then("^Verify that user is succesfully logged in $")
    public void verify_that_user_is_succesfully_logged_in() throws Throwable {
    	Myloginpage m= new Myloginpage(driver);
    	m.getLogin().click();
        throw new PendingException();
    }

    @And("^close browsers$")
    public void close_browsers() throws Throwable {
    	driver.close();
        throw new PendingException();
    }

	

}
