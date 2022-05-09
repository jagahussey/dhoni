package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {

	@Ignore
	@Test
	private void women() {
		System.out.println("women");

	}
	
	
	@Test
	private void men() {
	System.out.println("men");
	}
	
	@Test
	private void dressess() {
		System.out.println("dressess");

	}
	
	@Test(enabled = false)
	private void tshirt() {
		System.out.println("tshirt");

	}
}
