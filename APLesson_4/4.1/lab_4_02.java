import java.util.Scanner;

public class lab_4_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		//name strings
		System.out.println("Enter your first name:");
		String name=kb.next();
		System.out.println("Enter your last name:");
		String last=kb.next();
		//title
		System.out.println("Enter your title:");
		String title=kb.next();
		kb.nextLine();
		//school
		System.out.println("Enter the school site:");
		String school=kb.nextLine();
		//year	
		System.out.println("Enter the school year:");
		String year = kb.next();
		
		System.out.println("What is your subject:");
		String subject = kb.next();
		
		
		lab_4_02 form = new lab_4_02();
		//print stars
		System.out.println("**************************************************");
		//line items
		form.format(school, year);
		form.format(name,last);
		form.format(title,subject);
		
		System.out.println("**************************************************");
	}
	
	public void format( String word, String answer)
	{
		System.out.printf("*%20s  %10s*\n" , word, answer);	
	}
	
}
