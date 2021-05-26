package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInformation {

	private static WebElement firstName = null;
	private static WebElement lastName = null;
	private static WebElement postalCode = null;
	private static WebElement continueButton = null;
	private static String url = null;
	private static String title = null;
	
	public static WebElement firstName(WebDriver driver) {
		firstName = driver.findElement(By.id("first-name"));
		return firstName;
	}
	
	public static WebElement lastName(WebDriver driver) {
		lastName = driver.findElement(By.id("last-name"));
		return lastName;
	}
	
	public static WebElement postalCode(WebDriver driver) {
		postalCode = driver.findElement(By.id("postal-code"));
		return postalCode;
	}
	
	public static WebElement continueButton(WebDriver driver) {
		continueButton = driver.findElement(By.cssSelector("#continue"));
		return continueButton;
	}
	
	public static String currentURL(WebDriver driver) {
		url = driver.getCurrentUrl();
		return url;
	}
	
	public static String title(WebDriver driver) {
		title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		return title;
	}
}
