import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkout {

	public static void main(String[] args){

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
		
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		
		driver.findElement(By.id("add-to-cart-button-28")).click();
		
		driver.findElement(By.linkText("Shopping cart")).click();
		
		driver.findElement(By.id("termsofservice")).click();
		
		driver.findElement(By.id("checkout")).click();
		
		driver.quit();
	}
}
