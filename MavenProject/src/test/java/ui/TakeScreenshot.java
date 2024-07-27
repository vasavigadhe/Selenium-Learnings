package ui;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		Date CurrentDate = new Date();
		System.out.println(CurrentDate);
		String ScreenshotName = CurrentDate.toString().replace(" ", "-").replace(":", "_");
		//Take Screenshot
		File ScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		//Store Screenshots in a file
		FileUtils.copyFile(ScreenshotFile,new File("C://Screenshots/"+ScreenshotName+".png"));
		
		driver.quit();
		
	}

}
