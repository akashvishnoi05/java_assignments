package com.cpg.lab5.exercise1;
import java.util.*;
public class ExerciseOne {
	public static void main(String args[]){
        int choose;
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Select One of three Light: ");
        System.out.println("1    for  RED: ");
        System.out.println("2.   for  YELLOW: ");
        System.out.println("3.   for  GREEN: ");
        choose=sc.nextInt();
        
         
            switch(choose){
              case 1: 
                  System.out.println("STOP");
                  break;
              case 2: 
                  System.out.println("READY");
                  break;
              case 3: 
                  System.out.println("GO");
                  break;                             
              default:
                  System.out.println("");
                  break;                  
        }
            sc.close();
         
    }
	
}


