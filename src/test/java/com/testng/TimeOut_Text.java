package com.testng;

import org.testng.annotations.Test;

public class TimeOut_Text {
	
	@Test(timeOut = 10000)
	private void login() throws InterruptedException {
		
		Thread.sleep(2000);
		
		System.out.println("set property");
		
		Thread.sleep(2000);
		
		System.out.println("launch browser");
		
		Thread.sleep(2000);
		
		System.out.println("get url");
		
		Thread.sleep(2000);
		
		System.out.println("maximize");
		
		Thread.sleep(1500);
		
		System.out.println("click login");

	}

}
