public class Lab_4_Ex_03
{
	public static void main(String[]args)
	{
		Lab_4.1_Ex_03 interest = new Lab_4_Ex_03();
		int p = 115;
		double r = 0.4;
		int n = 3;
		int t = 4;
		double interest = average.calcAvg(p,r,n,t);
		System.out.printf("The total monthly payment is %10.2f\n", interest);
	}
	
	public double calcCom( int p, double r, int n, int t);
	{
		return p * Math.pow(1 + (r / n ), n * t);
	}
}