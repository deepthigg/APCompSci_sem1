import java.util.Scanner;
public class recursion2
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		checkNum();
	}
	public static void checkNum()
	{
		System.out.println("Pick a number btw 1 and 10: ");
		int guess = kb.nextInt();
		int number = (int)(Math.random()*10)+1;
		if(guess >= 1 && guess <= 10)
		{
			if(guess== number)
			System.out.println("The num is right" + number);
			else
				System.out.println("Wrong");
			
		}
		else
		{
			System.out.println("mkae it 1-10 number please");
			checkNum();
		}
	}
}