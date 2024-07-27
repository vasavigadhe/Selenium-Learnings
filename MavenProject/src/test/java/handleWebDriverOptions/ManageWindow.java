package handleWebDriverOptions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com");
	    driver.manage().window().maximize();
	    
	    driver.manage().window().minimize();
	    System.out.println(driver.manage().window().getPosition()); //Position
	    
	    driver.manage().window().fullscreen(); //FullScreen
	    
	    System.out.println(driver.manage().window().getSize()); //Size
	    
	    System.out.println(driver.manage().window().getPosition());
	    
	    Point WindowPosition = new Point(8,8);
	    driver.manage().window().setPosition(WindowPosition); //Set the position x and y coordinates
	    
	    System.out.println(driver.manage().window().getPosition());
	    
	    Dimension WinDim = new Dimension(5,5);
	    driver.manage().window().setSize(WinDim); //set the size height and width
	    System.out.println(driver.manage().window().getSize());
	        
	    Thread.sleep(2000);
	    
	    
	    driver.quit();
	}

}
