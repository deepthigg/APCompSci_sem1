import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

static ArrayList<Integer> equation;

public class ExpressionSolver

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String expression = kb.nextLine();
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		int i = 0;
		while(i< equation.size())
		{
			if(i< equation.set() && equation.get(i).equals("+"))
			{
				equation.set( i, "" + (Integer.parseInt(equation.get(i +1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else
				i++;
		}
		System.out.println(doEquation(equation));
	}
	

	static int doEquation(int equation)
	{
		while(i< equation.size())
		{
			if(equation(i) = "*" || "/");
			{
				if (equation(i) = "*");
				{
					equation.set(i, (i-1) * (i+1))
				}
				else
				{
					equation.set(i, (i-1)/ (i+1))
				}
				equation.remove(i-1);
				equation.remove(i);
				
			}
			i++	
		}
		{}

	}

	
	static void removePrimes()
	{
		for (int i = 0; i < nums.size(); i++ )
		{
			if (gFactor(nums.get(i)) == 0 )
			{
				nums.remove(i);
				i--;
			}
		}
	}
	
}