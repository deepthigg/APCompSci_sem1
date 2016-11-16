import java.util.Scanner;
public class FirstLetter
{
	public static void main(String[]args)
	{
		String [] names = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		//fills the array
		for(int i = 0; i < word.length; i++)
		{
			word[i] = kb.next();
		}	
		
		//print the array 
		for(String letter : word)
		{
			System.out.print("\"" + First(words) + "\" ,");
			
		}
	}
	public static int First(String[] l)
	{
		String first= 0;
		for(String letter : l)
		{
			first = word.substring(0,0);
		}
		
		return first;
	}
	
}
