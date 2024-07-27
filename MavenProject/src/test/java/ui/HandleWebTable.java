package ui;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		
		//Get no.of columns
		List<WebElement> Rows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		System.out.println(Rows.size());
		int rs = Rows.size();
		Thread.sleep(2000);
		
		//Get no. of Columns
		List<WebElement> Columns = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));
		System.out.println(Columns.size());
		int cs = Columns.size();
		Thread.sleep(2000);
		
		//Print Elements present in Table
		for(int i=2; i<= rs; i++) {
			for(int j=1; j<= cs; j++) {
				System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText() + '\t' + '\t');
	
			}
			System.out.println();
		}
		
		driver.quit();
	}
}
	
