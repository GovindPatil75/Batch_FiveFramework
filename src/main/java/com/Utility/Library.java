package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Library {

	public static void custom_handleDropDown(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public static void custom_SendKeys(WebElement element,String value) {
		if(element.isEnabled() && element.isDisplayed() ==true) {
			element.sendKeys(value);
		}else {
			System.out.println("uanble to send Values");
		}		
	}
	
	public static void custom_click(WebElement element) {
		if(element.isEnabled() && element.isDisplayed() ==true) {
			element.click();
		}else {
			System.out.println("Unable to click");
		}
	}
}
