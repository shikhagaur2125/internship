package com.yesm.businessfunction;

import java.util.concurrent.TimeUnit;

import com.yesm.pagerepository.HomePage;
import com.yesm.pagerepository.LoginPage;

public class CommonBussinessUtil extends BaseUtil {

	public static void login(String username, String password) {
	
	
	LoginPage.enterUserName(username);
	LoginPage.enterPassword(password);
    LoginPage.clickSubmit();
	}
	
	public static void logout() {
		HomePage.clickIcon();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage.btnLogout();
		
	}
	
	
	
}