
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest
{
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("stringcalculator");
	}

	@Test
	public void test()
	{
		assertEquals(0, Calculator.add(""));
	}
}
