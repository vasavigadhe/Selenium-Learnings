package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintallLinksofaWebpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(1000);
		List<WebElement> allTags = driver.findElements(By.tagName("a"));
		System.out.println("Total Tags on the page are:" + allTags.size());
		
		for(int i=0; i<allTags.size(); i++) {
			System.out.println("List of Elements that contains links on the webpage are:" + allTags.get(i).getAttribute("href"));
			
			
		}
		driver.quit();
		
	}

}
