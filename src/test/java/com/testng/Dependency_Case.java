package com.testng;

import org.testng.annotations.Test;

public class Dependency_Case {
	
	@Test
	private void setProperty() {
		System.out.println("set property");

	}
	
	@Test(dependsOnMethods = ("getUrl"))
	private void launchBrowser() {
		System.out.println("launch browser");

	}

	@Test
	private void getUrl() {
		System.out.println("get url");
		

	}
}
