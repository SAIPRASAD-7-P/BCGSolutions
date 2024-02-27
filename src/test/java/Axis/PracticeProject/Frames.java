package Axis.PracticeProject;

//import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames{

	public static void main(String[] args) throws InterruptedException {
	     System.setProperty("Webdriver.chrome.driver",
	     "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
					        
		 driver.get("https://webdriveruniversity.com/IFrame/index.html");
				 
		 driver.manage().window().maximize();
		 Thread.sleep(500);
		 WebElement newFrame = driver.findElement(By.xpath("//iframe=[@id='frame']"));

		 driver.switchTo().frame(newFrame);
		 
		 Thread.sleep(500);
		 //WebElement content = driver.findElement(By.id("frame"));
		 driver.findElement(By.xpath("//*[@id='div-main-nav']/div/ul/li[3]/a")).click();
		}
}
