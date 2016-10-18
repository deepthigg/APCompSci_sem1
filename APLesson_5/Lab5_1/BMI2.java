import java.util.Scanner;
public class BMI2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("what is your height in inches?");
		double h = kb.nextDouble();
		
		System.out.println("what is your weight in kilograms?");
		double w = kb.nextDouble();
		
		
		double BMI = (w *703) / (h * h) ;
		String condition = calcCondish(BMI);
		System.out.printf("You BMI is: %.3f " + BMI);
		System.out.println("You are:"+ condition);
		
	}
	public static void calcCondish(double BMI)
	{
		if (BMI < 18.5)
			return "Underweight";
		else if ( BMI < 24.9)
			return "Normal";
		else if ( BMI < 29.9)
			return "Overweight";
		else if ( BMI < 34.9)
			return "Obese";
		else if ( BMI < 39.9)
			return "Very Obese";
		else if ( BMI > 39.9)
			return "Moribidly Obese";
		
		return "";
		
	}
}