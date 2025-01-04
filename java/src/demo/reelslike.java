package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reelslike {

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(6000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Reels']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Audio is muted']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Like']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Like']")).click();
	
		
		
	

	}

}
/*for (int i = 0; i < 5; i++) 
 { 													// Number of scrolls you want to perform
									// Scroll to the bottom of the page using JavaScript
((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

													// Wait for new content to load
try {
    Thread.sleep(2000); 							// Wait for content to load (adjust as needed)
	} 
catch (InterruptedException e) 
	{
    e.printStackTrace();
	}
}*/
