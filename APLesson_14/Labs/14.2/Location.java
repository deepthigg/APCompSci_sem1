public interface Location
{
   double[] getLoc();
   public final int ID = (int)(Math.random()*1000000) + 999999;
   public int getID() 
	{
		return ID;
	}
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	public double[] getLoc()
	{
		return location;
	}
}