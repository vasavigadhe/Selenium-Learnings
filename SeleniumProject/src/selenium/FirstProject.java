package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Brower Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com");

	}

}
