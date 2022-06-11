package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Changepassword {
	public WebDriver driver ;
	By Email=By.xpath("//input[@id='input-email']");
	By Password= By.xpath("//input[@id='input-password']");
	By Login= By.xpath("//body/div[@id='wrapper']/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/input[1]");
	By changepassword= By.xpath("//*[@id=\"System_nyHsmShk\"]/align/ul/li[2]/a");
	By password=By.xpath("//input[@id='input-password']");
	By confirmpassword=By.xpath("//input[@id='input-confirm']");
	By Continue=By.xpath("//body/div[@id='wrapper']/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]");

	public Changepassword(WebDriver driver) {
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
	public WebElement changepassword() {
		return driver.findElement(changepassword);
	}
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement getconfirmpassword() {
		return driver.findElement(confirmpassword);
	}
	public WebElement getContinue() {
		return driver.findElement(Continue);
	}
}
