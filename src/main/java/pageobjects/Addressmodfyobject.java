package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addressmodfyobject {
	public WebDriver driver ;
	By Email=By.xpath("//input[@id='input-email']");
	By Password= By.xpath("//input[@id='input-password']");
	By Login= By.xpath("//body/div[@id='wrapper']/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/input[1]");
	By ModifyAddress=By.xpath("//*[@id=\"System_nyHsmShk\"]/align/ul/li[3]/a");
	By edit=By.xpath("//*[@id=\"System_s3bhXNDb\"]/div[1]/table/tbody/tr[1]/td[2]/a[1]");
	By country=By.xpath("/html[1]/body[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[8]/div[1]/select[1]/option[107]");
	By Region= By.xpath("/html[1]/body[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[9]/div[1]/select[1]/option[10]");
	By yes= By.xpath("/html[1]/body[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[10]/div[1]/label[1]/input[1]");
	By Continue1= By.xpath("//body/div[@id='wrapper']/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]");
	public Addressmodfyobject(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(Email);
		}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getLogin() {
		return driver.findElement(Login);
	}
	public WebElement getModifyAddress() {
		return driver.findElement(ModifyAddress);
	}
	public WebElement getedit() {
		return driver.findElement(edit);
		
	}
	public WebElement getcountry() {
		return driver.findElement(country);
	}
	public WebElement getRegion() {
		return driver.findElement(Region);
	}
		public WebElement getyes() {
			return driver.findElement(yes);
	}
		public WebElement getContinue() {
			return driver.findElement(Continue1);
		}
	}

