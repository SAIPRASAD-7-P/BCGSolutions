package Axis.PracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClick{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver",
	    "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
				
        WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//WebElement doubleClickele = driver.findElement(By.xpath("//div[@id='double-click']"));
		
		Actions builder = new Actions(driver);
		
		WebElement doubleClickele = driver.findElement(By.xpath("//div[@id='double-click']"));

		builder.doubleClick(doubleClickele).perform();
		
		//builder.Actions(doubleClickele).perform();
		
		//Actions actions = new Actions();
		//WebElement elementLocator = driver.findElement(By.id("ID"));
		//actions.contextClick(elementLocator).perform();
		
		//Thread.sleep(500);
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
	}
}