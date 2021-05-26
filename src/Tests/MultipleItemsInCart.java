package Tests;
import org.testng.Assert;
import Pages.ProductsPage;
import Pages.ShoppingCart;

public class MultipleItemsInCart extends LoginValidUser{
	
	public static void main(String[] args)  {
	//Calling the Login User Class	
    LoginValidUser.main(args);
    
    //Validate we are on the right page and Title
	Assert.assertEquals(ProductsPage.currentURL(driver), "https://www.saucedemo.com/inventory.html");
	Assert.assertEquals(ProductsPage.pageTitle(driver), "PRODUCTS");
	
	//Selection of Items to be added to the Shopping Cart
	ProductsPage.specificItem(driver).click();
	ProductsPage.specificItem2(driver).click();
	ProductsPage.specificItem3(driver).click();
	ProductsPage.specificItem4(driver).click();

	//Click in Shopping Cart icon to review the list of items selected
	ProductsPage.shoppingCart(driver).click();
	
	//Confirm the number of selected Items
	Assert.assertEquals(ShoppingCart.numberOfItems(driver), "4");
	
	//Confirm the number of Items selected in the previous step.
	Assert.assertEquals(ShoppingCart.itemName1(driver).getText(), "Sauce Labs Backpack");
	Assert.assertEquals(ShoppingCart.itemName2(driver).getText(), "Sauce Labs Bike Light");
	Assert.assertEquals(ShoppingCart.itemName3(driver).getText(), "Sauce Labs Bolt T-Shirt");
	Assert.assertEquals(ShoppingCart.itemName4(driver).getText(), "Sauce Labs Onesie");

   }
}