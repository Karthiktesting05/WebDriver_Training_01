package browserSetup;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		// Used to launch Firefox Driver
		// WebDriver driver = new FirefoxDriver();
		File file = new File("driver//geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		driver = new FirefoxDriver(capabilities);
		 
		//Launching the URL in to the firefox address bar
		driver.get("http://www.seleniumhq.org/download/");
		
		//Get the Title of the page
		String TitleValue = driver.getTitle();
		System.out.println("Title of the page is "+ TitleValue);
		
		// Used to maximize the window
		driver.manage().window().maximize();
		
		driver.navigate().back();
		System.out.println("Navigated back to the page");
		
		driver.navigate().forward();
		System.out.println("Forwared page ");
		
		driver.navigate().refresh();
		System.out.println("Refresh the page");
		
		//Close the driver
		driver.close();
	}
	
}
