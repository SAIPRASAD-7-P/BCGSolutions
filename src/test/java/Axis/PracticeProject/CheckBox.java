package Axis.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
		public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("Webdriver.chrome.driver",
		"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
					
	     WebDriver driver = new ChromeDriver();
		 driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			
		 driver.manage().window().maximize();
		 //Thread.sleep(500);
			
	     WebElement Checkboxele1= driver.findElement(By.xpath("//input[@value='option-1']"));
	     WebElement Checkboxele2= driver.findElement(By.xpath("//input[@value='option-2']"));
	     WebElement Checkboxele3= driver.findElement(By.xpath("//input[@value='option-3']"));
	     
	     Checkboxele1.click();
	     Checkboxele2.click();
	     Checkboxele3.click();
	     
	     
		 Thread.sleep(500);

	     driver.quit();
	     
	}

}
