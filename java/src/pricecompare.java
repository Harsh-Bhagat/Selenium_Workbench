import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Generic.Generic_OpenBrowser;

public class pricecompare {

	public static void main(String[] args) {
		WebDriver driver = Generic_OpenBrowser.Open_chrome();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("MICROSOFT Surface Laptop 7",Keys.ENTER);
		WebElement add1 = driver.findElement(By.xpath("//div/a[3]/div[1]/div[@class='Nx9bqj']"));
		String A1=add1.getText();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("MICROSOFT Surface Laptop 7",Keys.ENTER);
		WebElement add2 = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span[1]/span[@class='a-offscreen']"));
		String A2=add2.getText();
		
		double D1 = Integer.valueOf(A1);
		double D2 = Integer.valueOf(A2);
		if(D1<D2)
		{
			System.out.println("Flipkart has lower Price");
		}
		else
		{
			System.out.println("Amazon has lower Price");
		}
		driver.quit();

	}

}
