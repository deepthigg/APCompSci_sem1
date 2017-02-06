public class Bill
{
	

	private String name;
	private double weight;
	private double value;

	public Money()
	{
		name = "";
		weight = 0;
		value = 0;
	
	}
	
	public Money(String n, double w, double v)
	{
		name = n;
		weight= w;
		value = v;
	
	}
	
	public String toString()
	{
		return "Weight:" + weight + "g/n" +
				"Your" + name + "is worth $" + value + "\n";
	}

	
}