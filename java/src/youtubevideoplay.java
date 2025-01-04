import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubevideoplay {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://www.youtube.com");
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='search']")).click();
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("11k");
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
		//ChromeDriver fullscreenButton = (ChromeDriver) new WebDriver(driver,5);


        //((WebElement) fullscreenButton).click();
	

		//driver.quit();
		
	}

}
