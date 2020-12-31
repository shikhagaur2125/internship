package testNG;


import org.testng.annotations.Test;

import com.yesm.businessfunction.BaseUtil;
import com.yesm.businessfunction.CommonBussinessUtil;
import com.yesm.configuration.Prop;

public class Test2 extends BaseUtil{

	@Test(groups={"regression"})
	public void login() {
	BaseUtil.openApp();
	CommonBussinessUtil.login(Prop.get("username"),Prop.get("password"));
	CommonBussinessUtil.logout();
	driver.close();
	
	
	
	
}}
