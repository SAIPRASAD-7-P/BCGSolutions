package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {
	private static final WebElement Upload = null;

	//public static WebDriver driver;


	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		Upload.sendKeys("C:\\Users\\HP\\Pictures\\Screenshots");
		
		Thread.sleep(500);
		
		WebElement download = null;
		download.click();
		
		Thread.sleep(500);
	}

}
