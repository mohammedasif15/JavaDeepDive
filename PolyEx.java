 
class PolyEx
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
    	PolyEx s = new PolyEx (); 
        System.out.println(s.sum(5, 2)); 
        System.out.println(s.sum(1, 2, 3)); 
        System.out.println(s.sum(10.5, 20.5)); 
    } 

}