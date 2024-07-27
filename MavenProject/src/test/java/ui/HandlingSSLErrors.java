package ui;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSSLErrors {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		//Create an object for DesiredCapabilities
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		ChromeOptions COptions = new ChromeOptions();
		COptions.merge(dc);
		ChromeDriver driver = new ChromeDriver(COptions);
		driver.get("https://expired.badssl.com/");
		
		
	}

}
