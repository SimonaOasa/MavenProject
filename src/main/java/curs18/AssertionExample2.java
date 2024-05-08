package curs18;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample2 {

	// 1. Hard Assertion
	// 2. Soft Assertion
	
	//@Test
	public void hardAssertion() {
		System.out.println("Some code here!");
		assertTrue(false);
		System.out.println("Some other code here!");
		assertEquals(12, 300);
		System.out.println("Final code here");	
	}
	
	@Test
	public void softAsserion() {
		System.out.println("Some code here!");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("Some other code here!");
		sa.assertEquals(12, 300);
		System.out.println("Final code here");	
		sa.assertAll();
	}
	
	
}
