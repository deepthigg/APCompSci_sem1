import java.util.Scanner;

public class Fibonacci
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter initial number: ");
		int initial = kb.nextInt();
		
		System.out.println("Plsease enter  sequence size: ");
		int size = kb.nextInt();
		
		int[] numbers = new int[size];
		
		for(int i = 0; i < numbers.length; i++)
		{
			if ( (i == 0 ) || (i == 1) )
		       {
				   numbers[i] = initial;
			   }
			else
				{
					numbers[i] = numbers[i-1] + numbers[i-2];
				}
				
			System.out.println(" " + numbers[i] );
		}

	}	
}