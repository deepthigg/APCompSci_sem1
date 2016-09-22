import java.util.Scanner; 

public class Lab_4_Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the height of the box in inches?");
		double h = kb.nextDouble();
		
		System.out.println("What is the lenght of the box in inches?");
		double l = kb.nextDouble();
		
		System.out.println("What is the width of the box in inches?");
		double w = kb.nextDouble();
		
		
		Lab_4_Ex_04 box = new Lab_4_Ex_04();
	
		double vol= box.calcVol(w,h,l);
		System.out.printf(" The volume is cubic feet is %10.2f\n", vol);
	}
	
	public double calcVol(double w, double h, double l)
	{
		return (w * h* l)/ 1728.0;
	}
}