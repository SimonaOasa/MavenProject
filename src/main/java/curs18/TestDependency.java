package curs18;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestDependency {

	@Test
	public void test1() {
		assertTrue(false);
		System.out.println("Test 1");
	}
	@Test(dependsOnMethods = "test1")
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(dependsOnMethods = "test2")
	public void test3() {
		System.out.println("Test 3");
	}
	
	
}
