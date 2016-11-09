import java.util.Scanner;
public class Password
{
	static String username = "deepthi";
	static String password = "deepthiisawesome";
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
		
	} 
	public static void passCheck()
	{
		System.out.println("What is the username");
		String name = kb.next();
		System.out.println("What is the password");
		String word = kb.next();

		if ( name.equals (username) && word.equals (password))
		{
			System.out.println("Your access is granted");
	
		}

		else
		{
			if (name.equals(username))
			{
				System.out.println(" Password is incorrect");
				passCheck();
			 
			}
				

			else if (word.equals (password))
			{
				System.out.println("Username is incorrect");
				passCheck();
			}
			
			
			else
			{
				System.out.println("Your password and username are incorrect");
				passCheck();
			}
		}
		
	}
	
}