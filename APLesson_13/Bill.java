public class Bill
{
	

	private String name;
	private String face;
	private double value;

	public Money()
	{
		name = "";
		face = "";
		value = 0;
	
	}
	
	public Money(String n, String f, double v)
	{
		name = n;
		face= f;
		value = v;
	
	}
	
	public String toString()
	{
		return "Face:" + face + "g/n" +
				"Your" + name + "is worth $" + value + "\n";
	}

	
}