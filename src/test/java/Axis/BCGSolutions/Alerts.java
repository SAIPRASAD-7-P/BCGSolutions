package Axis.BCGSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException  {
		
		//System.setProperty("Webdriver.chrome.driver",
	    //"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		
		System.setProperty("Webdriver.edge.driver",
		"C:\\Users\\HP\\Documents\\Manipal\\edgedriver-win64\\edgeedriver.exe");
		
		
		
			        WebDriver driver = new EdgeDriver();
					driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
					
					driver.manage().window().maximize();
					Thread.sleep(500);
					
					WebElement infoalt = driver.findElement(By.xpath("//input[@name='alert']"));
					
					infoalt.click();
					
					Thread.sleep(500);
					
					Alert alti = driver.switchTo().alert();
					
					alti.accept();
					
				// confirmational alerts
					
                   WebElement confoalt = driver.findElement(By.xpath("//input[@name='confirmation']"));
					
					confoalt.click();
					
					Thread.sleep(500);
					
					Alert alt1 = driver.switchTo().alert();
					
					alti.dismiss();
					
					//propmpt alerts
					
                    WebElement promalt = driver.findElement(By.xpath("//input[@name='prompt']"));
					
					promalt.click();
					
					Thread.sleep(500);
					
					Alert alt2 = driver.switchTo().alert();
					
					alt2.accept();		
	}

}
