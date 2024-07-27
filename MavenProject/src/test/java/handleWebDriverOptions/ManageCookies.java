package handleWebDriverOptions;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageCookies {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com");
		
		//Print the size of cookies
		Set <Cookie> cook= driver.manage().getCookies();
		System.out.println("Size of the cookies: "+ cook.size());
		
		//print each value of cookie
		for(Cookie i:cook) {
			System.out.println(i.getName()+" --> "+i.getValue());
		}
		
		//Get the value of Cookie of particular name
		System.out.println(driver.manage().getCookieNamed("bm_sv"));
		
		//Add new Cookie by passing name and value
		Cookie cookie = new Cookie("MyCookie","1234wdv");
		driver.manage().addCookie(cookie);
		
		//Get the size and print all the values
		Set <Cookie> co = driver.manage().getCookies();
		System.out.println("Size of the cookies: "+ co.size());
		for(Cookie j:co) {
			System.out.println(j.getName()+" -- "+j.getValue());
		}
		
		//Delete the cookie
		driver.manage().deleteCookie(cookie);
		System.out.println("Size of the: "+ co.size());
		
		//Delete the cookie of particualr name
		driver.manage().deleteCookieNamed("ebay");
		Set <Cookie> c = driver.manage().getCookies();
		for(Cookie j:c) {
			System.out.println(j.getName()+" -- "+j.getValue());
		}
		System.out.println("Size: "+ c.size());
		driver.manage().deleteAllCookies();
		
		Set <Cookie> l = driver.manage().getCookies();
		for(Cookie j:l) {
			System.out.println(j.getName()+" -- "+j.getValue());
		}
		
		System.out.println("S"+"="+ l.size());
		
		driver.quit();
	}
	
	

}
