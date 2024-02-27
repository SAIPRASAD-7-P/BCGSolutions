package Axis.BCGSolutions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckMultiSelect {
	
	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("Webdriver.chrome.driver",
	    "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
			
	    driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
			    
	    driver.manage().window().maximize();
			    
		List<WebElement> allcheck = driver.findElements(By.xpath("//div[@class='checkbox']"));
			    
	    Thread.sleep(1000);
			    
	    for(WebElement wb:allcheck) {
	    	wb.click();
	    }
	    Thread.sleep(500);
	    
	    WebElement wb2 = driver.findElement(By.xpath("//input[@type='button']"));
	    
	    if(wb2.isEnabled()){
	    	wb2.click();
	    }
	}
}
