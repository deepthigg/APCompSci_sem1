import java.util.Scanner;

public class Excersice_01_Rectangle
{
	static double length;
	static double width;
	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter the lenght:");
		length= kb.nextDouble();
		System.out.println("Please enter the width");
		width= kb.nextDouble();  
		
		calcPerim();
		method1();
		
		
	}
	public static double calcPerim()
	{
		return (2 * length) + (2 * width);

	}
	
	public static void method1()
	{
		System.out.println("Your rectangle is" + calcPerim() + " sq around.");
	}
	
	
	
}