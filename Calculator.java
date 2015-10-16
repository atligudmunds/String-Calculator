package stringcalculator;

public class Calculator
{
	public static int add(String text)
	{
		if(text.equals("")) {
			return 0;
		}

		else if(text.startsWith("//"))
		{
			if(text.charAt(3) == '\n') {
				String numberString = text.substring(4);
				String[] splitString = numberString.split(Character.toString(text.charAt(2)));
				return theSum(splitString);
			}
		}

		else if(text.contains(",") || text.contains("\n")) {
			String[] splitString = text.split(",|\\\n");
			return theSum(splitString);
		}
		return Integer.parseInt(text);
	}

	private static int theSum(String[] splitString3)
	{
		int numOfNumber = splitString3.length;
		int totalSum = 0;
		for(int i = 0; i < numOfNumber; i++)
		{
			totalSum += Integer.parseInt(splitString3[i]);
		}
		return totalSum;
	}
}
