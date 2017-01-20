import java.lang.Math.*;
public class MPH
{
	//instance variables
	private int distance, hours, minutes;
	private double mph;
	
	public MPH()
	{
		//defalut values for instance vars
		distance = 0;
		hours = 0;
		minutes = 0; 
		mph = 0;
	}
	
	//Constrctor with params
	public MPH(int d, int h, int m, double mPh)
	{
		distance = d;
		hours = h;
		minutes = m; 
		mph = 0;
	}
	
	//Modifiers
	public void setValues(int d, int h, int m, double mPh)
	{
		distance = d;
		hours = h;
		minutes = m; 
		mph = 0;
		
	}
	
	//Accessors
	public double getMPH()
	{
		mph =  Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance");
		 distance = kb.nextint();
		System.out.println("Please enter the hours");
		hours = kb.nextint();
		System.out.println("Please enter the minutes");
		minutes= kb.nextint();
		
		MilesPerHour object1 = new MilesPerHour(distance, hours, time);
		System.out.println("User input for distance, hours, and minutes " + distance + ", " + hours + "," + minutes + ",");
		System.out.println(distance + " miles in" + hours + "is" + object1.getMPH());
		
		object.setValues(500,5,30);
		
		System.out.println("User input for distance, hours, and minutes " + distance + ", " + hours + "," + minutes + ",");
		System.out.println(distance + " miles in" + hours + "is" + object1.getMPH());
		
	}
	
	
}
	
	

