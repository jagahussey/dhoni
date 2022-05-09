package com.testng;

import org.testng.annotations.Test;

public class Grouping_Text {
	
	@Test (groups = "sationary")
	private void books() {
		System.out.println("books");
	}
	
	@Test (groups = "sationary")
	private void pen() {
  System.out.println("pen");
	}
	
	@Test(groups = "app")
	private void flipcart() {
     System.out.println("flipcart");
	}

	@Test(groups = "app")
	private void amazon() {
    System.out.println("amazon");
	}
	
	@Test
	private void cricket() {
     System.out.println("cricket");
	}
}
