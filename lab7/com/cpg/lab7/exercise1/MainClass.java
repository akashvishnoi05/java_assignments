package com.cpg.lab7.exercise1;
import java.util.*;
import java.lang.*;
public class MainClass {
	
	  public static void main(String[] args) {
		  // creating a HashMap with object capitals
	        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();
	    
	        //putting value inside LinkedHAshMAp  by put function
	    
	        capitals.put("Nepal", "Kathmandu");
	        capitals.put("India", "New Delhi");
	        capitals.put("United States", "Washington");
	        capitals.put("England", "London");
	        capitals.put("Australia", "Canberra");
	        
	        SortMap obj = new SortMap();
	        Map<String, String> result =obj.sortMap(capitals);
	        
	        
	        for (Map.Entry<String, String> entry : result.entrySet())
	        {
	            System.out.print("Key: " + entry.getKey());
	            System.out.println(" Value: " + entry.getValue());
	        }
	    }

}
