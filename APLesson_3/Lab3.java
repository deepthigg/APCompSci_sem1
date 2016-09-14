import java.util.Scanner; //import Statement 

public class Lab3
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for your user input
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		//print the results...
		System.out.println("Interesting name!");
		
		//prompt for your user input
		System.out.println("How old are you?");
		
		//search for next integer that the user enters
		int num = keyboard.nextInt();
	
		System.out.println("Nice!");
		
		//prompt for your user input
		System.out.println("What do you do for fun?");
		
		String fun = keyboard.next();
	
		System.out.println(" Cool! " + fun + "sounds like fun!");
		
		//prompt for your user input
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
	
		System.out.println("Oh! " + music + " is nice!");
		
		//prompt for your user input
		System.out.println("How many siblings do you have?");
		
		int sibling= keyboard.nextInt();
	
		System.out.println("Cool! " + sibling + "sibling sounds like a good number.");
		
		//prompt for your user input
		System.out.println("What do you want to be when you grow up?");
		
		String be = keyboard.next();
	
		System.out.println("Nice! a " + be + " is very helpful.");
		
	
		
		
		

		
	}
	
}