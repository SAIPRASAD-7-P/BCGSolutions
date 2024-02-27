package Axis.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClicks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver",
	    "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
			     
	    WebDriver driver = new ChromeDriver();
							        
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
						 
		driver.manage().window().maximize();
		//Thread.sleep(500);
		
	    WebElement ButtonClick1 = driver.findElement(By.xpath("//span[@id='button1']"));
	    //WebElement ButtonClick2 = driver.findElement(By.xpath("//span[@id='button2']"));
	    //WebElement ButtonClick3 = driver.findElement(By.xpath("//span[@id='button3']"));
	    
	  
	    ButtonClick1.click();
	    Thread.sleep(500);
	    
	    WebElement ButtonClick2 = driver.findElement(By.xpath("//span[@id='button2']"));
	    ButtonClick2.click();
	    Thread.sleep(500);
	    
	    WebElement ButtonClick3 = driver.findElement(By.xpath("//span[@id='button3']"));
	    ButtonClick3.click();
	    Thread.sleep(500);
	   }
}
