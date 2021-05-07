package app;

public class stringCalculator {
	static int count=0;
	public static int getCalledCount()
	{
		return stringCalculator.count;
	}
public static int add(String numbers) throws Exception
{
	stringCalculator.count++;
	if(numbers.equals("")) {
		return 0;
	}
	else {
		String delimiter=",";
		if(numbers.matches("//(.*)\n(.*)"))
		{
			delimiter=Character.toString(numbers.charAt(2));
			numbers=numbers.substring(4);
		}
		
		String numberlist[]=numbers.split(delimiter+"|\n");
		return sum(numberlist);
	}
}
private static int sum(String[] numbers) throws Exception{
	int total=0;
	for(String number:numbers)
	{
		if(Integer.parseInt(number)>0 && Integer.parseInt(number)<1000)
		total+=Integer.parseInt(number);
		else if(Integer.parseInt(number)<0)
			throw new Exception("negatives not allowed");

	}
	return total;
}
}
