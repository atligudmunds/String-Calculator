package stringcalculator;

//import java.util.Arrays;

public class Calculator
{
	public static int add(String text)
	{
		if(text.equals("")) {
			return 0;
		}
		else if(text.contains(",")) {
			String[] splitString = text.split(",");
			int numOfNumber = splitString.length;
			int totalSum = 0;
			for(int i = 0; i < numOfNumber; i++)
			{
				totalSum += Integer.parseInt(splitString[i]);
			}
			return totalSum;
		}

		else {
			return Integer.parseInt(text);
		}
	}
}
