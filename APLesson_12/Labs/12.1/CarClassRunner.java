import java.util.Scanner;
public class CarClassRunner
{
    public static void main(String[]args)
    {        
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the car's color");
        String paint = kb.next();
        System.out.println("What is the car's interior");
        String interior = kb.next();
        System.out.println("What is thecar's engine");
        String engine = kb.next();
        System.out.println("What is the car's tires");
        String tires = kb.next();
        
        CarClass object = new CarClass(paint, interior, engine, tires);
        System.out.println(object);
        
        object.setCustom("green", "cloth", "V4", "regular");
		
		System.out.println(object.toString());
    }        
}   