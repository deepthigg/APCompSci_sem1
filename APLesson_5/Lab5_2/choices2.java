import java.util.Scanner;
public class choices2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to....." + 
							"\n 1. Do a math Problem" +
							"\n 2. Answer a question");
		
		int mathOrwords= kb.nextInt();
		if(mathOrwords == 1)
		{
			System.out.println("What is 2 X 2?");
			int mathAnswer = kb.nextInt();
			if(mathAnswer == 4)
			{
				System.out.println("Correct!");
			}
			else
				System.out.println("No! Wrong!");
		}
		else
		{
			System.out.println("Who said the phrase \" Yolo.\"?");
			kb.nextLine();
			String wordAnswer = kb.nextLine();
			if(wordAnswer.equals("Abe"))
			{
				System.out.println("Correct!");
			}
			else
			{
		
				System.out.println("wrong");
			}
			
		}
	}
}