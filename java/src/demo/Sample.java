package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Hello !!");
		String key = "webdriver.gecko.driver";
		String value = "./software/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		driver.close();
	}

}


/* System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
WebDriver driver = new FirefoxDriver(); */