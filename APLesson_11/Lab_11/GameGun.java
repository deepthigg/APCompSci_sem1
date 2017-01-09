import java.util.Scanner;
public class GameGun
{
	int bulletCount;;
	int CLIPSIZE = 16;
	int shotCount;
	String [] clip;
	 
	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new CLIPSIZE();
		resetClip();
		Scanner kb = new Scanner(System.in);
		
		while (bulletCount || shotCount > 0)
		System.out.println(" Action : ");
		String action = kb.nextLine();
		{
			if action = "R"
			{
				reload();
			}
			if action = "S"
			{
				System.out.println(shoot());

			}
			System.out.println( printClip());
			System.out.println("Out of Bullets");
	
		}
	
	}
	public static resetClip()
	{
		for(int i =0; i < clip.length; i++))
		{
			clip[i] = "[]"
		}
		
	}
	
	public static shoot()
	{
		if shotCount > 0
		{
			clip [shotCount - 1] = "[]"
			shotCount - 1;
			System.out.print("Boom!!");
		}
		System.out.println("Reload!!!");
	}
	
	public static reload()
	{
		if (bulletCount >= CLIPSIZE )
		{
			bulletCount - CLIPSIZE;
			shotCounttCount = CLIPSIZE;
		}
		else
		{
			shortCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i =0; i < shotCount.length; i++))
		{
			clip[i] = " * ";
		}
	
	}
	
	public static printClip()
	{
		
	}
	
}