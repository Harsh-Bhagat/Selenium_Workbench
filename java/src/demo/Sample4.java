package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 
{

	public static void main(String[] args)throws Exception{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	        driver.get("https://demowebshop.tricentis.com");
	        //Thread.sleep(2000);
	        driver.findElement(By.className("ico-register")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("gender-male")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("FirstName")).sendKeys("Abc");
	        Thread.sleep(1000);
	        driver.findElement(By.id("LastName")).sendKeys("Xyz");
	        Thread.sleep(1000);
	        driver.findElement(By.id("Email")).sendKeys("xyzabc@zxc.com");
	        Thread.sleep(1000);
	        driver.findElement(By.id("Password")).sendKeys("Abcd@1234");
	        Thread.sleep(1000);
	        driver.findElement(By.id("ConfirmPassword")).sendKeys("Abcd@1234");
	        Thread.sleep(1000);
	        driver.findElement(By.id("register-button")).click();
	        Thread.sleep(2000);
	        /*driver.findElement(By.className("ico-login")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("Email")).sendKeys("xyzabc@zxc.com");
	        Thread.sleep(1000);
	        driver.findElement(By.id("Password")).sendKeys("Abcd@1234");
	        Thread.sleep(1000);
	        driver.findElement(By.className("login-button")).click();
	        //Thread.sleep(2000);
	        //driver.findElement(By.className("")).click();
	        //Thread.sleep(2000);
	        Thread.sleep(5000);*/
	        driver.quit();
	}

}