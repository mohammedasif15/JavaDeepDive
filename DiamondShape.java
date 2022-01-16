interface First 
{  
    default void show() 
    { 
        System.out.println("First Methode"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Second Methode"); 
    } 
}  
public class DiamondShape implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	DiamondShape ob = new DiamondShape(); 
        ob.show(); 
    } 
}
