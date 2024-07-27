package ui;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWithDropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");
		Thread.sleep(1000);
	    driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
	    Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("vasavi0805@gmail.com");
		Thread.sleep(1500);
		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select = new Select(ddown);
		String First = select.getFirstSelectedOption().getText();
		System.out.println(First);
		select.selectByVisibleText("1 - 10 employees");
		Thread.sleep(1500);
		select.selectByIndex(5);
		Thread.sleep(1500);
		List <WebElement> Options = select.getOptions();
		
		for(int i=0; i<Options.size(); i++) {
			System.out.println("Alll the Options Present in the ddown are:" + Options.get(i).getText());
		}
		System.out.println(Options);
		
		Thread.sleep(1500);
		driver.quit();
	}

}
