package handleWebDriverOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

public class HandleLogs {
    public static void main(String [] args) {
    	WebDriverManager.chromedriver().setup();
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.saucedemo.com");
    	
    	Set<String> LogTypes = driver.manage().logs().getAvailableLogTypes();
    	System.out.println("Available log types are:"+ LogTypes);
    	
    	 
    	
    	driver.quit();
    	
    	
    }


        

}