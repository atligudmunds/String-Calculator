package stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest
{
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("stringcalculator");
	}

	Calculator calc = new Calculator();

	@Test
	public void test1a()
	{
		try {
			assertEquals(0, calc.add(""));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test1b()
	{
		try{
			assertEquals(4, calc.add("4"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test1c()
	{
		try {
			assertEquals(7, calc.add("4,3"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test2a()
	{
		try {
			assertEquals(11, calc.add("6,1,4"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test2b()
	{
		try {
			assertEquals(72, calc.add("65,1,6"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test2c()
	{
		try {
			assertEquals(1089, calc.add("431,6,432,135,6,1,76,0,2"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test2d()
	{
		try {
			assertEquals(26, calc.add("0,0,5,21"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test3a()
	{
		try {
			assertEquals(6, calc.add("1\n2,3"));
		}		
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test3b()
	{
		try {
			assertEquals(7, calc.add("1\n3\n3"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test4a()
	{
		try {
			assertEquals(3, calc.add("//;\n1;2"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test4b()
	{
		try {
			assertEquals(7, calc.add("//!\n2!5"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test4c()
	{
		try {
			assertEquals(7, calc.add("//#\n2#5"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}


	@Test
	public void test5a()
	{
		try {
			calc.add("-1,5,6");
		}
		catch (Exception e){
			assertEquals("Negatives not allowed: -1", e.getMessage());
		}
	}

	@Test
	public void test5b()
	{
		try {
			calc.add("1,-2,6");
		}
		catch (Exception e){
			assertEquals("Negatives not allowed: -2", e.getMessage());
		}
	}	

	@Test
	public void test5c()
	{
		try {
			calc.add("-1,-5,-6,7");
		}
		catch (Exception e){
			assertEquals("Negatives not allowed: -1, -5, -6", e.getMessage());
		}
	}

	@Test
	public void test5d()
	{
		try {
			calc.add("2,-5,-6,7");
		}
		catch (Exception e){
			assertEquals("Negatives not allowed: -5, -6", e.getMessage());
		}
	}

	@Test
	public void test6a()
	{
		try {
			assertEquals(26, calc.add("1001,0,5,21"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test6b()
	{
		try {
			assertEquals(1008, calc.add("6,1000,2430,2"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

		@Test
	public void test6c()
	{
		try {
			assertEquals(5, calc.add("0,1002,5"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}


	@Test
	public void test7a()
	{
		try {
			assertEquals(9, calc.add("//[;;]\n1;;2;;6"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test7b()
	{
		try {
			assertEquals(8, calc.add("//[##!]\n2##!5##!1"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

	@Test
	public void test7c()
	{
		try {
			assertEquals(19, calc.add("//[######]\n2######5######5######7"));
		}
		catch (Exception e) {
			System.out.println("Exception Cought");
		}
	}

}

