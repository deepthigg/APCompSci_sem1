import java.util.Scanner;

public class Rectangle_3
{
	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter the lenght:");
		double l= kb.nextDouble();
		System.out.println("Please enter the width");
		double w= kb.nextDouble();  
		
	    calcPerim(l,w);
		method1(calcPerim(l,w));
		
		
	}
	public static double calcPerim(double l, double w)
	{
	return 2* (l+w);

	}
	
	public static void method1(double perimeter)
	{
		System.out.printf(" Your rectangle is" + "%10.5f\n" , perimeter ,"  sq around. ");
	}
	
	
	
}