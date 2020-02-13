package com.cpg.lab3.exercise2;
import java.util.*;
public class ExerciseTwo {
	public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	     
	      String[] array = {"satyam","saty","astas"};
	      //System.out.println(convert(array));
	      for(String result:convert(array))
	    	  System.out.println(result); 
	      sc.close();
	      
	}
	public static String[] convert(String[] array){  
	      Arrays.sort(array);
	      //for(String r:array)
	    	//  System.out.println(r);
	      int size =array.length;
	      String rArray[] = new String[size];
	      if (size%2 == 0) {
	    	  for(int i=0;i<size/2;i++) 
	    		  rArray[i]=array[i].toUpperCase();
	    	  for(int i=size/2;i<size;i++)
	    		  rArray[i]=array[i].toLowerCase();
	    		  
	    	  }
	      else {
	    	  for(int i=0;i<(size+1)/2;i++) 
	    		  rArray[i]=array[i].toUpperCase();
	    	  for(int i=(size+1)/2;i<size;i++)
	    		  rArray[i]=array[i].toLowerCase();
	    		  
	    	  }
	      return rArray;
	}

}
