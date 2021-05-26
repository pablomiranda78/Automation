package Tests;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import Pages.ProductsPage;
import Pages.SauceDemoLogin;
import Tests.LoginValidUser;

public class Logout extends LoginValidUser{
	
	public static void main(String[] args)  {
	//Calling the Login User Class	
    LoginValidUser.main(args);
    
    //Call the Menu in the Products Page
	ProductsPage.menu(driver).click();
	
	//Setting a wait for 1 sec since it happens that the next command could fail due a delay
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	
	//Perform the Logout
	ProductsPage.logout(driver).click();
	
	//Validate the user is returned back to the main page
	Assert.assertEquals(SauceDemoLogin.currentURL(driver), "https://www.saucedemo.com/");
	driver.close();
   }
}