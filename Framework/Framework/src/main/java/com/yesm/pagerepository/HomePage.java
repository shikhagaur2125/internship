package com.yesm.pagerepository;

import org.openqa.selenium.By;
import com.yesm.businessfunction.BaseUtil;

public class HomePage extends BaseUtil {

	

	public static By iconWelcome=By.id("welcome");
	 
	 public static By linkLogout=By.linkText("Logout");


	 

		public static void clickIcon() {
		
			driver.findElement(iconWelcome).click();
		}
		
		public static void btnLogout() {
			driver.findElement(linkLogout).click();
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
