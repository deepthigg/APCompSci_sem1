import java.util.Scanner;

public class Cube_3
{
	
	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter the length of the cube's side:");
		double s = kb.nextDouble();
		
		
		calcsurf(s);
		method1("The surface area of a cube with " + s  + " is ", calcsurf(s));
		
		
	}
	public static double calcsurf(double s)
	{
		return 6* (s * s );

	}
	
	public static void method1(String text, double area)
	{
		System.out.printf( text +  "%.5f\n", area);
	}
	
	
	
}