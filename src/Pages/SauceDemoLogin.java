package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoLogin {

	private static WebElement user = null;
	private static WebElement pass = null;
	private static WebElement login_button = null;
	private static String url = null;
	private static String error1 = null;
	
	public static WebElement username(WebDriver driver) {
		user = driver.findElement(By.name("user-name"));
		return user;
	}
	

	public static WebElement password(WebDriver driver) {
		pass = driver.findElement(By.id("password"));
		return pass;
	}
	
	public static WebElement login(WebDriver driver) {
		login_button = driver.findElement(By.cssSelector("#login-button"));
		return login_button;
	}
	
	public static String currentURL(WebDriver driver) {
		url = driver.getCurrentUrl();
		return url;
	}
	
	public static String error1(WebDriver driver) {
		error1 = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
		return error1;
	}
}
