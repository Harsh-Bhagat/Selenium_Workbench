package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

public class videofullscreen {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://www.youtube.com");
            driver.findElement(By.cssSelector("input[id='search']")).sendKeys("aaj ki raat");
            driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement video = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")));
            video.click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("video")));
            WebElement fullscreenButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ytp-fullscreen-button")));
            fullscreenButton.click();

            
            Thread.sleep(5000); 
       
    }
}
