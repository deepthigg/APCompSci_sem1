import java.util.Scanner;

public class cube
{
	static double side;
	static double area;
	
	
	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter the length of the cube's side:");
		side= kb.nextDouble();
		
		
		calcsurf();
		method1();
		
		
	}
	public static void calcsurf()
	{
		area= 6.0* (side *side);

	}
	
	public static void method1()
	{
		System.out.printf("The surface area of a cube with " + side + " is " +  "%.5f\n", area);
	}
	
	
	
}