import java.util.Scanner;
public class Lab_4_Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_4_Ex_03 compound = new Lab_4_Ex_03();
		System.out.println("Please enter the principal:");
		double p= kb.nextDouble();
		System.out.println("Please enter interest rate:");
		double r= kb.nextDouble();
		System.out.println("Please enter the number of times the loan is comppunded per year:");
		double n= kb.nextDouble();
		System.out.println("Please enter the life of the loan:");
		double t= kb.nextDouble();

		double comp = compound.calcCom(p, r, n, t);
		double math = Math.pow (n,t);
		System.out.printf("The total monthly payment is %10.2f\n", comp);
	}
	
	public double calcCom(double p, double r, double n, double t)
	{
		return (p * Math.pow(1 + (r / n), n * t)) / (t *12);
	}
} 