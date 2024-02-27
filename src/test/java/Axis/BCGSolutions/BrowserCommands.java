package Axis.BCGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("Webdriver.edge.driver",
				"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\edgeedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//get URL
		
		driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

		
		//get page title
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		//get currentURL
		
		String cururl = driver.getCurrentUrl();
		
		System.out.println(cururl);
		
		//get page source code
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		//close ()
		
		driver.close();

	}

}
