package stringcalculator;

public class Calculator
{
	public int add(String text) throws Exception
	{
		if(text.equals("")) {
			return 0;
		}

		else if(text.startsWith("//")) // case for when we have our own delimiter
		{
			if((text.charAt(2) == '['))
			{
				StringBuilder delimiters = new StringBuilder();
				int startIndex = 2; // the starting search location for the brackets
				while(startIndex != 0) {
					if(text.charAt(startIndex) == '[') {
						int endIndex = text.indexOf(']', startIndex); // find the end position of the delimiter
						delimiters.append(text.substring(startIndex+1, endIndex) + "|\\"); //put the delimiter into the delimiters string
						startIndex = endIndex + 1; // set the next check location on the next character af the bracket close
					}
					else {
						startIndex = 0; // break the loop, maybe a stupid way
					}
				}
				delimiters.setLength(delimiters.length() - 2); // cut the RegularExpression characters off the end of the string
				int endDelimIndex = text.indexOf('\n', 0); // find the index of where the numbers start
				String numberString = text.substring(endDelimIndex + 1); // get the string of only the numbers
				String[] splitString = numberString.split(delimiters.toString()); // split the numbers by the delimiters
				try {
					return theSum(splitString);
				} catch (Exception e){
					throw e;
				}
			}

			else if(text.charAt(3) == '\n') { // if we designated only one one character delimiter
				String numberString = text.substring(4); // get the string with only the numbers
				String[] splitString = numberString.split(Character.toString(text.charAt(2))); // split the string by the new delimiter
				try {
					return theSum(splitString);
				} catch (Exception e){
					throw e;
				}
			}
		}

		else if(text.contains(",") || text.contains("\n")) { // where we use the default delimiters
			String[] splitString = text.split(",|\\\n");
			try {
				return theSum(splitString);
			} catch (Exception e){
				throw e;
			}
		}
		return Integer.parseInt(text); // the case where there was only one input variable, and no delimiters
	}

	private int theSum(String[] splitString) throws Exception
	{
		int numOfStrings = splitString.length;
		int totalSum = 0;
		StringBuilder negativeString = new StringBuilder();

		for(int i = 0; i < numOfStrings; i++)
		{
			int parsedInt = Integer.parseInt(splitString[i]); // change the string into an int
			if(parsedInt > 1000) { // skip number if its over 1000
				continue;
			}
			if(parsedInt < 0) { // put the negative numbers into the negative error string that will be thrown
				negativeString.append(Integer.toString(parsedInt) + ", "); // also add the comma',' and the space ' ' after 
			}
			totalSum += parsedInt;
		}
		if(negativeString.length() > 0) { // if the negative string is larger than 0 then we have an error
			negativeString.setLength(negativeString.length() -2); // Cut the ", " off the end of the error numbers
			throw new Exception("Negatives not allowed: " + negativeString);			
		}
		return totalSum;
	}
}
