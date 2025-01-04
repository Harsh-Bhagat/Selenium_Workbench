import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample11 {

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/");
		Thread.sleep(1000);
		
		
		//for searching Chikkamagaluru
		driver.findElement(By.xpath("//input[@id='searchboxinput']")).click();
		driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("Chikkamagaluru, karnataka");
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(2000);
		
		//click on directions
		//driver.findElement(By.xpath("//span[@class='Cw1rxd google-symbols NhBTye G47vBd']")).click();
		//Thread.sleep(2000);
		
		//click on starting point
		driver.findElement(By.xpath("//div[@id='sb_ifc50']")).click();
		driver.findElement(By.xpath("//div[@id='directions-searchbox-0']")).sendKeys("Kolkata");
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
