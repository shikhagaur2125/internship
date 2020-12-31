package com.yesm.businessfunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.yesm.configuration.Prop;

public class BaseUtil {

	public static WebDriver driver=null;
	public static void openApp() {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Shikha Gaur\\Eclipse\\Framework\\Framework\\Driver\\chromedriver.exe");
	 driver= new ChromeDriver();
	driver.get(Prop.get("url"));
	
	
	
	
	
	
	
	
	
}
	
	
	
}
