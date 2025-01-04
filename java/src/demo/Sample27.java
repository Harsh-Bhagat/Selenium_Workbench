package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample27 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usernameTextElement = driver.findElement(By.xpath("//div/div[1]/div/div[1]/div/div[2]/div[2]/div/div/p[1]"));
        String usernameText = usernameTextElement.getText();
        String extractedUsername = usernameText.replace("Username :", "").trim();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(extractedUsername);
		 WebElement passwordTextElement = driver.findElement(By.xpath("//div/div[1]/div/div[1]/div/div[2]/div[2]/div/div/p[2]"));
	     String passwordText = passwordTextElement.getText();
	        String extractedPassword = passwordText.replace("Password : ", "").trim();
	        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
	        passwordField.clear();
	        passwordField.sendKeys(extractedPassword);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//div/ul[1]/li[2]/a[@class='oxd-main-menu-item']")).click();
	    driver.findElement(By.xpath("//div/nav/ul[1]/li[3]/a[.='Add Employee']")).click();
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ABC");
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("XYZ");
	    driver.findElement(By.xpath("//button[.=' Save ']")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text from the alert
        String alertText = alert.getText();

        // Print the alert's text
        System.out.println("Alert Text: " + alertText);

        // Accept the alert (You can use alert.dismiss() if you want to dismiss the alert instead)
        alert.accept();

        // Close the browser
        driver.quit();
 
	}

}
