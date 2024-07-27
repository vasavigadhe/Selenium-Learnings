package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement fashion = driver.findElement(By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[5]/a"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(fashion).perform();
		
		
		
	}

}
