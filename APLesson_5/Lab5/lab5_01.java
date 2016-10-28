import java.util.Random;
public class lab5_01
{
	public static void main (String[]args)
	{
		Random rand = new Random();
		int num1 = rand.nextInt(6)+1;
		System.out.println("You rolled a " + num1);
		int num2 = rand.nextInt(6)+1;
		System.out.println("Computer rolled a " + num2);
		
		if (rolldice(num1,num2))
			System.out.println("Winner is you");
		if (!rolldice(num1, num2))
			System.out.println("Winner is computer");
		
	
	}
	public static boolean rolldice(int num1, int num2)
	{
		return (num1 >= num2);
			

	}
	
	
	

}