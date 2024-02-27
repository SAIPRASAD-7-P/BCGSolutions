package Axis.BCGSolutions;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) {
		        // Set the path to the ChromeDriver executable
    //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    

	System.setProperty("Webdriver.chrome.driver",
    "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");

		        // Create a new instance of ChromeDriver
    WebDriver driver = new ChromeDriver();

		        // Maximize the browser window
    driver.manage().window().maximize();

		        // Open the webpage
    driver.get("https://www.makemytrip.com/");

		        // Take screenshot and save it to a file
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	try {
		            // Specify the location where you want to save the screenshot
    FileHandler.copy(screenshotFile, new File("path/to/save/screenshot.png"));
    System.out.println("Screenshot saved successfully!");
    } catch (Exception e) {
   System.out.println("Failed to capture screenshot: " + e.getMessage());
   }
 // Close the browser
	 driver.quit();
		    }
    }

