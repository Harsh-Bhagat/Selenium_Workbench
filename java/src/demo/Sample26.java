package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample26 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("xyzabc@zxc.com");
        driver.findElement(By.id("Password")).sendKeys("Abcd@1234");
        driver.findElement(By.className("login-button")).click();
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		WebElement dp = driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		Select s = new Select(dp);
		s.selectByVisibleText("Name: A to Z");
		WebElement dp2 = driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		Select s1 = new Select(dp2);
		s1.selectByVisibleText("12");
		driver.findElement(By.xpath("//div[1]/div[1]/div[2]/h2/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-5\"]")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr/td[1]/input[@name='removefromcart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[1]/div[1]/input[@name='updatecart']")).click();

		driver.quit();
	}

}
