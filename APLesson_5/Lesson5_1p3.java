import java.util.Scanner;
public class Lesson5_1p3
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word1 = kb.next();
		String word2 = kb.next();
		
		if (word1.equals(word2))
			System.out.println("words are equal");
		else
			System.out.println("words are not equal");
		
	}
}

