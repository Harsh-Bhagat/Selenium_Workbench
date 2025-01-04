import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {

	public static void main(String[] args)throws Exception{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click(); 
		//Thread.sleep(3000);
		//driver.findElement(By.id("a2")).sendKeys("RANI420");
		//Thread.sleep(3000);
		//driver.findElement(By.name("n1")).click();
		Thread.sleep(3000);
		//sdriver.quit();
	}

}
