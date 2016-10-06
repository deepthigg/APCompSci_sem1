import java.util.Scanner;

public class Excersice_01_Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter the lenght:");
		l= kb.nextDouble();
		System.out.println("Please enter the width");
		w= kb.nextDouble();  
		
		calcPerim();
		method1();
		
		
	}
	public static void calcPerim()
	{
		perimeter = 2 * ( l + w );

	}
	
	public static void method1()
	{
		System.out.printf(" Your rectangle is " + " %.5f\n " , perimeter,  "  sq around. ");
	}
	
	
	
}