package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class workingWithWebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).clear();
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.name("login-button")).getAttribute("class"));
		System.out.println(driver.findElement(By.name("login-button")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.name("login-button")).getLocation());
		System.out.println(driver.findElement(By.name("login-button")).getSize());
		System.out.println(driver.findElement(By.name("login-button")).getTagName());
		System.out.println(driver.findElement(By.className("login_logo")).getText());
		System.out.println(driver.findElement(By.name("login-button")).isDisplayed());
		System.out.println(driver.findElement(By.name("login-button")).isEnabled());
		System.out.println(driver.findElement(By.name("login-button")).isSelected());
		driver.quit();
	}

}
