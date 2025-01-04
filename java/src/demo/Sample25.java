package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Generic.Generic_OpenBrowser;

public class Sample25 {

	public static void main(String[] args) {
		WebDriver driver=Generic_OpenBrowser.Open_chrome();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		WebElement dp = driver.findElement(By.id("month"));
		Select s = new Select(dp);
		List<WebElement> all_opt=s.getOptions();
		ArrayList<String> l = new ArrayList<>();
		for(WebElement opt:all_opt)
		{
			String text=opt.getText();
			l.add(text);
		}
		Collections.sort((l), Collections.reverseOrder());
		for(String l1:l)
		{
			System.out.println(l1);
		}

	}

}
