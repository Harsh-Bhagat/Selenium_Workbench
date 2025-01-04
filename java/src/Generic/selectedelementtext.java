package Generic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectedelementtext {

	public static void main(String[] args) 
	{
		WebDriver driver=Generic_OpenBrowser.Open_chrome();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("C:\\Users\\ASUS\\OneDrive\\Desktop\\Webpages for Testing\\Test6.html");
		WebElement dp = driver.findElement(By.id("a1")); 
		Select s = new Select(dp);
		s.selectByIndex(0);
		s.selectByValue("7");
		s.selectByVisibleText("Teacher's");
		List<WebElement> all_selected_opt=s.getAllSelectedOptions();
		for(WebElement opt:all_selected_opt)
		{
			if(opt.isSelected())
			System.out.println(opt.getText());
		}


	}

}
