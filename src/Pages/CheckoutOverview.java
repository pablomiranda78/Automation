package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverview {

	private static WebElement item = null;
	private static String url = null;
	private static String title = null;
	private static WebElement finishButton = null;
	

	public static WebElement itemName(WebDriver driver) {
		item = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
		return item;
	}	
	
	public static String currentURL(WebDriver driver) {
		url = driver.getCurrentUrl();
		return url;
	}
	
	public static String title(WebDriver driver) {
		title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		return title;
	}
	
	public static WebElement finishButton(WebDriver driver) {
		finishButton = driver.findElement(By.cssSelector("#finish"));
		return finishButton;
	}
}
