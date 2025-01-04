package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample18 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("8340232891");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Harsh@3161");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Reels']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Share']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Search']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("niranjan_ka_18");


	}

}
