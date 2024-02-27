package Axis.PracticeProject;

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
			
			WebElement Date = driver.findElement(By.xpath("//input[@='datapicker']"));
			Date.click();
			Thread.sleep(1000);
			
			WebElement Date1 = driver.findElement(By.xpath("//td[contains(text(),'26')]"));
			Date1.click();
	}
}