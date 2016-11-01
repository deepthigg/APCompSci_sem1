import java.util.Scanner;
public class graph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a the first  value");
		int value= kb.nextInt();
		System.out.println("Please enter the size of your table");
		int size= kb.nextInt();
		
	    for(int i = 1 ; i <= size; i++)
		{
			System.out.printf(i + " " + i * value + "\n");
		}

	}
}