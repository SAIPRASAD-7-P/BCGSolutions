package Axis.PracticeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver",
	    "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
				
        WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		
        driver.manage().window().maximize();

	    // Navigate back in browser history
		driver.navigate().forward();
		 
		Thread.sleep(500);
		 
		//Navigate forward end in browser history
		 
		driver.navigate().back();
		 
		Thread.sleep(500);
		 
		//refresh page
		 
		driver.navigate().refresh();
		 
	    driver.close();
	}
	
}
