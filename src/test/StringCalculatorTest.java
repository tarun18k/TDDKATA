package test;

import org.junit.Test;

import app.stringCalculator;
import junit.framework.TestCase;

public class stringCalculatorTest extends TestCase {
public static void main(String args[])
{
	
}
@Test
public void testEmptylist() {
	assertEquals(0,stringCalculator.add(""));
}
@Test
public void testOneNumber()
{
	assertEquals(1,stringCalculator.add("1"));
}
@Test
public void testNumbers() {
	assertEquals(6,stringCalculator.add("1,2,3"));
}
@Test
public void testNegativeNumbers()
{
	try {
		stringCalculator.add("-1,2,5,7");
		
	}
	catch(Exception e){
		assertEquals(e.getMessage(),"negatives not allowed");
	}
}
@Test
public void testNumberGreaterthan1000()
{
	assertEquals(2,"2,1000");
}
}
