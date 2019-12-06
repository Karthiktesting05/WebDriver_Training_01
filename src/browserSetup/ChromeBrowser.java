package browserSetup;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Initization
		 WebDriver driver;
		
		 //Chrome Setup
		 File file = new File("driver//chromedriver.exe");
		 
		 System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			 
		 driver = new ChromeDriver();
		 
		 //Maximize the browser
		 driver.manage().window().maximize();
			
		 //Passing URL to Browser
		 driver.get("https://www.google.co.in/?gfe_rd=cr&ei=uKtLV4TQL43T8gefnoaABw&gws_rd=ssl");
		
		 //CLose the browser
		 driver.close();
		
		
		
	}

}
