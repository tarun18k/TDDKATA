package test;
import org.junit.Test;

import app.StringCalculator;
import junit.framework.TestCase;

public class StringCalculatorTest extends TestCase {
public static void main(String args[])
{
	
}
@Test
public void testEmptylist() {
	assertEquals(0,StringCalculator.add(""));
}
@Test
public void testOneNumber()
{
	assertEquals(1,StringCalculator.add("1"));
}
public void testNumbers() {
	assertEquals(6,StringCalculator.add("123"))
}
}
