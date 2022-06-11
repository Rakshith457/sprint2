package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerpage {
	public WebDriver driver ;
By Registerbutton= By.xpath("//button[text()='Register']");
By FirstName=By.id("input-firstname");
By LastName=By.id("input-lastname");
By Email=By.id("input-email");
By Telephone=By.id("input-telephone");
By Address1=By.id("input-address-1");
By Address2=By.id("input-address-2");
By City=By.id("input-city");
By Postcode=By.id("input-postcode");

By Country=By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/form/fieldset[2]/div[6]/div/select");

By Regionstate=By.xpath("//*[@id=\"input-zone\"]/option[16]");
By passowrd=By.xpath("//*[@id=\"input-password\"]");
By confirmpassword=By.id("input-confirm");
By yes=By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/form/fieldset[4]/div/div/label[1]");
By no=By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/form/fieldset[4]/div/div/label[2]");
By IhavereadandagreetothePrivacyPolicy=By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/form/div/div[1]/label/input");
By Continue=By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/form/div/div[2]/input");
public Registerpage(WebDriver driver) {
	this.driver=driver;
}

public WebElement getRegisterbutton() {
	return driver.findElement(Registerbutton) ;
}
public WebElement getFirstName() {
	return driver.findElement(FirstName);
}
public WebElement getLastName() {
	return driver.findElement(LastName) ;
}
public WebElement getEmail() {
	return driver.findElement(Email) ;
}
public WebElement getTelephone() {
	return driver.findElement(Telephone) ;
}
public WebElement getAddress1() {
	return driver.findElement(Address1) ;
}
public WebElement getAddress2() {
	return driver.findElement(Address2) ;
}
public WebElement getCity() {
	return driver.findElement(City);
}
public WebElement getPostcode() {
	return driver.findElement(Postcode) ;
}
public WebElement getCountry() {
	return driver.findElement(Country) ;
}

public WebElement getRegionstate() {
	return driver.findElement(Regionstate) ;
}
public WebElement getpassowrd() {
	return driver.findElement(passowrd) ;
}
public WebElement getconfirmpassword() {
	return driver.findElement(confirmpassword) ;
}
public WebElement getYes() {
	return driver.findElement( yes) ;
}
public WebElement getNo() {
	return driver.findElement(no) ;
}

public WebElement getPrivacyPolicy() {
	return driver.findElement(IhavereadandagreetothePrivacyPolicy);
}

public WebElement getContinue() {
	return driver.findElement(Continue);
}
	

}
