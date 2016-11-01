import java.util.Scanner;
public class CountByX
{
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a the frist  value");
		int value1= kb.nextInt();
		System.out.println("Please enter a the last value");
		int value2= kb.nextInt();
		for(int i = value1; i <= value2; i+=2)
		{
			System.out.print(i + " ");
		}
	}
}