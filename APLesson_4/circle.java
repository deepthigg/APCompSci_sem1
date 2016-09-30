import java.util.Scanner;

public class circle
{
	static double radius;
	static double area;
	
	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter the radius of the circle:");
		radius= kb.nextDouble();
		

		calcArea();
		method1();
	
		
	
	}
	public static void calcArea()
	{
		area= 3.14* (radius * radius);
		
	}

	
	public static void method1()
	{
		System.out.printf("The area of a circle with a radius of " + radius + " is %.5f\n", area);
	}
	
	
	
}