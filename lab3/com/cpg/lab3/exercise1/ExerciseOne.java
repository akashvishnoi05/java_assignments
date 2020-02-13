package com.cpg.lab3.exercise1;
import java.util.*;
public class ExerciseOne {
	public static void main(String args[]){  
		int array[]={1,2,5,6,3,2};  
  
		System.out.println("Second Smallest: "+getSecondSmallest(array));  
	}
		
	public static int getSecondSmallest(int[] array){  
		Arrays.sort(array);  
		return array[1];  
		}  

}
