import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	public ToyStore(String toys)
	{
		loadToys(toys);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(",")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			
			Toy a = getThatToy(name);
			
			if(a == null) 
			{
				if(type.equals("AF")){
					toyList.add(new AFigure(name));
					System.out.println(toyList.get(i).getName());
				}
				if (type.equals("Car")){
					toyList.add(new Car(name));
					System.out.println(toyList.get(i));
				}
				
			}
			else
				a.setCount(a.getCount()+1);
			
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy b: toyList)
		{
			System.out.println(b.getName() + " " + nm);
			if(b.getName().equals(nm))
				return b;
		}
		return null;
	}
	/*
	public void getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_Value;
		for(Toy b : toyList)
		{
			if(max < b.getCourt())
			{
				max = b.getCount();
				name = b.getName();
			}
		}
		return name;
		
	}
	public  getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for (Toy a: toyList)
		{
			if(a.getType().equals("Cars"))
				cars++;
			else if(a.getType().equals("Action Figures"))
				figures++;
		}
		if(cars > figures)
			return "Cars";
		else if (figures > cars)
			return "Action Figure";
		else
			return "Equals amounts of action figures and cars!";
		
	}
	*/
	public String toString()
	{
		return toyList.toString();
	}

	

	
}
	

