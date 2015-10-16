package stringcalculator;

public class Calculator
{
	public static int add(String text)
	{
		if(text.equals("")) {
			return 0;
		}
		else if(text.contains(",")) {
			String[] splitString = text.split(",");
			return Integer.parseInt(splitString[0])
					+ Integer.parseInt(splitString[1]);
		}

		else {
			return Integer.parseInt(text);
		}
	}
}
