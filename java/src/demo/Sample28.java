package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Generic.Generic_OpenBrowser;

public class Sample28 {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=Generic_OpenBrowser.Open_chrome();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.xpath("//div[.='24']")).click();
		
	}
}