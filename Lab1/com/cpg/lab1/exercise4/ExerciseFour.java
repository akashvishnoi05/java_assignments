package com.cpg.lab1.exercise4;
import java.util.*;
public class ExerciseFour {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the No:");
		 int n = sc.nextInt();
		  System.out.println(powerOf2(n));
		  sc.close();
		 }
		 
		 private static boolean powerOf2(int n){
		  if(n<=0){
		   return false;
		  }
		   
		  while(n > 1){
		   if(n % 2 != 0){
		    return false;
		   }
		   n = n / 2;
		  }
		  return true;
		 }


}

	

