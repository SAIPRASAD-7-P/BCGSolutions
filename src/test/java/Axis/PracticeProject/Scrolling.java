package Axis.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		
	     System.setProperty("Webdriver.chrome.driver",
	     "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
					        
		 driver.get("https://webdriveruniversity.com/Scrolling/index.html");
	     driver.manage().window().maximize();
	     Thread.sleep(500);
	     
	     JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0 , 800)", "");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0 , -800)", "");
		 Thread.sleep(1000);
		 
		 WebElement scroll=driver.findElement(By.xpath("//div[@id='zone4']"));
		 js.executeScript("arguments[0].scrollIntoView(true);", scroll);
	}

}
	  