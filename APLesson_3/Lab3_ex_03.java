import java.util.Scanner; //import Statement

public class Lab3_ex_02
{
	public static void main(String[]args);
	{
		//instantiate the new Scanner object "keyboard"
		Scanner kb = new Scanner(System.in);
	
	    //prompt for your user input
	    System.out.println("what is the length of your table in meters?");
	
	    int l = kb.nextint();
		
		System.out.println("what is the width of your table in meters?");
	
	    int w = kb.nextint();
		
		int rec = (l * w);
		
		System.out.println( The area of your table is" + rec);
	
		
	 
	
	}
	
	


}