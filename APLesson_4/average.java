import java.util.Scanner;

public class average
{
	static double num1;
	static double num2;
	static double num3;
	static double theaverage;
	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter the first number:");
		num1= kb.nextDouble();
		System.out.println("Please enter the second number");
		num2= kb.nextDouble();  
		System.out.println("Please enter the third number");
		num3= kb.nextDouble();  
		
		calcavg();
		method1();
		
		
	}
	public static void calcavg()
	{
		theaverage = (num1 + num2 + num3) / 3;

	}
	
	public static void method1()
	{
		System.out.printf("The average of " + num1 +  " , " + num2 + " , " + num3 +  " is " + "%.5f\n", theaverage);
	}
	
	
	
}