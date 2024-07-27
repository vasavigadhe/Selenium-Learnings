package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		Thread.sleep(1500);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(1000);
//		driver.switchTo().alert().sendKeys("Hello");
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
		Alert HandleAlert = driver.switchTo().alert();
		System.out.println(HandleAlert.getText());
		HandleAlert.sendKeys("Hello! Friend");
		HandleAlert.accept();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
