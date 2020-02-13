package com.cpg.lab6.exercise8;

import java.util.Scanner;

public class PositiveString { 
	  
	// Function that checks whether  
	// the string is in alphabetical  
	// order or not  
	    static boolean isAlphabaticOrder(String s) { 
	        int n = s.length(); 
	  
	        for (int i = 1; i < n; i++) { 
	  
	            // if element at index 'i' is less  
	            // than the element at index 'i-1'  
	            // then the string is not sorted  
	            if (s.charAt(i) < s.charAt(i - 1)) { 
	                return false; 
	            } 
	        } 
	  
	        return true; 
	    } 
	  
	// Driver code  
	    static public void main(String[] args) { 
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the String:");
	        String s = sc.next(); 
	        // check whether the string is  
	        // in alphabetical order or not  
	        if (isAlphabaticOrder(s)) { 
	            System.out.println("Yes it is Positive String"); 
	        } else { 
	            System.out.println("No it is not a Positive String"); 
	        } 
	        sc.close();
	    } 
	} 