public class Lesson_4
{
	public static void main(String[]args)
	{
		Lesson_4 form = new Lesson_4();
		
		String word1= "blaah";
		double number1= 444464.6785;
		
		form.format(word1, number1);
		
		String word2 = "yessss";
		double number2 = 355439.8327498;
		form.format(word2, number2);
		
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f" ,word, number);
		
	}
	

}