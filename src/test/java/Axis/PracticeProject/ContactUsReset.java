package Axis.PracticeProject;

//import java.io.File;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsReset {	
		public static void main(String[] args) throws InterruptedException {
		     System.setProperty("Webdriver.chrome.driver",
		     "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		     
			 WebDriver driver = new ChromeDriver();
						        
			 driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
					 
			 driver.manage().window().maximize();
			 //Thread.sleep(500);
			 
		     WebElement first_name = driver.findElement(By.xpath("//input[@name='first_name']"));
		     WebElement last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
		     WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		     WebElement comments = driver.findElement(By.xpath("//textarea[@name='message']"));
		     WebElement ResetButton = driver.findElement(By.xpath("//input[@class='contact_button'][1]"));
		     
		     first_name.sendKeys("Sai");
		     last_name.sendKeys("Prasad");
		     email.sendKeys("prasad@example.com");
		     comments.sendKeys("This is a test message.");

		     ResetButton.click();
		        
		     driver.quit();
	    }
}