public class lesson5p2
{
	public static void main(String[]args)
	{
		if(tOrF())
		{
			System.out.println("It is true!");
		}
		if(!tOrF())
		{
			System.out.println("It is false!");
		}
	}
	public static boolean tOrF()
	{
		return 8>= 5;
	}
}