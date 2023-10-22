package Collections_Java;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Colection {
	

	  public static void main(String[] args) {
	    // Creating an ArrayList
	    ArrayList<String> names = new ArrayList<>();
	   
	    // Adding elements to the ArrayList
	    
	    
	    names.add("D");
        names.add("C");
	    names.add("B");
	    names.add("A");
	
	 
	    for(String   st: names) {
	    	System.out.print(st);
	    }
	    
	    names.add(0, "F");
	     
	 	   
	      
	     System.out.println("=========================================");
	    
	   System.out.println(names);
	    
	     Collections.sort(names);
	     
	    
	  }
	}

