package Axis.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

		public static void main(String[] args) throws InterruptedException {
		     System.setProperty("Webdriver.chrome.driver",
		     "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
						        
			 driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		     driver.manage().window().maximize();
		     
		     WebElement textfield = driver.findElement(By.xpath("//input[@id='myInput']"));
		     textfield.sendKeys("pizza");
		     Thread.sleep(700);
		     
		     
		     WebElement select = driver.findElement(By.xpath("//div[@id='myInputautocomplete-list']//div[1]"));
		     select.click();
		     
		     WebElement submit = driver.findElement(By.xpath("//input[@id='submit-button']"));
		    //  "//input[@id='submit-button']"));
		     submit.click();
	}
}
