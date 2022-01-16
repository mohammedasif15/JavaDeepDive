
import java.util.*;

public class QueueEx
{
public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
locationsQueue.add("Banglore");
        		locationsQueue.add("Himachal");
        		locationsQueue.add("Delhi");
        		locationsQueue.add("Rajastan");
        		locationsQueue.add("Kota");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing First element : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}
