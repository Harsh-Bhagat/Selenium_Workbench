import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample10 {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[name=\"username\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("8340232891");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("Harsh@3161");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector("svg[aria-label='Search']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("niranjan_ka_18");
		driver.findElement(By.cssSelector("span[class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft']")).click();
		
		driver.quit();


	}

}
