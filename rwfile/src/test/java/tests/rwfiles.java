package tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class rwfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		FileInputStream is = new FileInputStream("C:\\EW\\rwfile\\src\\test\\resources\\Properties\\TestData.Properties");
		properties.load(is);
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("browser"));
		
		FileOutputStream os = new FileOutputStream("C:\\EW\\rwfile\\src\\test\\resources\\Properties\\TestData.Properties");
	    properties.setProperty("Test", "1234567");
	    properties.store(os, "Thanks! for entering");
	}

}
