import java.util.Scanner;
public class lab5_02
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter first item: ");
		String ione= kb.next();
		System.out.println("Please enter price of this item ");
		double pone= kb.nextDouble();
		System.out.println("Please enter second item: ");
		String itwo= kb.next();
		System.out.println("Please enter price of this item ");
		double ptwo= kb.nextDouble();
		System.out.println("Please enter third item: ");
		String ithree= kb.next();
		System.out.println("Please enter price of this item ");
		double pthree= kb.nextDouble();
		System.out.println("Please enter fourth item: ");
		String ifour= kb.next();
		System.out.println("Please enter price of this item ");
		double pfour= kb.nextDouble();
		
		double subtotal = pone+ ptwo + pthree + pfour;
		double discount= calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discount +tax;
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<Receipt>>>>>>>>>>>>>>>>>>>");
		format(itwo,ptwo);
		format(itwo,ptwo);
		format(ithree,pthree);
		format(ithree,pthree);
		format( "Subtotal", subtotal);
		format( "Discount", discount);
		format( "Tax", tax);
		format( "Total", subtotal);
		System.out.println("________________________________________");
		System.out.println("Thank you");
	}
	
	public static double calcDisc(double sub)
	{
		 if (sub >= 2000 )
			 return sub * 0.15;
		 return 0.0;
		
	}
	public static void format(String i,double p)
	{
		System.out.printf("%20s.....................$%.2f\n",i,p);
		
	}
}

