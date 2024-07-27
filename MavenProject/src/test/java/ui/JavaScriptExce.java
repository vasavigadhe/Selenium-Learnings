package ui;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExce {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Get the title of the page
		JavascriptExecutor JavaExe = (JavascriptExecutor)driver;
		String Script = "return document.title;";
		String Title = (String) JavaExe.executeScript(Script);
		System.out.println(Title);
		Thread.sleep(2000);
		
		//Switch to Frame
		driver.switchTo().frame("iframeResult");
		
		//Try to click on Try it button using JavaScript Executor
		JavaExe.executeScript("myFunction()");
		Thread.sleep(2000);
		
		//Click on accept button
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		//Highlight on the Try it button with any color
		WebElement element = driver.findElement(By.xpath("/html/body/button"));
		JavaExe.executeScript("arguments[0].style.border='10px solid black'", element);
		Thread.sleep(2000);
		
		//Navigate  to home page
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certify = driver.findElement(By.xpath("//*[text()='Play Game']"));
		JavaExe.executeScript("arguments[0].scrollIntoView(true);", certify);
		Thread.sleep(4000);
		
		driver.quit();
	}
}
	
