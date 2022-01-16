import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();      
    hm.put(1,"Honey");    
    hm.put(2,"More");    
    hm.put(3,"Abd");   
     
    System.out.println("The elements are ");  
    for(Entry<Integer, String> m:hm.entrySet()){    
     System.out.println(m.getKey()+" "+m.getValue());    
     
    }
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
    map.put(101,"Asif");    
    map.put(102,"kini");    
    map.put(103,"Cena");       
    
    System.out.println("The elements are are ");  
    for(Entry l:map.entrySet()){    
     System.out.println(l.getKey()+" "+l.getValue());    
    }    

}
}
