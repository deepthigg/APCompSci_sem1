import java.util.Scanner;
public class UserClassRunner
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the firstname");
		String fN = kb.next();
		System.out.println("Please enter the lastname");
		String lN = kb.next();
		
		
		UserClass user1 = new UserClass();
		

		System.out.println(" Would you like to use a public avatar");
		String YorN = kb.next();
		
		
		if (YorN.equals("n"))
		{
			user1 = new UserClass(fN, lN);
			
		}

		else
		{
			System.out.println("What is your avatar?");
			String av = kb.next();
			user1 = new UserClass(fN, lN, av);
		}
		
		System.out.println(user1.toString());
		
		
	}
	
}