package Axis.BCGSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
public static void main(String[] args) throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver",
			 "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
			
			 WebDriver driver = new ChromeDriver();
			        
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		    driver.manage().window().maximize();
		    
			Thread.sleep(500);
			
			WebElement doubleclickele = driver.findElement(By.xpath("//input[@id='double-click']"));
			
			Actions builder = new Actions(driver);
			builder.doubleClick(doubleclickele).perform();
			
			//Informational alerts
			Thread.sleep(500);
			
			Alert alt = driver.switchTo().alert();
			
			alt.accept();
			// context click, right click
			
			//WebElement contextclickele = driver.findElement(By.xpath("//")))
			
			builder.contextClick(doubleclickele).perform();
	     }

}
