package com.cpg.lab7.exercise2;
import java.util.*; 
public class CollectionsNumOfOccur { 
	static void characterCount(char[] strArray ) 
	{ 
		HashMap<Character, Integer> charCountMap 
			= new HashMap<Character, Integer>(); 


		// checking each char of strArray 
		for (char c : strArray) { 
			if (charCountMap.containsKey(c)) { 

				// If char is present in charCountMap, 
				// incrementing it's count by 1 
				charCountMap.put(c, charCountMap.get(c) + 1); 
			} 
			else { 

				// If char is not present in charCountMap, 
				// putting this char to charCountMap with 1 as it's value 
				charCountMap.put(c, 1); 
			} 
		} 

		// Printing the charCountMap 
		for (Map.Entry entry : charCountMap.entrySet()) { 
			System.out.println(entry.getKey() + " : " + entry.getValue()); 
		} 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		char[] str = {'A','b','c','y','b','a'}; 
		characterCount(str); 
	} 
}