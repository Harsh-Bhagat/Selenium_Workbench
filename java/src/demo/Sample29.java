package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Generic.Generic_OpenBrowser;

public class Sample29 {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=Generic_OpenBrowser.Open_chrome();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("MICROSOFT Surface Laptop 7",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/a[3]/div[1]/div[@class='Nx9bqj']")).click();
		Set<String> all = driver.getWindowHandles();
		List<String> l = new ArrayList<>(all); 
		String child = l.get(1);
		driver.switchTo().window(child);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2 JTo6b7']")).click();
		driver.close();
		
		

	}

}
