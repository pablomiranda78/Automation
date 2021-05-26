package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutComplete {

	private static String message1 = null;
	private static String message2 = null;
	private static String url = null;
	private static String title = null;
	
    //Method to return of the 1st Confirmation Message
	public static String message1(WebDriver driver) {
		message1 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
		return message1;
	}	
	
	//Method to return of the 2nd Confirmation Message
	public static String message2(WebDriver driver) {
		message2 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div")).getText();
		return message2;
	}	
	
	//Method to return the current URL
	public static String currentURL(WebDriver driver) {
		url = driver.getCurrentUrl();
		return url;
	}
	
	//Method to return the Title in the body page
	public static String title(WebDriver driver) {
		title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		return title;
	}
	
}
