import java.util.Scanner;
public class GPAcalc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Math Grade: ");
		String math= kb.next();
		System.out.println("English Grade: ");
		String english= kb.next();
		System.out.println("Science Grade: ");
		String science= kb.next();
		System.out.println("History Grade: ");
		String history= kb.next();
		System.out.println("Art Grade: ");
		String art= kb.next();
		System.out.println("PE Grade: ");
		String PE= kb.next();
		System.out.println("Dance: ");
		String dance= kb.next();
	
		double grades = calcGrades(math) + calcGrades(english) + calcGrades(science) + calcGrades(history) +calcGrades(art) + calcGrades(PE) + calcGrades(dance);
	
		double gpa = grades / 7;
		
		System.out.printf(" Your GPA is %.5f " + gpa);
	
	}
	public static double calcGrades(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("F"))
			return 0.0;
		else
			return 0.0;
	}
}