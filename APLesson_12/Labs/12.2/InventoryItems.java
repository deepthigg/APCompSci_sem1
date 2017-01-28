import java.util.Scanner;
public class InventoryItems
{
	private String Name;
	private String Manufacturer; 
	private String Category; 
	private int UPC;
	private double Itemprice;
	
	public InventoryItems()
    {
        Name = "";
		Manufacturer = "";
        Category = "";
		UPC = (int)(Math.random()*10000000);
		Itemprice = 0;
    }

    public InventoryItems(String n, String m)
    {   
        Name = n;
		Manufacturer = m;
        Category = "";
		UPC = (int)(Math.random()*10000000);
		Itemprice = 0;
    }
    
    public InventoryItems(String n, String m, String c, double i)
    {   
        Name = n;
		Manufacturer = m;
        Category = c;
		UPC = (int)(Math.random()*10000000);
		Itemprice = i;
		
    }
	
	  public String getName()
    {
        return Name;
    }
    
    public String getManufacturer()
    {
        return Manufacturer;
    }
    
    public String getCategory()
    {
        return Category;
    }
    
    public double getUPC()
    {
        return UPC;
    }
	
	public double getItemPrice()
    {
        return Itemprice;
    }
    
    public String toString()
    {
        return "Item name: " + Name+ 
               "\nManufacturer: " + Manufacturer+
               "\nUPC: " + UPC+
               "\nCategory: " + Category+
			   "\nPrice: " + Itemprice;
    }
    
    
    
}