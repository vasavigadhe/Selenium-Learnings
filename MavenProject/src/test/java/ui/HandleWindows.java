package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.w3schools.com/jsref/met_win_prompt.asp");
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[text()='Try it Yourself »'])[1]")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> ite = windowhandles.iterator();
		String ParentWindow = ite.next();
		System.out.println(ParentWindow);
		String ChildWindow = ite.next();
		System.out.println(ChildWindow);
		
		driver.switchTo().window(ChildWindow);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello!");
		alert.accept();
		driver.switchTo().window(ParentWindow);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
