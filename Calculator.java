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
			//if(text.charAt(3) == '\n') {
				System.out.println("Entered IT!!!!!!");
				System.out.println("hello nigras");
				String numberString = text.substring(4);
				System.out.println("Motherfuckers");
				/*String newDelimiter = String.valueOf(text.charAt(2));*/
				Character a2 = new Character(text.charAt(2));
				System.out.println("Cuntbags");
				String[] splitString2 = numberString.split(Character.toString(a2));
				System.out.println("Turdfucker");


				System.out.println("DELIMITER|" + a2 + "|");
				System.out.println("Number String:" + numberString);
				//return theSum(splitString2);
				int numOfNumber = splitString2.length;
				int totalSum = 0;
	
				System.out.println("SPLIT STRING:");
	
				for(int i = 0; i < numOfNumber; i++)
				{
					System.out.println(splitString2[i]);
					totalSum += Integer.parseInt(splitString2[i]);
				}

				System.out.println("END SPLIT STRING");
				return totalSum;
			//}
		}

		else if(text.contains(",") || text.contains("\n")) {
			String[] splitString = text.split(",|\\\n");

			int numOfNumber = splitString.length;
			int totalSum = 0;
	
			System.out.println("SPLIT STRING:");
	
			for(int i = 0; i < numOfNumber; i++)
			{
				System.out.println(splitString[i]);
				totalSum += Integer.parseInt(splitString[i]);
			}

			System.out.println("END SPLIT STRING");
			return totalSum;
			//return theSum(splitString);
		}
		return Integer.parseInt(text);

	}
/*
	private static int theSum(String[] splitString3)
	{
		int numOfNumber = splitString3.length;
		int totalSum = 0;
	
		System.out.println("SPLIT STRING:");
	
		for(int i = 0; i < numOfNumber; i++)
		{
			System.out.println(splitString3[i]);
			totalSum += Integer.parseInt(splitString3[i]);
		}

		System.out.println("END SPLIT STRING");
		return totalSum;
	}*/
}
