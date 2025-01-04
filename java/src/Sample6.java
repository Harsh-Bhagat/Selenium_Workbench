import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {

	public static void main(String[] args)throws Exception {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.className("ico-login")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Email")).sendKeys("xyzabc@zxc.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("Abcd@1234");
        Thread.sleep(1000);
        driver.findElement(By.className("login-button")).click();
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button-28")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("removefromcart")).click();
		driver.findElement(By.className("update-carts-button")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
