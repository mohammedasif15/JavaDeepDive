import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collections1 {
public static void main(String[] args) {
	System.out.println("ArrayList");
	ArrayList<String> city=new ArrayList<String>();   
	city.add("Pune");
	city.add("Shimoga");
	city.add("Bangalore");
	city.add("HAryana");
      city.add("Delhi");    	
      System.out.println(city);  
     
      
      System.out.println("LinkedList");
      LinkedList<String> names=new LinkedList<String>();  
      names.add("Asif");  
      names.add("Anup");  
      names.add("Cold"); 
      Iterator<String> itr=names.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }    
      System.out.println("Vector");
      Vector<Integer> vector = new Vector();
      vector.add(10); 
      vector.add(20); 
      vector.add(30); 
      System.out.println(vector);
      
      System.out.println("HashSet");
      HashSet<Integer> set=new HashSet<Integer>();  
      set.add(11);  
      set.add(22);  
      set.add(33);
      set.add(44);
      System.out.println(set);



}

public static List<String> emptyList() {
	// TODO Auto-generated method stub
	return null;
}
}
