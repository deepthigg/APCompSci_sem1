public class GMC extends CarClass
{
	private double[] location;
	public GMC()
	{
		location = new double[2];
	}
	public GMC(double x, double y)
	{
		location = new double[2];
		location[0] = x;
		location[1]= y;
	}
	
}