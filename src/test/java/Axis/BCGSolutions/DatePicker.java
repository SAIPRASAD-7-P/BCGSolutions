package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("Webdriver.chrome.driver",
		    "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
					
	        WebDriver driver = new ChromeDriver();
			driver.get("https://webdriveruniversity.com/Datepicker/index.html");
			
			driver.manage().window().maximize();
			Thread.sleep(500);
			
			WebElement Date = driver.findElement(By.xpath("//input[@type='text']"));
			WebElement Date1 = driver.findElement(By.xpath("//input[@class='form-control']"));
			
			Thread.sleep(500);

			Date.click();
			Date1.click();
			
	}
}