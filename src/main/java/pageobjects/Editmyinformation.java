package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



	public class Editmyinformation {
		public WebDriver driver ;
		
		By Email=By.xpath("//input[@id='input-email']");
		By Password= By.xpath("//input[@id='input-password']");
		By Login= By.xpath("//body/div[@id='wrapper']/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/input[1]");
		By editinformation= By.xpath("//*[@id=\"System_nyHsmShk\"]/align/ul/li[1]/a");
		By Lastname=By.xpath("//input[@id='input-lastname']");
		By Telephone=By.xpath("//input[@id='input-telephone']");
		By Continue= By.xpath("//body/div[@id='wrapper']/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]");
		By sucessfull=By.xpath("body/div[@id='wrapper']/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
		
	public Editmyinformation(WebDriver driver) {
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
	public WebElement geteditinformation() {
		return driver.findElement(editinformation);
	}
	public WebElement getLastname() {
		return driver.findElement(Lastname);
	}
	public WebElement getTelephone() {
		return driver.findElement(Telephone);
	}
	public WebElement getContinue() {
		return driver.findElement(Continue);
	}
	public WebElement getsucessfull() {
		return driver.findElement(sucessfull);
	}

	}

	
	



