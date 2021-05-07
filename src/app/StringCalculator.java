package app;
public class StringCalculator {
public static int add(String numbers)
{
	if(numbers.equals("")) {
		return 0;
	}
	else {
		String delimiter=",";
		
		String numberlist[]=numbers.split(","+"|\n");
		return sum(numberlist);
	}
}
private int sum(String[] numbers) {
	int total=0;
	for(String number:numbers)
	{
		total+=Integer.parseInt(number);
	}
	return total;
}
}
