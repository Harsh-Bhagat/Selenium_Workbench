package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample15
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement ntf = driver.findElement(By.xpath("//div[@id='bar-notification']"));
		Thread.sleep(2000);
		boolean disp=ntf.isDisplayed();
		if(disp)
		{
			System.out.println("Confirmation Message is Displayed");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Shopping cart")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("removefromcart")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("updatecart")).click();
		}
		else
		{
			System.out.println("Confirmation Message is Not Displayed");
			
		}
		Thread.sleep(2000);
		driver.quit();
	}

}