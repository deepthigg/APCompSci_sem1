import java.util.Scanner;
public class lesson5p4
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter number 1: ");
		int one= kb.nextInt();
		System.out.println("Please enter number 2: ");
		int two= kb.nextInt();
		
		boolean even = (one + two) % 2 == 0; 
		
		if (even)
			System.out.println("Your numbner  is " + (one + two) + " even!");
		if (!even)
			System.out.println("Your numbner  is " + (one + two) + " odd!");
		
	}

}
