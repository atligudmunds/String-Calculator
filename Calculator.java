package stringcalculator;

public class Calculator
{
	public int add(String text) throws Exception
	{
		if(text.equals("")) {
			return 0;
		}

		else if(text.startsWith("//"))
		{
			if((text.charAt(2) == '['))
			{
				StringBuilder delimiters2 = new StringBuilder();
				int startIndex = 2;
				while(startIndex != 0)
				{
					if(text.charAt(startIndex) == '[') {
						int endIndex = text.indexOf(']', startIndex);
						delimiters2.append(text.substring(startIndex+1, endIndex) + "|\\");
						//System.out.println("Delimiter:" + text.substring(startIndex+1,endIndex));
						startIndex = endIndex + 1;
					}
					else {
						startIndex = 0;
					}
				}
				delimiters2.setLength(delimiters2.length() - 2);
				int endDelimIndex = text.indexOf('\n', 0);
				String numberString = text.substring(endDelimIndex + 1);
				String[] splitString = numberString.split(delimiters2.toString());
				try {
					return theSum(splitString);
				}
				catch (Exception e){
					throw e;
				}

			}
/*
			else if(text.charAt(2) == '[')
			{
				int endDelimIndex = text.indexOf(']', 3);
				String delimiter = text.substring(3, endDelimIndex);

				String numberString = text.substring(endDelimIndex + 2);
				String[] splitString = numberString.split(delimiter);
				try {
					return theSum(splitString);
				}
				catch (Exception e){
					throw e;
				}
			}
*/
			else if(text.charAt(3) == '\n') {
				String numberString = text.substring(4);
				String[] splitString = numberString.split(Character.toString(text.charAt(2)));
				try {
					return theSum(splitString);
				}
				catch (Exception e){
					throw e;
				}
				
			}
		}

		else if(text.contains(",") || text.contains("\n")) {
			String[] splitString = text.split(",|\\\n");
			try {
				return theSum(splitString);
			}
			catch (Exception e){
				throw e;
			}
		}
		return Integer.parseInt(text);
	}

	private int theSum(String[] splitString) throws Exception
	{
		int numOfNumber = splitString.length;
		int totalSum = 0;
		StringBuilder negativeString = new StringBuilder();

		for(int i = 0; i < numOfNumber; i++)
		{
			int parsedInt = Integer.parseInt(splitString[i]);
			if(parsedInt > 1000) {
				continue;
			}
			if(parsedInt < 0) {
				negativeString.append(Integer.toString(parsedInt) + ", ");
			}
			totalSum += parsedInt;
		}
		if(negativeString.length() > 0) {
			negativeString.setLength(negativeString.length() -2);
			throw new Exception("Negatives not allowed: " + negativeString);			
		}
		//System.out.println("TotalSum:" + totalSum);
		return totalSum;
	}
}





