package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.Generic_OpenBrowser;
import Generic.generic_screenshot;

public class Sample32 {

	public static void main(String[] args) 
	{
		WebDriver driver=Generic_OpenBrowser.Open_chrome();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement send = driver.findElement(By.xpath("//button[@type='submit']"));
		generic_screenshot.sc_of_element(send);
		generic_screenshot.sc_of_app(driver);
		driver.close();
		

	}

}
