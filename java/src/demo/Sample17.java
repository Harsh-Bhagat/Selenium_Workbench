package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample17 {

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\Webpages for Testing\\\\Test5.html");
		driver.findElement(By.xpath("//span[contains(text(),'India')]"));
		driver.findElement(By.xpath("//span[contains(@id,'a1')]"));


	}

}
