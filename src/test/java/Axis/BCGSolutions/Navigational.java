package Axis.BCGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.edge.driver",
		"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\edgeedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//get URL
		
		driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

	    // Navigate back in browser history
		driver.navigate().back();
		 
		Thread.sleep(1000);
		 
		//Navigate forward end in browser history
		 
		driver.navigate().forward();
		 
		Thread.sleep(1000);
		 
		//refresh page
		 
		driver.navigate().refresh();
		 
	    driver.close();
		  

	}

}
