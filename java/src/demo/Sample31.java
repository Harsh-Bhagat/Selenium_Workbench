package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Generic.Generic_OpenBrowser;

public class Sample31 {

	public static void main(String[] args) 
	{
		
		WebDriver driver=Generic_OpenBrowser.Open_chrome();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//a[text()='Men']")).click();

	}

}
