package com.cpg.lab7.exercise1;
import java.util.*;

public class SortMap {
    public static void main(String[] args) {
    	 // creating a HashMap with object capitals
        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();
        
        
      //putting value inside LinkedHAshMAp  by put function
        capitals.put("Nepal", "Kathmandu");
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Australia", "Canberra");
        
      //giving object capitals in function sortMap     of MAp type  
        Map<String, String> result = sortMap(capitals);
        
     // print the sorted hashmap 
        for (Map.Entry<String, String> entry : result.entrySet())
        {
            System.out.print("Key: " + entry.getKey());
            System.out.println(" Value: " + entry.getValue());
        }
    }
    
    
    public static LinkedHashMap<String, String> sortMap(LinkedHashMap<String, String> map)
    {
    	// Create a list from elements of HashMap 
        List<Map.Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());
        
     // Sort the list  by map
        Collections.sort(capitalList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : capitalList)
        {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}