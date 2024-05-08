package curs17;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 0)
	public void one() {
		System.out.println("Test 1");
	}
	@Test(priority = 1)
	public void two() {
		System.out.println("Test 2");
	}
	@Test(priority = 2)
	public void three() {
		System.out.println("Test 3");
	}
	
	@Test
	public void four() {
		System.out.println("Test 4");
	}
	@Test
	public void five() {
		System.out.println("Test 5");
	}
	
	
	
	
}
