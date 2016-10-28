import java.util.Scanner;
public class graph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a the frist  value");
		int value= kb.nextInt();
		System.out.println("Please enter the siz of your table");
		int size= kb.nextInt();
		
	    for(value i = 1 ; i <= size; i++)
		{
			Formula = value * i;
		}

	}
}