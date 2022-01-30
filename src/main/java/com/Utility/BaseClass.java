package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver ;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	@BeforeSuite
	public void BS() throws Exception {
		config=new ConfigDataProvider();
		excel=new ExcelDataProvider();
	}
 @BeforeMethod
   public void LaunchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(config.getUrl());
	driver.manage().window().maximize();
	// implicit wait ---> globally ---dynamic ---> All pages
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
@AfterMethod
 public void closeBrowser() {
	driver.quit();
}
}
