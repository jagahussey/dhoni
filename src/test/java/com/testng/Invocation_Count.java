package com.testng;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test
	private void setProperty() {
		System.out.println("set property");

	}

	@Test
	private void launchBrowser() {
		System.out.println("launch browser");

	}
	
	@Test(invocationCount = 3)
	private void refresh() {
		System.out.println("Refresh");

	}
}
