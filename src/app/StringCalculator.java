package app;
public class StringCalculator {
public static int add(String numbers)
{
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
private static int sum(String[] numbers) {
	int total=0;
	for(String number:numbers)
	{
		total+=Integer.parseInt(number);
	}
	return total;
}
}
