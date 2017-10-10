package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	@Test
	public void test() {
		assertEquals(4, calculator.add(2, 2));
	}
	@Test
	public void divide() {
		
		assertTrue(calculator.isEqual(1, calculator.divide(2, 2)));
		assertFalse(calculator.isEqual(2, calculator.divide(2, 2)));
	}
	
	
	@Test
	public void multiply() {
		assertTrue(calculator.isEqual(4, calculator.multiply(2, 2)));
		assertFalse(calculator.isEqual(1, calculator.multiply(2, 2)));
	}
	
	
	@Test
	public void subtract() {
		assertTrue(calculator.isEqual(0, calculator.subtract(2, 2)));
		assertFalse(calculator.isEqual(1, calculator.subtract(2, 2)));
	}

}
