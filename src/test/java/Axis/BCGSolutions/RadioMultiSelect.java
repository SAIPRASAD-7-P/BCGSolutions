package Axis.BCGSolutions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioMultiSelect {

	private static WebElement[] allradio;

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("Webdriver.chrome.driver",
		  "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		   
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		  
	      driver.manage().window().maximize();
		
		  List<WebElement> wb = driver.findElements(By.xpath("//input[@name='ageGroup']"));

		  Thread.sleep(1000);
		  
		  for(WebElement wb1 :allradio) {
			  
			  wb1.click();
		
	    }
		
	
	}

}
