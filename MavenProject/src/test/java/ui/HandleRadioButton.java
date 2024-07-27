package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleRadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.singaporeair.com/en_UK/in/home#/managebooking");
		Thread.sleep(1000);
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='bookReference']"));
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='eticketNumber']"));
		Thread.sleep(1500);
		radio2.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		Thread.sleep(1500);
		driver.quit();
	}

}
