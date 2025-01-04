package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {

	public static void main(String[] args)throws Exception{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
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
		//driver.findElement(By.id("CountryId")).click();
		//driver.findElement(By.linkText("India")).click();
		//driver.findElement(By.id("StateProvinceId")).click();
		//driver.findElement(By.linkText("India")).click();
		//driver.findElement(By.id("estimate-shipping-button")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(10000);
		driver.quit();

	}

}
