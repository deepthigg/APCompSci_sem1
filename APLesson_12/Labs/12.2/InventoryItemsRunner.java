import java.util.Scanner;
public class InventoryItemsRunner
{
    public static void main(String[]args)
    {        
        Scanner kb = new Scanner(System.in);
		
		
		
		System.out.println("Item Name: ");
		String itemname = kb.next();
	
		System.out.println("Manufacturer Name: ");
		String Manufacturer = kb.next();
		
        System.out.println("Will you enter category and price ? ");
		String YorN = kb.next();
		
		InventoryItems item1 = new InventoryItems();
		
		if(YorN.equals("n"))
		{
			item1 = new InventoryItems(itemname, manufacturer); 
		}
		else
		{
			System.out.println("Cateory: ");
			String c = kb.next();
			System.out.println("Price: ");
			double p = kb.nextDouble();
			item1 = new InventoryItems(itemname, manufacturer, c, p);
		}
		System.out.println(item1.toString());
     
    }        
} 