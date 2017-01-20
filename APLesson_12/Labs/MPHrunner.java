import java.util.Scanner;
public class MPHrunner
{
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