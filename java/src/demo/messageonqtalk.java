package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class messageonqtalk {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chat.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[autocomplete='username']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("username");
		driver.findElement(By.cssSelector("input[name='password']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Search']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Niranjan L T");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class=\"_chat_conversation__wGPeN\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='message']")).sendKeys("Script done");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='chatSubmitButton']")).click();
		Thread.sleep(10000);
		driver.quit();
	}
}
