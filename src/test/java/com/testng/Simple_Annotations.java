package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("set propety");
		
	}
	
	@BeforeTest
	private void launchBrowcer() {
		System.out.println("launch browcer");

	}
	
	@BeforeClass
	private void getUrl() {
		System.out.println("get url");
	}
	
	@BeforeMethod
	private void signin() {
		System.out.println("signin");
	}
	
	@Test
	private void women() {
		System.out.println("women");

	}
	
	@Test
	private void dresses() {
		System.out.println("dresses");

	}
	
	@Test
	private void tshirt() {
		System.out.println("tshirt");
	}
	
	@AfterMethod
	private void signoff() {
		System.out.println("signoff");

	}
	
	@AfterClass
	private void homepage() {
		System.out.println("homepage");
	}
	
	@AfterTest
	private void close() {
		System.out.println("close");

	}
	
	@AfterSuite
	private void deletecookies() {
		System.out.println("delete cookies");

	}
	
	

}
