package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\'content\']/iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\'draggable\']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\'droppable\']"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
