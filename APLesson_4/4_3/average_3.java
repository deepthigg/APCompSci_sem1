import java.util.Scanner;

public class average_3
{

	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double num1= kb.nextDouble();
		System.out.println("Please enter the second number");
		double num2= kb.nextDouble();  
		System.out.println("Please enter the third number");
		double num3= kb.nextDouble();  
		
		calcavg(num1, num2, num3);
		method1("The average of " + num1 +  " , " + num2 + " , " + num3, calcavg(num1,num2,num3));
		
		
	}
	public static double calcavg( double num1, double num2, double num3)
	{
		return (num1 + num2 + num3) / 3;

	}
	
	public static void method1(String text, double answer)
	{
		System.out.printf(text + " is %.5f\n ", answer);
	}
	
	
}	