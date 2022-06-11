package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mywishlistpageobject {
	public WebDriver driver ;
	By Email=By.xpath("//input[@id='input-email']");
	By Password= By.xpath("//input[@id='input-password']");
	By Login= By.xpath("//body/div[@id='wrapper']/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/input[1]");
By ModifyWishlist=By.xpath("//*[@id=\"System_nyHsmShk\"]/align/ul/li[4]/a");
By Image=By.xpath("//*[@id=\"System_s3bhXNDb\"]/div[1]/table/tbody/tr/td[1]/a/span/span/img");
By pincode=By.xpath("//*[@id=\"OpenCart_EUm7pD2n\"]/div/div[2]/div/div[1]/input");
By check=By.xpath("//*[@id=\"OpenCart_EUm7pD2n\"]/div/div[2]/div/div[1]/div");
public Mywishlistpageobject(WebDriver driver) {
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
public WebElement getModifyWishlist() {
	return driver.findElement(ModifyWishlist);
	
}
public WebElement getImage() {
	return driver.findElement(Image);
}
public WebElement getpincode() {
	return driver.findElement(pincode);
	
}
public WebElement getcheck() {
	return driver.findElement(check);
}
}

