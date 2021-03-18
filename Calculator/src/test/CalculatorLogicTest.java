package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.CalculatorLogic;

public class CalculatorLogicTest {
	
	CalculatorLogic calculatorLogic = new CalculatorLogic();

	@Test
	public void testAdd() {
		assertEquals(calculatorLogic.add(4.1, 6.2), 10.3, 0);
	}

	@Test
	public void testSubtract() {
		assertEquals(calculatorLogic.subtract(4.1, 6.2), -2.1, 0.00000001);
	}

	@Test
	public void testMultiply() {
		assertEquals(calculatorLogic.multiply(4.1, 6.2), 25.42, 0.0000001);
	}

	@Test
	public void testDivide() {
		assertEquals(calculatorLogic.divide(25, 2.5), 10, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideWithException() {
		assertEquals(calculatorLogic.divide(25, 0), 0, 0);
	}

}
