package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

	private static String url = null;
	private static String title = null;
	private static WebElement login_button = null;
	private static WebElement logout_button = null;
	private static WebElement menu_button = null;
	private static WebElement sort = null;
	private static WebElement sortlohi = null;
	private static WebElement sortActive = null;
	private static WebElement shoppingCart = null;
	private static WebElement specItem = null;
	private static WebElement specItem1 = null;
	private static WebElement specItem2 = null;
	private static WebElement specItem3 = null;
	private static WebElement specItem4 = null;
	
	public static String currentURL(WebDriver driver) {
		url = driver.getCurrentUrl();
		return url;
	}

	public static String pageTitle(WebDriver driver) {
		title = driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
		return title;
	}
	
	public static WebElement login(WebDriver driver) {
		login_button = driver.findElement(By.cssSelector("#login-button"));
		return login_button;
	}
	
	public static WebElement logout(WebDriver driver) {
		logout_button = driver.findElement(By.cssSelector("#logout_sidebar_link"));
		return logout_button;
	}
	
	public static WebElement menu(WebDriver driver) {
		menu_button = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
		return menu_button;
	}
	
	public static WebElement sort(WebDriver driver) {
		sort = driver.findElement(By.xpath("//*[@class='product_sort_container']"));
		return sort;
	}
	
	public static WebElement sortPrice(WebDriver driver) {
		sortlohi = driver.findElement(By.xpath("//*[@value='lohi']"));
		return sortlohi;
	}
	
	public static WebElement sortActive(WebDriver driver) {
		sortActive = driver.findElement(By.xpath("//*[@class='active_option']"));
		return sortActive;
	}
	
	public static WebElement shoppingCart(WebDriver driver) {
		shoppingCart = driver.findElement(By.cssSelector("#shopping_cart_container"));
		return shoppingCart;
	}
	
	public static WebElement specificItem(WebDriver driver) {
		specItem = driver.findElement(By.cssSelector("button[id*='onesie']"));
		return specItem;
	}
	
	public static WebElement specificItem1(WebDriver driver) {
		specItem1 = driver.findElement(By.cssSelector("button[id*='onesie']"));
		return specItem1;
	}
	
	public static WebElement specificItem2(WebDriver driver) {
		specItem2 = driver.findElement(By.cssSelector("button[id*='bike']"));
		return specItem2;
	}
	
	public static WebElement specificItem3(WebDriver driver) {
		specItem3 = driver.findElement(By.cssSelector("button[id*='bolt']"));
		return specItem3;
	}
	
	public static WebElement specificItem4(WebDriver driver) {
		specItem4 = driver.findElement(By.cssSelector("button[id*='backpack']"));
		return specItem4;
	}
}
