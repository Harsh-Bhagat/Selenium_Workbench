import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample12 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstName']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Harsh");
		driver.findElement(By.xpath("//input[@id='lastName']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bhagat");
		driver.findElement(By.xpath("//input[@id='userEmail']")).click();
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Xyz@abc.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("8340232891");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='subjectsInput']")).click();
		//driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("manual, Java, Selenium");
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		driver.findElement(By.xpath("//label[text()='Music']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).click();
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Salt Lake , Kolkata");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@id='closeLargeModal']")).click();



	}

}
