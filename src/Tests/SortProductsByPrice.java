package Tests;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import Pages.ProductsPage;

public class SortProductsByPrice extends LoginValidUser{
	
	public static void main(String[] args)  {
	//Calling the Login User Class	
    LoginValidUser.main(args);
    
    //Validate we are on the right page and Title
	Assert.assertEquals(ProductsPage.currentURL(driver), "https://www.saucedemo.com/inventory.html");
	Assert.assertEquals(ProductsPage.pageTitle(driver), "PRODUCTS");
	
	//Click in the Dropdown for Sort
	ProductsPage.sort(driver).click();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	
	//Sorting Products by Price Low to High
	ProductsPage.sortPrice(driver).click();
	
	//Validates the current selection is Sorting by Price (Low to High)
	Assert.assertEquals(ProductsPage.sortActive(driver).getText(), "PRICE (LOW TO HIGH)");
   }
}