package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {
	public static String browser = "chrome";    //External Configuration xls,csv etc.
	public static WebDriver driver;
	public static void main(String[] args) {
	
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}else if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
		
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		driver.close();	
//		WebElement password = driver.findElement(By.id("password"));
//		driver.findElement(withTagName("input").below(password)).click();
//		driver.findElement(withTagName("input").above(password)).click();
		WebElement password = driver.findElement(By.linkText("Downloads"));
//    	driver.findElement(withTagName("a").toRightOf(password)).click();
//		driver.findElement(withTagName("a").toLeftOf(password)).click();
    	driver.findElement(withTagName("a").near(password)).click();
    			
	}

}
