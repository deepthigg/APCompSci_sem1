import java.util.Scanner;
public class Song
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		sing ("Na", 4);
		sing ("Na", 4);
		sing ("Hey", 3);
		sing ("Goodbye", 2);
		
	}
	
	public static void sing(String lyric, int number)
	{
		for(int i =0; i <= number; i++)
		{
			System.out.print(lyric + " ");
		}
		System.out.println();
	}
}