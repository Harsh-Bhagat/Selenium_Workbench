package Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample19 {

	public static void main(String[] args)throws InterruptedException{


				WebDriver driver=Generic_OpenBrowser.Open_chrome();
				driver.get("https://www.facebook.com/login/");
				WebElement login=driver.findElement(By.xpath("//input[@type='text']"));
				login.sendKeys("8294744610",Keys.TAB,"Harsh#3161",Keys.ENTER);
				Thread.sleep(1000);
				
				//driver.quit();
			

		}

	}

