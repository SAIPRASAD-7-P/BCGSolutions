package Axis.PracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
		"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Hidden-Elements/index.html");
		driver.manage().window().maximize();
		
        WebElement wb = driver.findElement(By.xpath("//div[@id='not-displayed']]"));
        wb.click();  
        //Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

	}

}
