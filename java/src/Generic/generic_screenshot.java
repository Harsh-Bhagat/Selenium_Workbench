package Generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class generic_screenshot {

	static String path = "C:\\Users\\ASUS\\OneDrive\\Desktop\\Defects\\";
	static String format = ".jpeg";
	public static void sc_of_app(WebDriver driver)
	{
		Date d = new Date();
		String s = d.toString();
		String date = s.replace(':','-');
		try
		{
			TakesScreenshot tc = (TakesScreenshot)driver;
			File src = tc.getScreenshotAs(OutputType.FILE);
			File target = new File(path+date+format);
			FileHandler.copy(src,target);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static String path1="C:\\Users\\ASUS\\OneDrive\\Desktop\\Defects\\Element\\";
	static String format1 = ".jpeg";
	public static void sc_of_element(WebElement element)
	{
		Date d1 = new Date();
		String s1 = d1.toString();
		String date1 = s1.replace(':', '-');
		try
		{
			File src1 = element.getScreenshotAs(OutputType.FILE);
			File target = new File(path+date1+format);
			FileHandler.copy(src1,target);
			
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	


}
