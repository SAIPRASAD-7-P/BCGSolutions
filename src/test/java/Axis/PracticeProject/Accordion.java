package Axis.PracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordion {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
		"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		driver.manage().window().maximize();
		
        WebElement wb = driver.findElement(By.xpath("//button[@id='manual-testing-accordion']"));
        wb.click();  
        //Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        WebElement we = driver.findElement(By.xpath("//button[@id='cucumber-accordion']"));
        we.click();
        //Thread.sleep(500);

        WebElement wf = driver.findElement(By.xpath("//button[@id='automation-accordion']"));
        wf.click();
        //Thread.sleep(500);
            
        //WebElement wg = driver.findElement(By.xpath("//button[@id='click-accordion']"));
        WebElement wg = driver.findElement(By.cssSelector("#click-accordion"));
         wg.click();
 		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);


     }
}	

