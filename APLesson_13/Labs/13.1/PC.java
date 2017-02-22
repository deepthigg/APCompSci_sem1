public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	public PC(String p)
	{
		super(p);
	}
	
	public String SystemInput()
	{
		return " Keyboard and Mouse";
	}
	
	public String toString()
    {
        return "Platform: " + super.getPlatform()+ 
               "\nSerial # " + super.getSerialNo()+
               "\nSystem Input: " + SystemInput();
			   
	}
	
}