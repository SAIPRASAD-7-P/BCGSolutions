package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
             System.setProperty("Webdriver.chrome.driver",
		     "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
				        
			 driver.get("https://the-internet.herokuapp.com/drag_and_drop");
			 driver.manage().window().maximize();
			 
			 Thread.sleep(500);
			 
			 // drag and drop
			 
			 WebElement src = driver.findElement(By.xpath("//div[@id='column-a']"));
			 WebElement dest = driver.findElement(By.xpath("//div[@id='column-b']"));
			 
			 Actions builder = new Actions(driver);
			 builder.dragAndDrop(src, dest).perform();
			 System.out.println("The item dragged and dropped");
	 }			 
}