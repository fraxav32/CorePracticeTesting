package collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StingCount {
	public static void countFrequencies(String[] list) 
    { 
        // hashmap to store the frequency of element 
        Map<String, Integer> hm = new HashMap<String, Integer>(); 
  
        for (String i : list) { 
            Integer j = hm.get(i); 
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 
  
        // displaying the occurrence of elements in the arraylist 
        for (Map.Entry<String, Integer> val : hm.entrySet()) { 
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times"); 
        } 
        
     // displaying the specific occurrence of elements in the arraylist 
      /*  for (Map.Entry<String, Integer> val : hm.entrySet()) {
        	
        	if(val.getValue()==1) {
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times"); 
        	}
        }*/
    } 
  
    public static void main(String[] args) 
    { 
    	String s="element of energy only occur element of water";
    	String sp[]= s.split(" ");
    	countFrequencies(sp);
    }
}
