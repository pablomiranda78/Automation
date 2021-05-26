package Tests;
import org.testng.Assert;

import Pages.CheckoutComplete;
import Pages.CheckoutInformation;
import Pages.CheckoutOverview;
import Pages.ShoppingCart;
import Tests.AddSpecificItemtoCart;

public class CompleteAPurchase extends LoginValidUser{
	
	public static void main(String[] args)  {
	//Calling the Add Specific item to Cart Class	
    AddSpecificItemtoCart.main(args);
    
    //Checkout with the item selected
    ShoppingCart.checkout(driver).click();
	
    //Validate current URL and Title corresponds to Checkout 1st Step
    Assert.assertEquals(CheckoutInformation.currentURL(driver), "https://www.saucedemo.com/checkout-step-one.html");
    Assert.assertEquals(CheckoutInformation.title(driver), "CHECKOUT: YOUR INFORMATION");
    
    //Input the personal information such as First Name, Last Name and Postal Code
    CheckoutInformation.firstName(driver).sendKeys("Pablo");
    CheckoutInformation.lastName(driver).sendKeys("Miranda");
    CheckoutInformation.postalCode(driver).sendKeys("90210");
    CheckoutInformation.continueButton(driver).click();
    
    //Validate current URL and Title corresponds to Checkout 2nd Step
    Assert.assertEquals(CheckoutOverview.currentURL(driver), "https://www.saucedemo.com/checkout-step-two.html");
    Assert.assertEquals(CheckoutOverview.title(driver), "CHECKOUT: OVERVIEW");
    
    //Confirm the item in the cart is the "Sauce Labs Onesie"
    Assert.assertEquals(CheckoutOverview.itemName(driver).getText(), "Sauce Labs Onesie");
    CheckoutOverview.finishButton(driver).click();
    
    //Validate current URL and Title corresponds to Checkout Complete
    Assert.assertEquals(CheckoutComplete.currentURL(driver), "https://www.saucedemo.com/checkout-complete.html");
    Assert.assertEquals(CheckoutComplete.title(driver), "CHECKOUT: COMPLETE!");
    
    //Validate the Confirmation messages after completing the Purchase
    Assert.assertEquals(CheckoutComplete.message1(driver), "THANK YOU FOR YOUR ORDER");
    Assert.assertEquals(CheckoutComplete.message2(driver), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
    
    //Closing the Browser
    driver.close();    
   }
}