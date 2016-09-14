import java.util.Scanner; //import Statement

public class Lab3_ex_02
{
	public static void main(String[]args)
	{
		
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
		
		//prompt for your user input
		System.out.println("what is your height in inches?");
		
		double h = kb.nextDouble();

	
		//prompt for your user input
		System.out.println("what is your weight in kilograms?");
		
		double w = kb.nextDouble();
		
		
		double calculation = (w *703) / (h * h) ;
	
		System.out.println("The BMI is " + calculation);
	
		
	
		
		
	}
}