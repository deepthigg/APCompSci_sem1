public abstract class GameSystem
{

	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random()*7)+1;
	}
	
	public abstract String getController();
	
	public String getPlatform( )
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}