package com.qa.examplejunit.operators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTaskTest {
	
	@Test
	public void addTest() {
		int result = CalculatorTask.add(12, 3); 
		
		//Assertions
		//fail();
		//assertTrue | assertFalse
		// assertEquals | assetNotEquals
		// assertSame | assertNotSame
		
		// Expectation, actual
		assertEquals( 15, result);
		
	}
}
