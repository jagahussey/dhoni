package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	
	// VALIDATION
	
	@Test
	
	private void deom_Section() {
		
		String expected_Username = "jaga";
		
		String actual_Username = "jagadesh";
		
		Assert.assertNotEquals(actual_Username, expected_Username);
		
		}
	
	// VERFICATION

//	@Test
//	
//	private void demo_Sections() {
//		
//		String expected_Username = "jaga";
//		
//		String actual_Username = "jagadesh";
//		
//		SoftAssert softs = new SoftAssert();
//	
//		softs.assertEquals(actual_Username, expected_Username);
//		
//		System.out.println("super process");
//		
//	//	softs.assertAll();
		
		

	//}

}


