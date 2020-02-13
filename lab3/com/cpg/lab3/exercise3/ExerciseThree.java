package com.cpg.lab3.exercise3;

public class ExerciseThree {
	public static void main(String args[]){	
	      
	      int array[]={12,32,45,56,63,72}; 
	      for(int result:getSorted(array))
	    	  System.out.println(result); 
	      
	      
	}
	      
	      public static int[] getSorted(int[] array){  
	      int size, reverse  =0;
	      size =array.length;
	   
	      int[] rArray= new int[size]; 
	      int rArrayCounter=0;
	      for(int arrayIndex =size-1;arrayIndex>=0;arrayIndex--)
	      {
	    	  while(array[arrayIndex]!=0){
	    		  int digit = array[arrayIndex] % 10;
	    		  reverse =  reverse  * 10 + digit;
	    		  array[arrayIndex]/=10;
	    		  
	    	  }
	    	  rArray[rArrayCounter]= reverse ;
	    	  reverse  = 0;
	    	  rArrayCounter++;
	      }
	    /*  System.out.println("Reverse String:");
	      for(int i:rArray)
		      System.out.println(i);
		      */
	      return rArray;

	}

}
