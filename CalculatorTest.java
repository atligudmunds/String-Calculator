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

	@Test
	public void test2a()
	{
		assertEquals(11, Calculator.add("6,1,4"));
	}

		@Test
	public void test2b()
	{
		assertEquals(72, Calculator.add("65,1,6"));
	}

	@Test
	public void test2c()
	{
		assertEquals(12089, Calculator.add("6431,6,5432,135,6,1,76,0,2"));
	}

	@Test
	public void test2d()
	{
		assertEquals(26, Calculator.add("0,0,5,21"));
	}

	@Test
	public void test3a()
	{
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void test3b()
	{
		assertEquals(7, Calculator.add("1\n3\n3"));
	}

	@Test
	public void test4a()
	{
		assertEquals(3, Calculator.add("//;\n1;2"));

	}

	@Test
	public void test4b()
	{
		assertEquals(7, Calculator.add("//!\n2!5"));
	}

	@Test
	public void test4c()
	{
		assertEquals(7, Calculator.add("//#\n2#5"));
	}


}

