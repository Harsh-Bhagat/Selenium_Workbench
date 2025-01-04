import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wishlist {

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
		driver.findElement(By.id("add-to-wishlist-button-28")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Wishlist")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("removefromcart")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("update-wishlist-button")).click();
		Thread.sleep(4000);
		driver.quit();

	}

}
