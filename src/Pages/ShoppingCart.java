package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {

	private static String url = null;
	private static String title = null;
	private static WebElement item = null;
	private static WebElement item1 = null;
	private static WebElement item2 = null;
	private static WebElement item3 = null;
	private static WebElement item4 = null;
	private static WebElement checkout = null;
	private static String numberOfItems = null;

	public static String currentURL(WebDriver driver) {
		url = driver.getCurrentUrl();
		return url;
	}

	public static String pageTitle(WebDriver driver) {
		title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		return title;
	}

	public static WebElement itemName(WebDriver driver) {
		item = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
		return item;
	}	
	
	public static WebElement itemName1(WebDriver driver) {
		item1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		return item1;
	}	
	
	public static WebElement itemName2(WebDriver driver) {
		item2 = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
		return item2;
	}	
	
	public static WebElement itemName3(WebDriver driver) {
		item3 = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
		return item3;
	}	
	
	public static WebElement itemName4(WebDriver driver) {
		item4 = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
		return item4;
	}	
	
	public static WebElement checkout(WebDriver driver) {
		checkout = driver.findElement(By.cssSelector("#checkout"));
		return checkout;
	}	
	
	public static String numberOfItems(WebDriver driver) {
		numberOfItems = driver.findElement(By.cssSelector("span[class='shopping_cart_badge']")).getText();
		return numberOfItems;
	}	
}
