import java.util.Scanner;
public class lab5_02
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter first item: ");
		String one= kb.next();
		System.out.println("Please enter price of this item ");
		double pone= kb.nextDouble();
		System.out.println("Please enter second item: ");
		String two= kb.next();
		System.out.println("Please enter price of this item ");
		double ptwo= kb.nextDouble();
		System.out.println("Please enter third item: ");
		String three= kb.next();
		System.out.println("Please enter price of this item ");
		double pthree= kb.nextDouble();
		System.out.println("Please enter fourth item: ");
		String four= kb.next();
		System.out.println("Please enter price of this item ");
		double pfour= kb.nextDouble();
		
		double subtotal = pone+ ptwo + pthree + pfour;
		double disount= discount(total);
		double tax = add * 8.25
		double total = subtotal - discount +t ax
		
		if (dicount(total))
			System.out.println("Discount is 15% of the subtotal");
		if (!dicount(total))
			System.out.println("Discount is 0%");
	}
	
	public static boolean discount(total)
	{
		return (total >= 2000 )
		
	}
	public static format()
	{
		
		
	}
}

