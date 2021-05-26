package Tests;
import org.testng.Assert;
import Pages.ProductsPage;
import Pages.ShoppingCart;

public class AddSpecificItemtoCart extends LoginValidUser{
	
	public static void main(String[] args)  {
	//Calling the Login User Class	
    LoginValidUser.main(args);
    
    //Validate we are on the right page and Title
	Assert.assertEquals(ProductsPage.currentURL(driver), "https://www.saucedemo.com/inventory.html");
	Assert.assertEquals(ProductsPage.pageTitle(driver), "PRODUCTS");
	
	//Selecting specific item "Sauce Labs Onesie" to be added to cart
	ProductsPage.specificItem(driver).click();
	
	//Click on the Shopping cart item
	ProductsPage.shoppingCart(driver).click();
	
	//Validate we are now on the Shopping Cart Page and Title
	Assert.assertEquals(ShoppingCart.currentURL(driver), "https://www.saucedemo.com/cart.html");
	Assert.assertEquals(ShoppingCart.pageTitle(driver), "YOUR CART");
	
	//Confirm The item in the Shopping Cart corresponds to the "Sauce Labs Onesie".
	Assert.assertEquals(ShoppingCart.itemName(driver).getText(), "Sauce Labs Onesie");
    
   }
}