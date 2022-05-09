package com.testng;

import org.testng.annotations.Test;

public class Priority_Test {
	
	@Test(priority = -2)
	private void setProperty() {
		System.out.println("set property");

	}
	
	@Test(priority = 1)
	private void launchBrowser() {
		System.out.println("launch browser");
	}
	
	@Test(priority = 0)
	private void geturl() {
		System.out.println("get url");

	}
	
	@Test(priority = -1)
	private void login() {
		System.out.println("login");

	}

}
