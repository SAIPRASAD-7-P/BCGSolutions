package Axis.BCGSolutions;

import java.io.File;
import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotEg {
	
	//private static final String FileUtils = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver",
	    "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f, new File("C:\\Users\\HP\\Documents\\Manipal\\Screenshot.png"));
		
		System.out.println("The screenshot is captured");

	}

}
