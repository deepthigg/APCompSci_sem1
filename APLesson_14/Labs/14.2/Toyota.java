public class Toyota extends CarClass
{
	private double[] location;
	
	public Toyota(String car)
	{
		location = new double[2];
		location[0] = Double.parseDouble(car.substring(0,1));
		location[1] = Double.parseDouble(car.substring(3));
	}
	
	
}