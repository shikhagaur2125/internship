package com.yesm.pagerepository;

import org.openqa.selenium.By;
import com.yesm.businessfunction.BaseUtil;

public class LoginPage extends BaseUtil{
	

	

public static By txtUserName=By.id("txtUsername");
 public static By txtPassword=By.id("txtPassword");
 public static By btnSubmit=By.id("btnLogin");


 

	public static void enterUserName(String username) {
	
		driver.findElement(txtUserName).sendKeys(username);
	}
	
	public static void enterPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
	}
	
	public static void clickSubmit() {
		driver.findElement(btnSubmit).click();
	}

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

