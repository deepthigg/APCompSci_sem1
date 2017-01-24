public class HumanClass
{
	//instance variables
	private String hair, eyes, skin;
	
	//defalut values for instance variables
	public HumanClass()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	//Constrctor with params
	public HumanClass(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
		
	}
	
	//modifier

	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
		
	}
	
	//Accessors
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
	
	
}