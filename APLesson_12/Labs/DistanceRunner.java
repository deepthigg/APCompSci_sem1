import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("x1");
		int xfirst = kb.nextInt();
		
		System.out.println("y1");
		int yfirst = kb.nextInt();
		
		System.out.println("x2");
		int xsecond = kb.nextInt();
		
		System.out.println("y2");
		int ysecond = kb.nextInt();
		
		
		Distance object = new Distance(xfirst, yfirst, xsecond, ysecond);
		System.out.println("distance = " + object.getDist());
		
		
		object.setValues(20, 49, 800, 650);
		System.out.println("This the set distance = " + object.getDist());
		
	}
}