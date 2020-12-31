package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.yesm.businessfunction.BaseUtil;
import com.yesm.businessfunction.CommonBussinessUtil;
import com.yesm.configuration.Prop;
import com.yesm.pagerepository.HomePage;
import com.yesm.pagerepository.LoginPage;
import com.yesm.utilityfunction.ExcelUtil;

public class Login extends BaseUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Shikha Gaur\\Eclipse\\Framework\\Framework\\Driver\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com");
		/*driver.findElement(By.id("txtUsername")).sendKeys(Prop.get("username"));
		driver.findElement (By.id("txtPassword")).sendKeys(Prop.get("password"));
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("LogOut");
		driver.close();
		driver.quit();*/
		//With Framework
		int rowcount=ExcelUtil.getRowCount();
		int colCount=ExcelUtil.getColumnCount();
		
		for(int i=1;i<=rowcount-1;i++) {
		BaseUtil.openApp();
		CommonBussinessUtil.login(ExcelUtil.getData(i, 0), ExcelUtil.getData(i, 1));
	
		/*
		 * LoginPage.enterUserName(Prop.get("username"));
		LoginPage.enterPassword(Prop.get("password"));
	    LoginPage.clickSubmit();
		HomePage.clickIcon();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage.btnLogout();
		*/
		//CommonBussinessUtil.login(Prop.get("username"),Prop.get("password"));
		CommonBussinessUtil.logout();
		driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		}		
	}

}
