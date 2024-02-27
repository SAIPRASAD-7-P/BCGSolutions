package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("Webdriver.chrome.driver",
	"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		
    //"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\edgeedriver.exe")
	   
				
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement Date = driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));
		
		Date.click();
		
		WebElement newDate = driver.findElement(By.xpath("//div[@aria-label='Tue Feb 27 2024']"));
				//div[@class='DayPicker-Day'][@aria-label="Tue Feb 27 2024"]
				//+ "//div[@aria-label='Tue Feb 27 2024']"));
				
				
				//span[contains(text(),'Departure')]
				//div[@aria-label='Tue Feb 27 2024']
		
		newDate.click();
		}

	}