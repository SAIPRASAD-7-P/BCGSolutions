package Axis.PracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver",
	    "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
				
        WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		
		driver.manage().window().maximize();
		//Thread.sleep(500);
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		
		WebElement todoInput = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
		todoInput.sendKeys("Buy things");
		todoInput.sendKeys(Keys.ENTER);
		
		
		WebElement todoInput1 = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
		todoInput1.sendKeys("Buy fruits");
		todoInput1.sendKeys(Keys.ENTER);
		
		WebElement clickitem = driver.findElement(By.xpath("//li[normalize-space()='Buy fruits']"));
		clickitem.click();
		
		WebElement addedItem = driver.findElement(By.xpath("//li[normaize-space()='Buy things']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(addedItem).perform();
		
		WebElement deleteButton = driver.findElement(By.xpath("//li[normalize-space()='Buy things']//span"));
		deleteButton.click();
		
		
		
		//driver.quit();
		//WebElement Buynew = driver.findElement(By.xpath("//input[@type='text']"));
		//WebElement Practice = driver.findElement(By.xpath("//input[@type='text']"));

	}

}
