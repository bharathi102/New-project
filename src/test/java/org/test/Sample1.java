package org.test;

import org.testng.annotations.*;

public class Sample1 {
	@BeforeClass
	private void beforeClass(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
	}
	@Test
	private void test2() {
		System.out.println("Test 2");
		
	}
	@Test
	private void test() {
		System.out.println("Test");
	}
	
}
