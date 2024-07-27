package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='From']")).click();
		Thread.sleep(1500);
		WebElement Places = driver.findElement(By.xpath("//*[@placeholder='From']"));
		Thread.sleep(1500);
		Places.sendKeys("Sydney");
		Thread.sleep(1500);
		Places.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1500);
		Places.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Actions Move = new Actions(driver);
		WebElement dri = driver.findElement(By.xpath("//h2[text()='Q - How do I make a flight booking on MakeMyTrip?']"));
		Move.moveToElement(dri);
		Thread.sleep(2000);
		driver.quit();
	}

}
