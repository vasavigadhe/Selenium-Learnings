package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethosOfWebDriverInterface {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
    	driver.findElement(By.name("password")).sendKeys("secret_sauce");
//    	driver.manage().window().wait(2);
		String Title = driver.getTitle();
		System.out.println(Title);
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		
		List<WebElement> we = driver.findElements(By.className("inventory_item"));
		System.out.println(we);
		
		driver.findElement(By.className("social_facebook")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.sugarcrm.com/au/?utm_source=sugarcrm.com&utm_medium=referral");
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);
		Thread.sleep(5000);
		driver.quit();
		
//		driver.findElement(By.className("home page-template-default page page-id-6 locale-en-au"));
//		driver.findElement(By.xpath("//a[@class='btn btn-link btn-link-white btn-arrow']"));
//		Set<String> WindowHandles = driver.getWindowHandles();
//		System.out.println(WindowHandles);
//		driver.quit();
//		driver.close();
		
	}
}
