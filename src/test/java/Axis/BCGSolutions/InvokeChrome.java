package Axis.BCGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome{
	
	public static WebDriver driver;
	public static void main(String[] args) {

				System.setProperty("Webdriver.chrome.driver",
			"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
				
		    //"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\edgeedriver.exe")
			   
						
                WebDriver driver = new ChromeDriver();
				driver.get("https://www.selenium.dev/");
	}

}
