import java.util.Scanner;

public class circle_3
{


	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter the radius of the circle:");
		double r= kb.nextDouble();
		

		calcArea(r);
		method1("The area of a circle with a radius of " + r , calcArea(r));
	
		
	
	}
	public static double calcArea(double r)
	{
		return 3.14* (r * r) ;
		
	}

	
	public static void method1( String text, double area)
	{
		System.out.printf( text + " is %.5f\n", area);
	}
	
	
	
}