package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSlider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		WebElement frames = driver.findElement(By.xpath("//*[@id=\'content\']/iframe"));
		driver.switchTo().frame(frames);
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\'slider\']/span"));
		action.dragAndDropBy(slider, 50, 0).perform();
		Thread.sleep(2000);
		
		
		
		
	}

}
