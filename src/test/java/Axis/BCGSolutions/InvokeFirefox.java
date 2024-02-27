package Axis.BCGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InvokeFirefox {
	
		public static WebDriver driver;
		public static void main(String[] args) {
			
			System.setProperty("webdriver.firefox.driver",
		    //"C:\\Users\\HP\\Documents\\Manipal\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
			
			"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
							
            WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.selenium.dev/"); //"https://www.selenium.dev/"
		}
}