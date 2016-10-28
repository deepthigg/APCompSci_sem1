import java.util.Scanner;
public class lab_4
{
	public static void main(String[]args)

	{
		lab_4 form = new lab_4();
		Scanner kb = new Scanner(System.in);
		
		
		
		System.out.println("Please enter item 1:");
		String word1= kb.nextLine();
		System.out.println("Please enter the price:");
		double number1= kb.nextDouble();
		
		kb.nextLine();
		
	
		System.out.println("Please enter item 2:");
		String word2= kb.nextLine();
		System.out.println("Please enter the price:");
		double number2= kb.nextDouble();
	
		
		kb.nextLine();
		
		System.out.println("Please enter item 3:");
		String word3= kb.nextLine();
		System.out.println("Please enter the price:");
		double number3= kb.nextDouble();
		
	
		
		System.out.println("                     ");
		
		Double number4 = number1 + number2 + number3;
		String word4 = " Subtotal:....";
		
	
		String word5 = " Tax:....";
		double number5 = number4 * 0.08;
		
	
		String word6 = "Total:....";
		double number6 = number4 + number5 ;
		
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>>>>>");
		form.format( word1, number1);
		form.format(word2, number2);
		form.format( word3, number3);
		form.format(word4, number4);
		form.format(word5, number5);
		form.format(word6, number6);
		System.out.println("        ");
		System.out.println("_____________________________________________");
		System.out.println("*Thank you for your support*");
	}

	
	
	public void format( String word, double number)
	{
		System.out.printf("\n* %20s  %10.2f" , word, number);
		
	}
	

}