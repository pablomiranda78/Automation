package Tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.Config;
import Pages.SauceDemoLogin;

public class LoginInvalidUser{
	
	public static  WebDriver driver = Config.Setup();
	
	public static void main(String[] args) {
	
	//Trying with an Invalid User	
	SauceDemoLogin.username(driver).sendKeys("locked_out_user");
	SauceDemoLogin.password(driver).sendKeys("secret_sauce");
	SauceDemoLogin.login(driver).click();
	
	//Validating the user should remain on the same page
	Assert.assertEquals(SauceDemoLogin.currentURL(driver), "https://www.saucedemo.com/");
	
	//Validating the right Error Message received
	Assert.assertEquals(SauceDemoLogin.error1(driver), "Epic sadface: Sorry, this user has been locked out.");
	driver.close();
	
   }
}
