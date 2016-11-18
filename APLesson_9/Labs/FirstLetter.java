import java.util.Scanner;
public class FirstLetter
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
	
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}	
		
		
		System.out.println(First(words));
	}
	public static String First(String[] w)
	{
		String firstletters = "";
		for(String word : w)
		{
			firstletters += word.substring(0,1) + " ";
		}
		
		return firstletters;
	}
	
}
