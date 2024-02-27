package Axis.BCGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdge{
	
	public static WebDriver driver;
	public static void main(String[] args) {

				System.setProperty("Webdriver.edge.driver",
				"C:\\Users\\HP\\Documents\\Manipal\\edgedriver-win64\\edgeedriver.exe");
				
						
				WebDriver driver = new EdgeDriver();

				driver.get("https://www.selenium.dev/");
	}

}
