package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Myloginpage {
	public WebDriver driver;
	By Email= By.xpath("//input[@id='input-email']");
	By password=By.xpath("//input[@id='input-password']");
	By login=By.xpath("//body/div[@id='wrapper']/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/input[1]");
	public Myloginpage(WebDriver driver) {
		this.driver=driver;
		}
	public WebElement getEmail() {
		return driver.findElement(Email);
		}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLogin() {
		return driver.findElement(login);
	}

}
