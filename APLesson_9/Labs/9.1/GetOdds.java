import java.util.Scanner;
public class GetOdds
{
	static int [] numbers;
	public static void main(String[]args)
	{
		int[] numbers= new int[10];

		fillArray();
		System.out.println("For the following numbers....+ printArray(numbers)");
		System.out.println("The + (getOdds(numbers)- ????)+ odd numbers");
	}
	public static int fillArray()
	{
		for(int i=0; i< numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) +1;
		}
	}
	public static String printArray(String [] print)
	{
		System.out.print ()
	}
	public static int getOdds(int[]n)
	{
		
		int odds = 0
		for(int numbers : n)
		{
			if (numbers.substring(0),++2 )
			{
				n+= odds
			}
			else
			{
				return odds;
			}
		}
		
	}
}
