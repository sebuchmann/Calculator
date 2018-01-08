package com.sebuchmann;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testSummeZweiPositive() {
		Calculator calc = new Calculator();
		int result = calc.addition(1, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void testSummeZweiNegative() {
		Calculator calc = new Calculator();
		int result = calc.addition(-1, -2);
		assertEquals(-3, result);
	}

	@Test
	public void testSummeZweiNull() {
		Calculator calc = new Calculator();
		int result = calc.addition(2, -2);
		assertEquals(0, result);
	}
	
}
