package Axis.PracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
	     System.setProperty("Webdriver.chrome.driver",
	     "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
					        
		 driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
	     driver.manage().window().maximize();
	     Thread.sleep(500);		

	 	  WebElement JS = driver.findElement(By.xpath("//span[@type='button']"));
			
		  JS.click();
			
		  //Thread.sleep(500);
			
		  Alert alti = driver.switchTo().alert();
		  alti.accept();
		  
		  Thread.sleep(600);
			
	}

}
