package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutComplete {

	private static String message1 = null;
	private static String message2 = null;
	private static String url = null;
	private static String title = null;
	

	public static String message1(WebDriver driver) {
		message1 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
		return message1;
	}	
	
	public static String message2(WebDriver driver) {
		message2 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div")).getText();
		return message2;
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
