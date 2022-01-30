package com.Test;

import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class Test_2 extends BaseClass{
	
	@Test(priority=0,groups= {"Sanity"})
	public void m1() {
		System.out.println("m1");
	}
	@Test(dependsOnMethods="m1",groups= {"Regression"})
	public void m2() {
		System.out.println("m2");
	}
	

}
