package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


import pageobjects.Mywishlistpageobject;
import resources.base;
@RunWith(Cucumber.class)
public class ModifyUrwishlistStep extends base {
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
	    	Mywishlistpageobject M= new Mywishlistpageobject(driver);
	    	M.getEmail().sendKeys("hsrakshith37@gmail.com");
			 M.getPassword().sendKeys("Error@12345");
	        throw new PendingException();
	    }
	
	    @And("^click on login$")
	    public void click_on_login() throws Throwable {
	    	Mywishlistpageobject M= new Mywishlistpageobject(driver);
	    	M.getLogin().click();
	        throw new PendingException();
	        
	    }
	    @Then("^Click on Modify  your wishlist$")
	    public void click_on_modify_your_wishlist() throws Throwable {
	    	Mywishlistpageobject M= new Mywishlistpageobject(driver);
	    	M.getModifyWishlist().click();
	    	
	        throw new PendingException();
	    }
	    @And("^Click on image$")
	    public void click_on_image() throws Throwable {
	    	Mywishlistpageobject M= new Mywishlistpageobject(driver);
	    	M.getImage().click();
	        throw new PendingException();
	    }
	    @And("^select  and enterpincode$")
	    public void select_and_enterpincode() throws Throwable {
	    	Mywishlistpageobject M= new Mywishlistpageobject(driver);
	    	M.getpincode().sendKeys("572201");
	        throw new PendingException();
	    }
	    @And("^verify able to check pin code$")
	    public void verify_able_to_continue() throws Throwable {
	    	Mywishlistpageobject M= new Mywishlistpageobject(driver);
	    	M.getcheck().click();
	    	
	        throw new PendingException();
	    }
	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }

	

}
