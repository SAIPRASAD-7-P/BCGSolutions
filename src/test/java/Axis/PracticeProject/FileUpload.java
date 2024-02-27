package Axis.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	//@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver",
		"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement Upload = driver.findElement(By.xpath("//input[@id='myFile']"));
		Upload.sendKeys("C:\\Users\\HP\\Documents\\Manipal\\Screenshot_20230922_183934.png");
		
		//Thread.sleep(500);
		
		//driver.quit();		
	}
}