package stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest
{
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("stringcalculator");
	}

	@Test
	public void test1a()
	{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void test1b()
	{
		assertEquals(4, Calculator.add("4"));
	}

	@Test
	public void test1c()
	{
		assertEquals(7, Calculator.add("4,3"));
	}
}

