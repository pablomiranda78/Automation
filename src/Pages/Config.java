package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	//public static  WebDriver driver = new ChromeDriver();
	
	public static WebDriver Setup() {
	// Create Driver Object for Chrome
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse-java-photon-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	//Initial Landing Page
	driver.get("https://www.saucedemo.com/");
	
	return driver;
	}
	
}

