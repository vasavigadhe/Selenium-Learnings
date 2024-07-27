package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformKeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement SourceArea = driver.findElement(By.xpath("//*[@id=\'dropZone\']/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre/span"));
		action.keyDown(SourceArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement DesArea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[8]/pre/span"));
		action.keyDown(DesArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
