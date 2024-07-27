package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleResize {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement frames = driver.findElement(By.xpath("//*[@id=\'content\']/iframe"));
		driver.switchTo().frame(frames);
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		action.dragAndDropBy(element, 50, 60).perform();
		Thread.sleep(2000);
		
		
		
		
	}

}
