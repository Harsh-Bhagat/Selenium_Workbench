package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample14 {

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("C:\\Users\\ASUS\\OneDrive\\Desktop\\Webpages for Testing\\Test4.html");
		WebElement username = driver.findElement(By.xpath("//input")); 
		Thread.sleep(2000);
		Boolean en = username.isEnabled();
		Boolean pwd = username.isDisplayed();
		if(en)
		{
			System.out.println("Element is Enabled");
			username.clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[1]/input")).sendKeys("new Username");
			Thread.sleep(1000);
		}
		else
		{
			System.out.println("Element is Disabled");
		}
		Thread.sleep(2000);
		if(pwd)
		{
			System.out.println("Element is present");
			driver.findElement(By.xpath("//div[2]/input")).sendKeys("new password");
			Thread.sleep(1000);
		}
		else
		{
			System.out.println("Element is absent");
		}
		
		//driver.quit();

	}

}
