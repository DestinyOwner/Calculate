package test;

import calculate.Calculate;
import junit.framework.TestCase;

public class CalculateTest extends TestCase {
	Calculate c;
	
	public void setUp(){
		c = new Calculate();
	}
	
	public void testAdd(){
		assertEquals(0, c.add(0, 0));
		assertEquals(6, c.add(2, 4));
	}
	
	public void testMinus(){
		assertEquals(1, c.minus(3, 2));
		assertEquals(4, c.minus(6, 2));
	}
	
	public void testMultiply(){
		assertEquals(6, c.multiply(2, 3));
		assertEquals(4, c.multiply(2, 2));
	}
	
	public void testDivide(){
		assertEquals(2, c.divide(8, 4));
	}
}
