package Tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Pages.SauceDemoLogin;
import Pages.Config;
import Pages.ProductsPage;

public class LoginValidUser{
	
	public static  WebDriver driver = Config.Setup();
	
	
	public static void main(String[] args) {
	
	//input valid User
	SauceDemoLogin.username(driver).sendKeys("standard_user");
	
	//Send password
	SauceDemoLogin.password(driver).sendKeys("secret_sauce");
	SauceDemoLogin.login(driver).click();
	
	//Validate the current URL is the Inventory (PRODUCTS)
	Assert.assertEquals(ProductsPage.currentURL(driver), "https://www.saucedemo.com/inventory.html");
	
	//Validating the Title in the page
	Assert.assertEquals(ProductsPage.pageTitle(driver), "PRODUCTS");
	
   }
}
