package Axis.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPortal {
		public static void main(String[] args) throws InterruptedException {
		     System.setProperty("Webdriver.chrome.driver",
		     "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		     
			 WebDriver driver = new ChromeDriver();
						        
			 driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
					 
			 driver.manage().window().maximize();
			 //Thread.sleep(500);
			 
		     //WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		     //WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		     //WebElement login = driver.findElement(By.xpath("//button[@id='login-button']"));
			 
			 WebElement username = driver.findElement(By.id("text"));
			 WebElement password = driver.findElement(By.id("password"));
			 WebElement loginButton = driver.findElement(By.id("login-button"));
		     username.sendKeys("webdriver");
		     password.sendKeys("webdriver123");
		     loginButton.click();
		     
		     Thread.sleep(500);
		     //driver.quit();   
		   
	}

}
