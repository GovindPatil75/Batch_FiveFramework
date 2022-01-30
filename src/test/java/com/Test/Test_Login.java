package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PomClass.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_Login extends BaseClass {
	
	@Test(groups= {"Sanity"})
	public void Verify_LoginTestTc_001() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_SendKeys(login.getemailid(), excel.getStringTestData("Sheet1", 1, 0));
		Library.custom_SendKeys(login.getPassword(), excel.getStringTestData("Sheet1", 1, 1));
		Library.custom_click(login.getbtnLogin());
		  	
}
}