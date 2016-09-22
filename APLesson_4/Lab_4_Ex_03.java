public class Lab_4_Ex_03
{
	public static void main(String[]args)
	{
		Lab_4_Ex_03 compound = new Lab_4_Ex_03();
		int p = 115;
		int r = 1;
		int n = 3;
		int t = 4;
		double comp = compound.calcCom(p, r, n, t);
		double math = Math.pow (n,t);
		System.out.printf("The total monthly payment is %10.2f\n", comp);
	}
	
	public double calcCom(int p, int r, int n, int t)
	{
		return (p * Math.pow(1 + (r / n), n * t));
	}
} 