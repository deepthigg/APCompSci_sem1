public class Retmethods
{
	public static void main(String[]args)
	{
		Retmethods average = new Retmethods();
		int n1 = 3;
		int n2 = 8;
		int n3 = 15;
		double avg = average.calcAvg(n1, n2, n3);
		System.out.printf("The average is %10.2f\n", avg);
	

	}
	
	public double calcAvg( int one, int two, int three)
	{
		return (one+two+three)/3.0;
	}
}