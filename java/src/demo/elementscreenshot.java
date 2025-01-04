package demo;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Generic.Generic_OpenBrowser;
import Generic.generic_screenshot;

public class elementscreenshot {

	public static void main(String[] args)throws Exception {
		WebDriver driver=Generic_OpenBrowser.Open_chrome();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("xyzabc@zxc.com");
        driver.findElement(By.id("Password")).sendKeys("Abcd@1234");
        driver.findElement(By.className("login-button")).click();
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		int i=0;
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='item-box']"));
		for(WebElement element:all) {
			i++;
			try {
			WebElement ele = element.findElement(By.xpath(".//input[@value='Add to cart']"));
			boolean disp = ele.isDisplayed();
			if(disp) {
				System.out.println("Element "+i+" is present");
			}
			}catch(NoSuchElementException e) {
				System.out.println("Element "+i+" is absent");
				Thread.sleep(1000);
				generic_screenshot.sc_of_element(element);
				System.out.println("--ScreenShot Taken");
			}
		}
		driver.close();
	}

}
