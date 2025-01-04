package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

public class Sample16 {

    public static void main(String[] args) throws Exception {
        // Set the path for ChromeDriver (adjust path accordingly)
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        
        // Initialize WebDriver and configure browser window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        
            // Navigate to YouTube
            driver.get("https://www.youtube.com");

            // Search for a video
            driver.findElement(By.cssSelector("input[id='search']")).sendKeys("aaj ki raat");
            driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();

            // Wait for video results to load and click the first video
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement video = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")));
            video.click();

            // Wait for the video to load and play
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("video")));

            // Find the fullscreen button using its CSS selector and click it
            WebElement fullscreenButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ytp-fullscreen-button")));
            fullscreenButton.click();

            // Optionally, you can add a wait to observe fullscreen behavior
            Thread.sleep(5000);  // Wait for 5 seconds in fullscreen

       
    }
}
