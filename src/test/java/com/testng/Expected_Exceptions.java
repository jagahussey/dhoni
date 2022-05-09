package com.testng;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void deoms() {
		
		int a = 100;
				
				System.out.println(a/0);

	}

}
