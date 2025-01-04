package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generic_OpenBrowser {
	public static WebDriver driver;
	public static WebDriver Open_chrome() {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		}
	public static WebDriver Open_firefox() {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		driver=new FirefoxDriver();
		return driver;
		}
}