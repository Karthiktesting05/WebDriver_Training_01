package browserSetup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaDriver;

public class FireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. First Create a project along with package & classes.
		// 2. Configure Libraries in to Buildpath.
		// 3. Intization webdriver.
		// 4. Start developing automation scripts.
		
		WebDriver driver;//Initization
		
	    driver = new FirefoxDriver();
	  
		driver.get("https://www.google.co.in/");
		
		driver.close();
		
	}

}
