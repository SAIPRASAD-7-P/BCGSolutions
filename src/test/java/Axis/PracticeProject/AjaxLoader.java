package Axis.PracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxLoader {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
	     System.setProperty("Webdriver.chrome.driver",
	     "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
					        
		 driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	     driver.findElement(By.xpath("//span[@type='button']")).click();
	     
	     Alert alt=driver.switchTo().alert();
	     alt.accept();
	     
	     //driver.close();
	     
	     driver.quit();
	     
	}

}
