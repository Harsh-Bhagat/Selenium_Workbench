import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementloc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\ASUS\\OneDrive\\Desktop\\Webpages for Testing\\Test4.html");
		WebElement en = driver.findElement(By.xpath("//div[1]/Input"));
		Point p = en.getLocation();
		Dimension size = en.getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		System.out.println(p);
		System.out.println(p.getX()+" "+p.getY());

		
				
		driver.quit();
	}

}
